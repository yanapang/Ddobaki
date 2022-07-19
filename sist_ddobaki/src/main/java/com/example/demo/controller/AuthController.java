package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.SignUpDto;
import com.example.demo.service.AuthService;
import com.example.demo.vo.UserInfo;

import lombok.RequiredArgsConstructor;
@Controller

@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService as;
	
	//회원가입 폼
		@RequestMapping(value="/signUp", method=RequestMethod.GET)
		public String signUpForm() {
			System.out.println("회원가입 폼 왔다");
			return "signUp";
		}

		@PostMapping("/signUp")
		public void signUpOK(SignUpDto signupDto) {
			System.out.println("회원가입ok폼 왔다");
			UserInfo user =signupDto.toEntity();
			UserInfo userEntity = as.signup(user);
			//return "redirect:/login";
		}
		
		@RequestMapping(value="/login", method=RequestMethod.GET)
		public String loginForm() {
			System.out.println("로그인 폼 왔다.");
			return "login";
		}
		
		@RequestMapping(value="/login", method=RequestMethod.POST)
		public String loginOK(LoginDto loginDto) {
			System.out.println("로그인OK");
			return "main";
		}
		
		
		 /**
	     * 유저 페이지
	     * @param model
	     * @param authentication
	     * @return
	     */
	    @GetMapping("/")
	    public String userAccess(Model model, Authentication authentication) {
	        //Authentication 객체를 통해 유저 정보를 가져올 수 있다.
	        UserInfo user = (UserInfo)authentication.getPrincipal();  //userDetail 객체를 가져옴
	        model.addAttribute("user", user);      //유저 아이디
	    	return "user_access";
	    }
}
