package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BoardImageService;
import com.example.demo.vo.Board;
import com.example.demo.vo.BoardImage;

import lombok.Setter;

@RestController
@Setter

public class BoardImageController {
	@Autowired
	private BoardImageService bis;
	
	@GetMapping("/listBoardImage")
	public List<BoardImage> listBoardImage() {
		return bis.findAll();
	}
	
	//insertBoard.html에서 다 쓰면 여기로 와서 insert가 되는 것임 (폼태그 방식이 post니까)
	@PostMapping("/insertBoardImage")
	@ResponseBody
	public String insertOK(BoardImage bi) {
		bi.setBoard_image_num(bis.getNextBoardImageNum());
		bis.insert(bi);
		return "OK";
	}
}
