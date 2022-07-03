package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PaymentService;
import com.example.demo.vo.Payment;

import lombok.Setter;

@RestController
@Setter
public class PaymentController {
	@Autowired
	private PaymentService ps;
	
	@GetMapping("/listPayment")
	public List<Payment> list() {
		return ps.findAll();
	}
}
