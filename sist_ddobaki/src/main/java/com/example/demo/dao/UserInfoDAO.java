package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.UserInfo;

@Repository
public interface UserInfoDAO extends JpaRepository<UserInfo, Integer> {
	
	@Modifying
	@Transactional
	@Query(value="delete UserInfo where user_num=:user_num",nativeQuery=true)
	public void deleteByUserNum(int user_num);


}

