package com.example.demo.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Data
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_num;
	
	@Column(nullable = false)
	private Date payment_date;
	
	//참조 받아야 하는 키
	//reservation_num, user_num
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "user_num", insertable = true, updatable = true)
	private UserInfo userinfo;
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name = "reservation_num", insertable = true, updatable = true)
	private Reservation reservation;

}

