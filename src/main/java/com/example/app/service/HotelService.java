package com.example.app.service;

import java.util.List;

import com.example.app.model.Hotel;

public interface HotelService {

	void addRoom(Hotel hotel);

	List<Hotel> getRooms();

}
