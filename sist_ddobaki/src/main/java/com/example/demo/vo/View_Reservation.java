package com.example.demo.vo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "view_reservation")
public class View_Reservation {
	@EmbeddedId
	private ReservationViewId id;
	
	private int place_weight;
	private int place_park;
	private int place_spa;
	private int place_meal;
	private int place_parking_price;
	private int place_spa_price;
	private int place_meal_price;
	
}


/*
create or replace view view_Reservation
as
select place_name, place_weight, room_name, place_park, place_spa, place_spa_price, place_meal, place_meal_price, place_parking_price
from place p, room r
where p.place_num = r.place_num;
*/