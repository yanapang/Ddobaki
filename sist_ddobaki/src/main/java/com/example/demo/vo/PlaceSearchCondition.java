package com.example.demo.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class PlaceSearchCondition {
private int	place_region_num;
	
	private int	place_type_num;	
	
	private String place_name;
	
	private int	place_park;	
	
	private int	place_spa;
	
	private int	place_meal;	
	
	private int	place_weight;
	
	private String place_array;

	public int getPlace_region_num() {
		return place_region_num;
	}

	public void setPlace_region_num(int place_region_num) {
		this.place_region_num = place_region_num;
	}

	public int getPlace_type_num() {
		return place_type_num;
	}

	public void setPlace_type_num(int place_type_num) {
		this.place_type_num = place_type_num;
	}

	public String getPlace_name() {
		return place_name;
	}

	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}

	public int getPlace_park() {
		return place_park;
	}

	public void setPlace_park(int place_park) {
		this.place_park = place_park;
	}

	public int getPlace_spa() {
		return place_spa;
	}

	public void setPlace_spa(int place_spa) {
		this.place_spa = place_spa;
	}

	public int getPlace_meal() {
		return place_meal;
	}

	public void setPlace_meal(int place_meal) {
		this.place_meal = place_meal;
	}

	public int getPlace_weight() {
		return place_weight;
	}

	public void setPlace_weight(int place_weight) {
		this.place_weight = place_weight;
	}

	public String getPlace_array() {
		return place_array;
	}

	public void setPlace_array(String place_array) {
		this.place_array = place_array;
	}
	

	@Override
	public String toString() {
		return "PlaceSearchCondition [place_region_num=" + place_region_num + ", place_type_num=" + place_type_num
				+ ", place_name=" + place_name + ", place_park=" + place_park + ", place_spa=" + place_spa
				+ ", place_meal=" + place_meal + ", place_weight=" + place_weight + ", place_array=" + place_array
				+ "]";
	}
	
	
	
	
}