package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReservationDAO;
import com.example.demo.vo.Reservation;
import com.example.demo.vo.View_Reservation;

import lombok.Setter;

@Service
@Setter
public class ReservationService {
	
	@Autowired
	private ReservationDAO dao;
	
//	public int getNextReservationNum() {
//		return dao.getNextReservationNum();
//	}
	
	public List<Reservation> findAll() {
		return dao.findAll();
	}
	
//	public void insert(Reservation r) {
//		dao.insert(r);
//	}
	
	public Reservation getReservation(int reservation_num) {
		return dao.getOne(reservation_num);
	}

}
