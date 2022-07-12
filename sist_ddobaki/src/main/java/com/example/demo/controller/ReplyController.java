package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

//	@GetMapping("/listReplyByPostNum")
//	public ModelAndView listReply(int post_num, Model model) {
//		ModelAndView mav=new ModelAndView("detailBoard");
//		model.addAttribute("reply_list", rps.findByPostNum(post_num));
//		return mav;
//	}

	@RequestMapping(value = "/insertReplyOK", method = RequestMethod.POST)
	public String insertReplyOK(int post_num, int user_num, Reply rp) {
		System.out.println("댓글ok컨트롤러 옴");
		System.out.println("해당 댓글의 게시글 넘버 :" + post_num);
		System.out.println("해당 댓글의 작성자 넘버 :" + user_num);
		rp.setReply_num(rps.getNextReplyNum());
		// rp.getUserinfo()
		rps.insertReply(rp, user_num, post_num);
		return "redirect:/firstListBoard";
	}

//	@RequestMapping(value="/insertReReply/{reply_num}", method=RequestMethod.POST)
//	public void insertReReply(@PathVariable int reply_num, Model model) {
//		//ModelAndView mav=new ModelAndView("detailPost");
//		System.out.println("대댓글 입력 컨트롤러 옴");
//		model.addAttribute("reply_group", reply_num);
//		System.out.println("대댓글의 그룹이 될 부모댓글의 넘버:"+reply_num);
//		//return mav;
//	}

	@RequestMapping(value = "/insertReReplyOK", method = RequestMethod.POST)
	public String insertReReplyOK(int post_num, int user_num, int reply_num, Reply rp) {
		System.out.println("대댓글ok컨트롤러 옴");
		System.out.println("대댓글ok컨트롤러로 온 부모댓글의 넘버:" + reply_num);
		System.out.println("해당 댓글의 게시글 넘버 :" + post_num);
		System.out.println("해당 댓글의 작성자 넘버 :" + user_num);
		rp.setReply_num(rps.getNextReplyNum());
		rp.setReply_group(reply_num);
		rp.setReply_step(rps.getNextReplyStepByReplyGroup(reply_num));
		// rp.getUserinfo()
		rps.insertReReply(rp, user_num, post_num, reply_num);
		return "redirect:/firstListBoard";
	}
}