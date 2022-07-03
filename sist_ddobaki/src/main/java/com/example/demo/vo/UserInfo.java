package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.Data;

@Entity
@Data
@Table(name="userinfo")
public class UserInfo {
	@Id
	private int user_num;
	//@JsonIgnore
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_id;
	//@JsonIgnore
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_pwd;
	//@JsonIgnore
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_nick;
	//@JsonIgnore
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_phone;	
	//@JsonIgnore
	@Column(columnDefinition="varchar2(3000) default 'default.jpg'", nullable = false)
	private String user_file;
	
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Dog> dog;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Board> board;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reply> reply;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Plan> plan;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	private List<Dibs> dibs;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reservation> reservation;
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Payment> payment;
	
	/* Service 사용시 주석 풀어서 사용!
	@OneToMany(mappedBy="userinfo", fetch=FetchType.EAGER)
	private List<Service> service;
	*/
	
	
}
