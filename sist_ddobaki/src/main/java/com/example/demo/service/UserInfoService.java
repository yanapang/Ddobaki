package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoDAO;
import com.example.demo.vo.UserInfo;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Service
@Setter
@RequiredArgsConstructor
public class UserInfoService {
	@Autowired
	private UserInfoDAO dao;
	
	public List<UserInfo> findAll(){
		return dao.findAll();
	}
	
	public UserInfo getUser(int user_num) {
		return dao.findById(user_num).get();
	}
	
	public int getNextUserNum() {
		return dao.getNextUserNum();
	}

	public void deleteUser(int user_num) {
		dao.deleteByUserNum(user_num);
	}
	
	public UserInfo findByUser_id(String user_id) {
		return dao.findByUser_id(user_id);
	}
	
}