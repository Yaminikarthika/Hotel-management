package com.hotel.rooms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hotel.exception.HotelException;
import com.hotel.rooms.dao.AbstractHotelDao;
import com.hotel.rooms.dao.RoomTypeDao;
import com.hotel.rooms.model.Types;

@Repository(value="roomTypeDaoImpl")
public class RoomTypeDaoImpl extends AbstractHotelDao<Integer,Types> implements RoomTypeDao {

	@Override
	public List<Types> fetchRoomTypeList() throws HotelException {
		System.out.println("RoomDetailDAOImpl - fetchAllRoomDetail method starts");
		Session session = null;
		//Transaction trans = null;
		Criteria cr = null;
		
		List<Types> types;
		try
		{
			session = getSession();
			session.beginTransaction();
			cr = session.createCriteria(Types.class);
		//	System.out.println("CR "+cr.list());
			types=cr.list();
			System.out.println(types);
			
			
			session.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
		System.out.println("RoomTypeDaoImpl - fetchRoomTypeList method ends");
		return types;
	}
	}


