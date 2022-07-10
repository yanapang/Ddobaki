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
	
	public void save(Board b) {
		dao.save(b);
	}

	public List<Board> findAll() {
		return dao.findAll();
	}
	
	public void insert(Board b) {
		dao.insert(b);
	}
	
	public Board findByPostNum(int post_num) {
		return dao.findByPostNum(post_num);
	}
	
	public List<Board> goCategory(int board_num) {
		return dao.goCategory(board_num);
	}
		
	public Board detailPost(int board_num,int post_num) {
		return dao.detailPost(board_num,post_num);
	}

	public Board findById(int post_num) {
		return dao.findByPostNum(post_num);
	}
	
	public void plusPostHit(int post_num) {
		dao.plusPostHit(post_num);
	}
}