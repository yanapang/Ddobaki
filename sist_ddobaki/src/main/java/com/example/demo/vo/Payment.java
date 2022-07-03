package com.example.demo.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment {
	@Id
	private int payment_num;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date payment_date;
	
	//참조 받아야 하는 키
	//reservation_num, user_num
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_num", insertable = true, updatable = true)
	private UserInfo userinfo;
	
	@OneToOne
	@JoinColumn(name = "reservation_num", insertable = true, updatable = true)
	private Reservation reservation;
	
	
	
}
