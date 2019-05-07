package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Hotel;
import com.example.app.repository.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {

@Autowired
HotelRepo repo;

@Override
public void addRoom(Hotel hotel) {
	repo.save(hotel);
}

@Override
public List<Hotel> getRooms() {
	return repo.findAll();
}
	
}
