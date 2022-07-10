package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.dto.ReservationDTO;
import com.example.demo.service.PlaceService;
import com.example.demo.service.ReservationService;
import com.example.demo.service.RoomService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.Place;
import com.example.demo.vo.Reservation;
import com.example.demo.vo.Room;
import com.example.demo.vo.UserInfo;

import lombok.Setter;

@Controller
@Setter
public class ReservationController {

	
	@Autowired
	private ReservationService rs;
	
	@Autowired
	private UserInfoService us;
	
	@Autowired
	private PlaceService ps;
	
	@Autowired
	private RoomService roomS;
	

	
	//reservation 목록
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
	
	
	//예약 insert할 때 user_num, place_num 받아오기
	@GetMapping("insertReservation/{user_num}/{place_num}")
	public String insert(Model model, @PathVariable int user_num, @PathVariable Integer place_num) {
		model.addAttribute("us", us.getUser(user_num));
		model.addAttribute("ps", ps.getPlace(place_num));
		model.addAttribute("roomS", roomS.findByPlaceNum(place_num));
		model.addAttribute("reservation_num", rs.getNextReservationNum()); //예약번호 자동
		//model.addAttribute("reservationRoom", rs.findByReservationRoom(place_num));
		//model.addAttribute("reservation_list", rs.findAll()); //reservation list 전체 유지
		return "insertReservation";
	}
	
	
	//insert 버튼 누른 후 예약정보 가져옴
	@PostMapping("/saveReservation")
	public ModelAndView save(ReservationDTO r) {
		

		System.out.println("예약 정보: " + r );
		//dto에서 reservation entity로 변환
		Reservation rv = r.toReservationEntity();
		rs.save(rv);
		ModelAndView mav = new ModelAndView();
		
		mav.setView(new RedirectView("/listReservation"));
		return mav;
	}
		


	
	@GetMapping("/findByUserNum/{user_num}")
	@ResponseBody
	public List<Reservation> findByUserNum(@PathVariable int user_num) {
		return rs.findByUserNum(user_num);
	}
	
	
//	@GetMapping("/findByReservationRoom/{reservation_num}")
//	@ResponseBody
//	public List<Reservation> findByReservationRoom(@PathVariable int reservation_num) {
//		return rs.findByReservationRoom(reservation_num);
//	}
//	
//	//예약된 날짜의 예약 정보 가져오기
//	@GetMapping("/find")
//	@ResponseBody
//	public List<Reservation> find() {
//		return rs.findByReservationCheckinDateBetween("2022-08-13", "2022-08-15");
//	}
//	
//	//3, 7번을 뺀 모든 방 출력
//	@GetMapping("/view")
//	@ResponseBody
//	public List<ViewRoom> view() {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(7);
//		return vrs.findByRoomNumNotIn(list);
//	}

	
}
