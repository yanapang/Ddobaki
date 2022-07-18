package com.example.demo.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Reply;
import com.example.demo.vo.UserInfo;

@Repository
public interface UserInfoDAO extends JpaRepository<UserInfo, Integer> {
	
	@Query(value="select * from UserInfo where user_id=:user_id", nativeQuery=true)
	public UserInfo findByUser_id(String user_id);
	
	@Query(value="select nvl(max(user_num),0)+1 from UserInfo", nativeQuery=true)
	public int getNextUserNum();
	
//	@Transactional
//	@Query(value="insert into UserInfo u(u.user_num, u.user_id, u.user_file, u.user_nick, u.user_pwd, u.user_phone, u.user_role) values(:#{#u.user_num}, :#{#u.user_id}, :#{#u.user_file}, :#{#u.user_nick}, :#{#u.user_pwd},"
//			+ " :#{#u.user_phone}, :#{#u.user_role})", nativeQuery=true)
//	@Modifying
//	public void insertUser(@Param("user") UserInfo user);
}

