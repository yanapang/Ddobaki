package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BoardService;
import com.example.demo.vo.Board;

import lombok.Setter;

@RestController
@Setter
public class BoardController {
	@Autowired
	private BoardService bs;

	@GetMapping("/listBoard")
	public List<Board> listBoard() {
		return bs.findAll();
	}
	
//	@GetMapping("/insertBoard")
//	public void insert(Model model) {
//		//겟방식으로 이게 오면 새로운 주문번호까지 상태유지함 !!! 우리가 이걸 써먹어야함~!!!!!!!!!!!!꼭 기억하고 있기
//		model.addAttribute("post_num", bs.getNextPostNum());
//	}
	
	
	//insertBoard.html에서 다 쓰면 여기로 와서 insert가 되는 것임 (폼태그 방식이 post니까)
	@PostMapping("/insertBoard")
	@ResponseBody
	public String insertOK(Board b) {
		b.setPost_num(bs.getNextPostNum());
		bs.insert(b);
		return "OK";
	}
	
}
