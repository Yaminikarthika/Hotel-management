package com.hotel.rooms.service;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.Types;
public interface RoomTypeService {

	public List<Types> getRoomTypeList() throws HotelException;
}
