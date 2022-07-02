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
	
	public List<Board> findAll(){
		return dao.findAll();
	}
	
	public List<Board> findByUserNum(int user_num){
		return dao.findByUserNum(user_num);
	}
	
	public Board findByPostNum(int post_num) {
		return dao.findByPostNum(post_num);
	}
	/*
	@Autowired
	private BoardDAO dao;
	
	//우선 일단 입력을 위한 서비스부터 작성
	public int getNextPostNum() {
		return dao.getNextPostNum();
	}
	
	public void save(Board b) {
		dao.insert(b);
	}
	*/
	

	
	
	
}
