package com.example.demo.controller;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public String insert(SignUpDTO signupDto) throws IOException {
		UserInfo user=signupDto.toEntity();
		if(signupDto.getUserFile() != null) {
			try {
				MultipartFile uploadFile = signupDto.getUserFile();
				String fname=uploadFile.getOriginalFilename();
				UUID uuid = UUID.randomUUID();
				String fileName = uuid+fname.substring(fname.lastIndexOf("."));
                File converFile = new File("/Users/feelj/userImage", fileName);
                uploadFile.transferTo(converFile);  //--- 저장할 경로를 설정 해당 경로는 각자 원하는 위치로 설정하면 됩니다. 다만, 해당 경
				user.setUser_file(fileName);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			user.setUser_file("");
		}
		us.save(user);
		return "redirect:/myPage";
	}
}
