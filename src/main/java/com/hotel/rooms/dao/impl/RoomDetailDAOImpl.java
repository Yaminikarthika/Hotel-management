package com.hotel.rooms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.AbstractHotelDao;
import com.hotel.rooms.dao.RoomDetailDao;
import com.hotel.rooms.model.Room;


@Repository(value="roomDetailDao")
public class RoomDetailDAOImpl extends AbstractHotelDao<Integer, Room> implements RoomDetailDao {

	public List<Room> fetchAllRoomDetail()throws HotelException{
		System.out.println("RoomDetailDAOImpl - fetchAllRoomDetail method starts");
		List<Room> roomJson = new ArrayList<Room>();
		Session session = null;
		//Transaction trans = null;
		Criteria cr = null;
		try
		{
			session = getSession();
		 session.beginTransaction();
			cr = session.createCriteria(Room.class);
			roomJson = cr.list();
			session.getTransaction().commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomDetailDAOImpl - fetchAllRoomDetail method ends");
		return roomJson;
	}
	
	public List<Room> fetchAllRoomDetail(String name)throws HotelException{
		System.out.println("RoomDetailDAOImpl - fetchAllRoomDetail method starts");
		List<Room> roomJson = new ArrayList<Room>();
		Session session = null;
		//Transaction trans = null;
		Criteria cr = null;
		try
		{
			session = getSession();
		 session.beginTransaction();
			cr = session.createCriteria(Room.class).add(Restrictions.eq("name", name));
			roomJson = cr.list();
			session.getTransaction().commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomDetailDAOImpl - fetchAllRoomDetail method ends");
		return roomJson;
	}

	@Override
	public List<Room> fetchRoomDetailById(int id) throws HotelException {
		System.out.println("RoomDetailDAOImpl - fetchRoomDetailById method starts");
		List<Room> roomJson = new ArrayList<Room>();
		Session session = null;
		//Transaction trans = null;
		Criteria cr = null;
		try
		{
			session = getSession();
			session.beginTransaction();
			cr = session.createCriteria(Room.class).add(Restrictions.eq("roomTypeNum", id));
			System.out.println("CR "+cr);
			roomJson = cr.list();
			session.getTransaction().commit();
			
		}
		catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomDetailDAOImpl - fetchRoomDetailById method ends");
		return roomJson;
	}
}
