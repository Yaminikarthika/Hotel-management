package com.hotel.rooms.dao;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.Room;


public interface RoomDetailDao {
	public List<Room> fetchAllRoomDetail()throws HotelException;
	
	public List<Room> fetchRoomDetailById(int id)throws HotelException;
	
	public List<Room> fetchAllRoomDetail(String name)throws HotelException;
	
	
}
