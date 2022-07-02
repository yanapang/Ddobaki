package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReplyDAO;
import com.example.demo.vo.Board;
import com.example.demo.vo.Reply;

import lombok.Setter;

@Service
@Setter
public class ReplyService {
	@Autowired
	private ReplyDAO dao;
	
	public int getNextReplyNum() {
		return dao.getNextReplyNum();
	}

	public List<Reply> findAll() {
		return dao.findAll();
	}
	
	public void insertReply(Reply rp) {
		dao.insertReply(rp);
	}
}
