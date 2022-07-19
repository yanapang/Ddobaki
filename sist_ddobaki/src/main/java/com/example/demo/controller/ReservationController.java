package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ReservationService;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.View_ReservationService;
import com.example.demo.vo.Reservation;

import lombok.Setter;

@RestController
@Setter
public class ReservationController {
	@Autowired
	private View_ReservationService vrs;
	
	@Autowired
	private ReservationService rs;
	
	@Autowired
	private UserInfoService us;
	
	@GetMapping("listReservation")
	@ResponseBody
	public List<Reservation> list() {
		return rs.findAll();
	}
	
	//예약한 reservation_num으로 가져오기
	@GetMapping("/getReservation/{reservation_num}") //uri로 데이터를 전달하는 방식
	@ResponseBody
	public String getReservation(@PathVariable int reservation_num, Model model) { //상태유지 하고 수정
		model.addAttribute("r", rs.getReservation(reservation_num));
		return "OK";
	}
	
	
//	@GetMapping("/listReservation/{user_num}")
//	public List<Reservation> findByUserNum(@PathVariable int user_num) {
//		return rs.findByUserNum(user_num);
//	}
	
//	@GetMapping("/insertReservation")
//	public void insert(Model model) { //상태유지
//		model.addAttribute("r_list", rs.findAll()); //룸목록을 상태유지
//		model.addAttribute("p_list", ps.findAll()); //장소목록 상태유지
//		model.addAttribute("num", os.getNextNo()); //새로운 주문번호를 상태유지
//	}
//	
//	@GetMapping("/listReservation_view")
//	@ResponseBody
//	public void listReservation_view(Model model) {
//		model.addAttribute("list", vrs.findAll());
//	}
}
