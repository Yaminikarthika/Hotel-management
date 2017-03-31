package com.hotel.rooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.RoomAuditHistoryDao;
import com.hotel.rooms.json.RoomsAuditHistory;
import com.hotel.rooms.model.RoomAuditHistory;
import com.hotel.rooms.service.RoomAuditHistoryService;

@Service(value="roomAuditServiceImpl")
public class RoomAuditHistoryServiceImpl implements RoomAuditHistoryService {

	@Autowired
	private RoomAuditHistoryDao roomAuditDaoImpl;
	@Override
	public List<RoomAuditHistory> getRoomAuditHistory() throws HotelException {
		// TODO Auto-generated method stub
		return roomAuditDaoImpl.fetchAllRoomAuditHistory();
	}
	@Override
	public List<RoomAuditHistory> getRoomAuditHistoryByDate()
			throws HotelException {
		// TODO Auto-generated method stub
		return roomAuditDaoImpl.fetchRoomAuditHistoryByDate();
	}
	
	

}
