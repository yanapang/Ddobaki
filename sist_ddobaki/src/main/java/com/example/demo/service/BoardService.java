package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.vo.Board;

import lombok.Setter;

@Service
@Setter
public class BoardService {
	@Autowired
	private BoardDAO dao;

	public int getNextPostNum() {
		return dao.getNextPostNum();
	}

	public List<Board> findAll() {
		return dao.findAll();
	}
	
	public void insert(Board b) {
		dao.insert(b);
	}
}