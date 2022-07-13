package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BoardService;
import com.example.demo.service.ReplyService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.Reply;

import lombok.Setter;

@Controller
@Setter
public class ReplyController {
	
	@Autowired
	private ReplyService rps;
	
	@Autowired
	private BoardService bs;
	
	@Autowired
	private UserInfoService uis;
	
	@RequestMapping(value="/insertReplyOK",method=RequestMethod.POST)
    public String insertReplyOK(int board_num, int post_num, int user_num, Reply rp){
       System.out.println("댓글ok컨트롤러 옴");
       System.out.println("해당 댓글의 게시글 넘버 :"+post_num);
       System.out.println("해당 댓글의 작성자 넘버 :"+user_num);
       int rp_num=rps.getNextReplyNum();
       rp.setReply_num(rp_num);
       //rp.getUserinfo()
       rp.setReply_group(rp_num);
       System.out.println(rp.toString());
       rps.insertReply(rp,user_num,post_num);
       return "redirect:/detailPost/"+board_num+"/"+post_num;
   }
	
	@RequestMapping(value="/insertReReply/{reply_group}", method=RequestMethod.GET)
	public void insertReReply(@PathVariable int reply_group, Model model) {
		System.out.println("대댓글 입력 컨트롤러 옴!!!");
		model.addAttribute("reply_group_num", reply_group);
		System.out.println("대댓글의 그룹이 될 부모댓글의 그룹넘버:"+reply_group);

	}
	
	@RequestMapping(value="/insertReReplyOK/{reply_group}",method=RequestMethod.POST)
    public String insertReReplyOK(Reply rp, int user_num, int post_num, @PathVariable int reply_group, int board_num){
       System.out.println("대댓글ok컨트롤러 옴");
       System.out.println("대댓글ok컨트롤러로 온 부모댓글의 그룹넘버:"+reply_group);
       rp.setReply_num(rps.getNextReplyNum());
       rp.setReply_group(reply_group);
       rp.setReply_step(rps.getNextReplyStepByReplyGroup(reply_group));
       rp.setBoard(bs.findById(post_num));
       rp.setUserinfo(uis.getUser(user_num));
       System.out.println("대댓글 작성자 이름:"+rp.getUserinfo().getUser_nick());
       System.out.println("해당 게시글 번호:"+rp.getBoard().getPost_num());
       rp.setReply_level(1);
       rps.insertReReply(rp,user_num,post_num,reply_group);
       return "redirect:/detailPost/"+board_num+"/"+post_num;
   }
}
