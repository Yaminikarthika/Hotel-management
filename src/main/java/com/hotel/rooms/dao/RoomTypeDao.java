package com.hotel.rooms.dao;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.Types;

public interface RoomTypeDao {

	public List<Types> fetchRoomTypeList() throws HotelException;
}
