package com.example.demo.dto;

import com.example.demo.vo.UserInfo;

import lombok.Data;

@Data
public class SignUpDto {
	private String user_id;
    private String user_pwd;
    private String user_nick;
    private String user_phone;

    public UserInfo toEntity() {
        return UserInfo.builder()
                .user_id(user_id)
                .user_pwd(user_pwd)
                .user_nick(user_nick)
                .user_phone(user_phone)
                .build();
    }
}