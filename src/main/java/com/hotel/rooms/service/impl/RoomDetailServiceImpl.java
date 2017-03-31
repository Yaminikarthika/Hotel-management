package com.hotel.rooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.RoomAuditHistoryDao;
import com.hotel.rooms.dao.RoomDetailDao;
import com.hotel.rooms.model.Room;
import com.hotel.rooms.model.RoomAuditHistory;
import com.hotel.rooms.service.RoomDetailService;



@Service(value="roomDetailService")
public class RoomDetailServiceImpl implements RoomDetailService{

	
	@Autowired
	private RoomDetailDao roomDetailDao;
	
	@Autowired
	private RoomAuditHistoryDao roomAuditDaoImpl;
	@Override
	public List<Room> getRoomDetail() throws HotelException {
		System.out.println("inside ROOMDetail DAOImpl");
		return processRooms(roomDetailDao.fetchAllRoomDetail());
	}
	
	public List<Room> getRoomDetail(String name) throws HotelException {
		System.out.println("inside ROOMDetail DAOImpl");
		return processRooms(roomDetailDao.fetchAllRoomDetail(name));
	}
	
	public List<Room> processRooms(List<Room> rooms) throws HotelException{
		
		System.out.println("process room detail ");
		List<RoomAuditHistory> historyList=roomAuditDaoImpl.fetchRoomAuditHistoryByDate();
		System.out.println(historyList);
		for(RoomAuditHistory historyObj:historyList){//roomNoFk
			int roomFK=historyObj.getRoomNoFk();
			for(Room roomObj:rooms){//id
				if(roomObj.getNumber()==roomFK){
					roomObj.setOccupied(true);
				}
			}
			
		}
		return  rooms;
		
	}

	@Override
	public List<Room> getRoomDetailById(int id) throws HotelException {
		// TODO Auto-generated method stub
		return processRooms(roomDetailDao.fetchRoomDetailById(id));
	}

}
