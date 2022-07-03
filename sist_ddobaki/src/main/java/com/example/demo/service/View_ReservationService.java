package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.View_ReservationDAO;
import com.example.demo.vo.View_Reservation;

import lombok.Setter;

@Service
@Setter
public class View_ReservationService {
	@Autowired
	private View_ReservationDAO dao;
	
	public List<View_Reservation> findAll() {
		return dao.findAll();
	}
}
