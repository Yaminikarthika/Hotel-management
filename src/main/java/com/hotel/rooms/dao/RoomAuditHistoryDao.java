package com.hotel.rooms.dao;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.rooms.json.RoomsAuditHistory;
import com.hotel.rooms.model.RoomAuditHistory;

public interface RoomAuditHistoryDao {
	
	public List<RoomAuditHistory> fetchAllRoomAuditHistory()throws HotelException;
	
	public List<RoomAuditHistory> fetchRoomAuditHistoryByDate()throws HotelException;
}
