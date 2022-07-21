package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.SignUpDTO;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.UserInfo;

import lombok.Setter;

@Controller
@Setter
public class UserInfoController {
	@Autowired
	private UserInfoService us;
	
	
	@GetMapping("/listUser")
	@ResponseBody
	public List<UserInfo> list() {
		return us.findAll();
	}
	
	@ResponseBody
    @GetMapping("/getUser/{user_num}")
    public UserInfo getUser(@PathVariable int user_num) {
        UserInfo userInfo = us.getUser(user_num);
        return userInfo;
    }
	
//	@PostMapping("/updateUser")
//	public String insert(UserInfo u) {
//		us.save(u);
//		return "redirect:/myPage";
//	}
	
	@PostMapping("/updateUserInfo")
	public String insert(UserInfo user) throws IOException {
		us.save(user);
		return "redirect:/myPage";
	}
	
	

}
