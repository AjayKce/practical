package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.model.Hotel;
import com.example.app.service.HotelService;

@Controller
public class AppController {

	@Autowired
	HotelService service;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/create")
	public String create(Model theModel){
		theModel.addAttribute("hotel",new Hotel());
		return "create";
	}
	
	@RequestMapping("/processCreateHotel")
	public String processCreateHotel(@ModelAttribute("hotel")Hotel hotel){
		service.addRoom(hotel);
		return "redirect:/";
	}
	
	@RequestMapping("/list")
	public String list(Model theModel){
		theModel.addAttribute("list",service.getRooms());
		return "list";
	}
	
}
