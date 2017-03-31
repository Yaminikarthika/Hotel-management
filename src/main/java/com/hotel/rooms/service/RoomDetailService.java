package com.hotel.rooms.service;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.Room;



public interface RoomDetailService {

	List<Room> getRoomDetail()throws HotelException;
	
	List<Room> getRoomDetailById(int id)throws HotelException;
	
	 List<Room> getRoomDetail(String name) throws HotelException;
	
	
}
