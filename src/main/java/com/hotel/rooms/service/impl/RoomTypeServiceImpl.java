package com.hotel.rooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.RoomDetailDao;
import com.hotel.rooms.dao.impl.RoomTypeDaoImpl;
import com.hotel.rooms.model.Room;
import com.hotel.rooms.model.Types;
import com.hotel.rooms.service.RoomDetailService;
import com.hotel.rooms.service.RoomTypeService;

@Service(value="roomTypeServiceImpl")
public class RoomTypeServiceImpl implements RoomTypeService {

	@Autowired
	RoomTypeDaoImpl roomTypeDaoImpl;
	
	@Autowired
	private RoomDetailDao roomDetailDao;
	
	@Autowired
	private RoomDetailService roomDetailService;
	
	@Override
	public List<Types> getRoomTypeList() throws HotelException {
		
		return processRoomType(roomTypeDaoImpl.fetchRoomTypeList());
	}
	
	public List<Types> processRoomType(List<Types> roomTypeList) throws HotelException{
		List<Room> roomdetailList=roomDetailService.getRoomDetail();
		
	
		for(Types type:roomTypeList){
			int occupiedCount = 0;
			int vacancyCount=0;
		for(Room room:roomdetailList){							
				if(type.getNumber()==room.getRoomTypeNum()){					
					if(room.isOccupied()){						
					occupiedCount++;					
					type.setOccupiedcount(occupiedCount);
					}
					else{
						vacancyCount++;
						type.setVacancyCount(vacancyCount);
					}
					
				}
				
			}
			
		}
		return roomTypeList;
		
	}
	
	

}
