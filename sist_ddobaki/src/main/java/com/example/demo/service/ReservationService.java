package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReservationDAO;
import com.example.demo.vo.Reservation;

import lombok.Setter;

@Service
@Setter
public class ReservationService {
	
	@Autowired
	private ReservationDAO dao;
	
	
	
	//예약번호 자동으로 받아오기
	public int getNextReservationNum() {
		return dao.getNextReservationNum();
	}
	
	//예약 리스트 전체 출력
	public List<Reservation> findAll() {
		return dao.findAll();
	}
	
	//예약 insert
	public void save(Reservation r) {
		dao.save(r);
	}
	
	//아이디로 예약 1개 리턴
	public Reservation getReservation(int reservation_num) {
		return dao.findById(reservation_num).get();
	}

	public List<Reservation> findByUserNum(int user_num) {
		return dao.findByUserNum(user_num);
	}
	

}
