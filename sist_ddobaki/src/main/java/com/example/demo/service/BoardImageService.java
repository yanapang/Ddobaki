package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardImageDAO;
import com.example.demo.vo.Board;
import com.example.demo.vo.BoardImage;

import lombok.Setter;

@Service
@Setter
public class BoardImageService {
	@Autowired
	private BoardImageDAO dao;
	
	public int getNextBoardImageNum() {
		return dao.getNextBoardImageNum();
	}

	public List<BoardImage> findAll() {
		return dao.findAll();
	}
	
	public void insert(BoardImage bi) {
		dao.insert(bi);
	}
}
