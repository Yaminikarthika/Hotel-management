package com.hotel.rooms.service;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.RoomAuditHistory;

public interface RoomAuditHistoryService {
	
	List<RoomAuditHistory> getRoomAuditHistory()throws HotelException;
	
	List<RoomAuditHistory> getRoomAuditHistoryByDate()throws HotelException;
}
