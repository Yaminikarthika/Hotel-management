package com.hotel.rooms.dao.impl;


import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.AbstractHotelDao;
import com.hotel.rooms.dao.RoomAuditHistoryDao;
import com.hotel.rooms.model.RoomAuditHistory;

@Repository(value="roomAuditDaoImpl")
public class RoomAuditHistoryDaoImpl extends AbstractHotelDao<Integer, RoomAuditHistory> implements RoomAuditHistoryDao {

	@Override
	public List<RoomAuditHistory> fetchAllRoomAuditHistory()
			throws HotelException {
		System.out.println("RoomAuditHistoryDaoImpl - fetchAllRoomDetail method starts");
		//List<RoomsAuditHistory> roomsAuditHistory = new ArrayList<RoomsAuditHistory>();
		Session session = null;
		//Transaction trans = null;
		Criteria cr = null;
		List<RoomAuditHistory> roomAuditHistory;
		try
		{
			session = getSession();
		   session.beginTransaction();
			cr = session.createCriteria(RoomAuditHistory.class);
			 roomAuditHistory=cr.list();
			System.out.println(roomAuditHistory);
		
			
			session.getTransaction().commit();
		}
		catch (Exception e) {
			session.getTransaction().rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomAuditHistoryDaoImpl - fetchAllRoomDetail method ends");
		return roomAuditHistory;
	}

	@Override
	public List<RoomAuditHistory> fetchRoomAuditHistoryByDate()
			throws HotelException {
		// TODO Auto-generated method stub
		System.out.println("RoomAuditHistoryDaoImpl - fetchRoomAuditHistoryByDate method starts");
		//List<RoomsAuditHistory> roomsAuditHistory = new ArrayList<RoomsAuditHistory>();
		Session session = null;
	//	Transaction trans = null;
		Criteria cr = null;
		List<RoomAuditHistory> roomAuditHistory = null;
		
		try
		{
			session = getSession();
			 session.beginTransaction();
			cr = session.createCriteria(RoomAuditHistory.class).add(Restrictions.eq("loggedInDate",new Date()));
			//if(cr.list() != null && cr.list().size() > 0 && cr.list().isEmpty()){				
				roomAuditHistory=cr.list();
 			//}
			session.getTransaction().commit();
		}
		catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomAuditHistoryDaoImpl - fetchAllRoomDetail method ends");
		return roomAuditHistory;
	}
	
	
	
	}


