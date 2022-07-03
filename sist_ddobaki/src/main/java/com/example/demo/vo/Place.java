package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="place")
public class Place {
	@Id
	private Integer place_num;
	
	@Column(nullable = false)
	private Integer	place_region_num;
	
	@Column(nullable = false)
	private Integer	place_type_num;	
	
	@Column(nullable = false)
	private String place_name;
	
	@Column(nullable = true)
	private String place_explain;
	
	@Column(nullable = false)
	private String place_addr;
	
	@Column(nullable = true)
	private String place_site;
	
	@Column(nullable = false, columnDefinition = "number default 0")
	private Integer	place_weight;
	
	@Column(nullable = true)
	private String place_tel;
	
	@Column(nullable = false, columnDefinition = "number default 0")
	private Integer	place_park;	
	
	@Column(nullable = false, columnDefinition = "number default 0")
	private Integer	place_spa;
	
	@Column(nullable = false, columnDefinition = "number default 0")
	private Integer	place_meal;	
	
	@Column(nullable = true)
	private Integer	place_park_price;
	
	@Column(nullable = true)
	private Integer	place_spa_price;
	
	@Column(nullable = true)
	private Integer	place_meal_price;
	
	@Column(nullable = false, columnDefinition = "varchar2(500) default 'default.jpg'")
	private String place_thumbnail;	
	
	@Column(nullable = true)
	private String place_detail;	
	
	@Column(nullable = false, columnDefinition = "number default 0")
	private Integer	place_hit;
	
	@Column(nullable = false)
	private String place_lat;
	
	@Column(nullable = false)
	private String place_lng;	
	
//	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE)
//	private List<Board> board;
	
//	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE)
//	private List<Dibs> dibs;
//	
//	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE )
//	private List<Reservation> reservation;
	
//	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE)
//	private List<Room> room;
//	
	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<PlaceImage> placeImage;
//	
//	@OneToMany(mappedBy="place", fetch=FetchType.EAGER, cascade = CascadeType.REMOVE)
//	private List<Plan> plan;
}
