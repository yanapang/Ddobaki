package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserInfoService;
import com.example.demo.vo.UserInfo;

import lombok.Setter;

@RestController
@Setter
public class UserInfoController {
	@Autowired
	private UserInfoService us;
	
	
	@GetMapping("/listUser")
	@ResponseBody
	public List<UserInfo> list() {
		return us.findAll();
	}
	
	@GetMapping("/getUser/{user_num}")
	public Optional<UserInfo> getUser(@PathVariable int user_num) {
		return us.getUser(user_num);
	}
}
