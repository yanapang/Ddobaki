package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.Data;

@Entity
@Data
@Table(name = "room")
public class Room {
	
	@Id
	private int room_num;
	
	@Column
	private int room_type_num;
	@Column(nullable = false)
	private int room_price;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="place_num", insertable=true, updatable=true)
	private Place place;
	
	@JsonIgnore
	@OneToMany(mappedBy = "room", cascade = CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reservation> reservation;
	
	//참조받아야 하는 키
	//place_num
}
