package com.example.demo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
@Table(name="dog")
public class Dog {
	@Id //PK
	private int dog_num;
	

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_num", insertable=true, updatable=true, nullable = false)
	private UserInfo userinfo;
	
	@Column(columnDefinition = "varchar2(3000)", nullable = false)
	private String dog_name;
	@Column(nullable = false)
	private int dog_age;
	@Column(nullable = false)
	private int dog_gender;	
	@Column(nullable = false)
	private int dog_desexed;
	@Column(nullable = false)
	private int dog_weight;

}

