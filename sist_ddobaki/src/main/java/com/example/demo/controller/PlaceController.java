package com.example.demo.controller;

import java.util.List;
import java.util.Optional;import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PlaceService;
import com.example.demo.vo.Place;

import lombok.Setter;

@RestController
@Setter
public class PlaceController {
	@Autowired
	private PlaceService ps;
	
	@GetMapping("/listPlace")
	@ResponseBody
	public List<Place> list(int place_num) {
		return ps.p(place_num);
	}
	
	@GetMapping("/getPlace/{place_num}")
	public Optional<Place> getPlace(@PathVariable int place_num) {
		return ps.getPlace(place_num);
	}
}
