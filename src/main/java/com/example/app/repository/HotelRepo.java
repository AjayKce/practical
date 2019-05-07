package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
