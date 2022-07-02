package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BoardService;
import com.example.demo.vo.Board;

import lombok.Setter;

@RestController
@Setter
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	/*확인완료
	@GetMapping("/listBoard")
	public void list(Model model) {
		model.addAttribute("list",boardService.findAll());
	}*/
	
	@GetMapping("/getPostByUserNum/{user_num}")
    public List<Board> findByUserNum(@PathVariable int user_num) {
        return boardService.findByUserNum(user_num);
    }
	
	@GetMapping("/getPostPostNum/{post_num}")
	public Board findByPostNum(@PathVariable int post_num) {
		return boardService.findByPostNum(post_num);
	}
	
	/* json으로 불러와지는지 확인 완료   restcontroller 사용
	@GetMapping("/listBoard")
	public List<Board> listBoard() {
		return boardService.findAll();
	}
	*/
	
	/*
	@Autowired
	private BoardService bs;
	
	@GetMapping("/insertBoard")
	public void insert(Model model) {
		//겟방식으로 이게 오면 새로운 주문번호까지 상태유지함 !!! 우리가 이걸 써먹어야함~!!!!!!!!!!!!꼭 기억하고 있기
		model.addAttribute("post_num", bs.getNextPostNum());
	}
	
	//insertBoard.html에서 다 쓰면 여기로 와서 insert가 되는 것임 (폼태그 방식이 post니까)
	@PostMapping("/insertBoard")
	@ResponseBody
	public String insertOK(Board b) {
		bs.save(b);
		return "OK";
	}
	*/

	
}
