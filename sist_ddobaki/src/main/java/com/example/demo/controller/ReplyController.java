package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ReplyService;
import com.example.demo.vo.BoardImage;
import com.example.demo.vo.Reply;

import lombok.Setter;

@RestController
@Setter
public class ReplyController {
	@Autowired
	private ReplyService rps;
	
	@GetMapping("/listReply")
	public List<Reply> listReply() {
		return rps.findAll();
	}
	
	//insertBoard.html에서 다 쓰면 여기로 와서 insert가 되는 것임 (폼태그 방식이 post니까)
	@PostMapping("/insertReply")
	@ResponseBody
	public String insertOK(Reply rp) {
		rp.setReply_num(rps.getNextReplyNum());
		rps.insertReply(rp);
		return "OK";
	}
}
