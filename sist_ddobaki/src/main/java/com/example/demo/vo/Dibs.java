package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="dibs")
public class Dibs {
	@Id//PK
	private int dib_num;
	
	
	//FK
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_num", insertable=true, updatable=true, nullable = false)
	private UserInfo userinfo;
	
	//FK
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="place_num", insertable=true, updatable=true, nullable = false)
	private Place place;
}