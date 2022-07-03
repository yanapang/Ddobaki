package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PaymentDAO;
import com.example.demo.vo.Payment;

import lombok.Setter;

@Service
@Setter
public class PaymentService {
	@Autowired
	private PaymentDAO dao;
	
	public List<Payment> findAll() {
		return dao.findAll();
	}
	
}
