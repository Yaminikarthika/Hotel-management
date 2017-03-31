package com.hotel.rooms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.exception.HotelException;
import com.hotel.rooms.model.Room;
import com.hotel.rooms.model.RoomAuditHistory;
import com.hotel.rooms.model.Types;
import com.hotel.rooms.service.RoomAuditHistoryService;
import com.hotel.rooms.service.RoomDetailService;
import com.hotel.rooms.service.RoomTypeService;



@RestController
public class Hotelcontroller {

	

	
	@Autowired
	RoomDetailService roomDetailService;
	
	@Autowired
	RoomAuditHistoryService roomAuditServiceImpl; 
	
	
	@Autowired
	RoomTypeService roomTypeServiceImpl;
	
	@CrossOrigin(origins="*", maxAge = 3600)
	@GetMapping(value="/Alllrooms")
	public ResponseEntity fetchRoom()throws HotelException
	{
		
		System.out.println("inside fetch room");
		List<Room> roomList=null;
		
		roomList=roomDetailService.getRoomDetail();		
		
		System.out.println("room :  "+roomDetailService.getRoomDetail());
		
		return new ResponseEntity(roomList, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	
	@GetMapping(value="/roomss/{id}")
	public ResponseEntity fetchRoomById(@PathVariable int id)throws HotelException
	{
		
		System.out.println("inside fetch room");
		List<Room> roomList=null;
		
		roomList=roomDetailService.getRoomDetailById(id);		
		
		System.out.println("room :  "+roomDetailService.getRoomDetailById(id));
		
		return new ResponseEntity(roomList, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@GetMapping(value="/fetchAuditHitory")
	public ResponseEntity<List<RoomAuditHistory>> fetchhotel() throws HotelException
	{
		System.out.println("inside fetch room");
		List<RoomAuditHistory> historyList=null;
		
		historyList=roomAuditServiceImpl.getRoomAuditHistoryByDate();		
		
	
		
		return new ResponseEntity(historyList, HttpStatus.OK);		
		
	}
	
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@GetMapping(value="/types")//roomTypes
	public ResponseEntity<List<Types>> fetchRoomType() throws HotelException
	{
		System.out.println("inside fetch room type");
		List<Types> roomTypeList=null;
		
		roomTypeList=roomTypeServiceImpl.getRoomTypeList();		
		
	
		
		return new ResponseEntity(roomTypeList, HttpStatus.OK);		
		
	}
	
	
@CrossOrigin(origins = "*", maxAge = 3600)
	
	@GetMapping(value="/rooms/{name}")
	public ResponseEntity fetchRoomByName(@PathVariable String name)throws HotelException
	{
		
		System.out.println("inside fetch room");
		List<Room> roomList=null;
		
		roomList=roomDetailService.getRoomDetail(name);		
		
		System.out.println("room :  "+roomDetailService.getRoomDetail(name));
		
		return new ResponseEntity(roomList, HttpStatus.OK);
	}
	
}
