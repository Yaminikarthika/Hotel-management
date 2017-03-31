package com.hotel.rooms.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.exception.HotelException;



public abstract class AbstractHotelDao<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractHotelDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() throws HotelException {
		Session session = sessionFactory.getCurrentSession();
		if (null == session) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) throws HotelException {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) throws HotelException {
		Session session = null;
		Transaction trans = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			session.persist(entity);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new HotelException("Exception occured:", e.getMessage());
		}
	}

	public void saveOrUpdate(T entity) throws HotelException {
		Session session = null;
		Transaction trans = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			session.saveOrUpdate(entity);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
	}

	public void delete(T entity) throws HotelException {
		Session session = null;
		Transaction trans = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			session.delete(entity);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new HotelException("Error occured:", e.getMessage());
		}
	}

	protected Criteria createEntityCriteria() throws HotelException {
		return getSession().createCriteria(persistentClass);
	}
/*	
	@SuppressWarnings("unchecked")
	protected List<SOWInfo> createListEntityCriteria() throws SOWException {
		Session session = null;
		Transaction trans = null;
		List<SOWInfo> sowlist = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			sowlist = session.createCriteria(SOW.class).list();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new SOWException("Error occured:", e.getMessage());
		}
		return sowlist;
	}
	
	@SuppressWarnings("unchecked")
	protected List<SOWInfo> getASOWData(String SOWno) throws SOWException {
		Session session = null;
		Transaction trans = null;
		List<SOWInfo> sowlist = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			sowlist = session.createCriteria(SOW.class).add( Restrictions.eq("sowNo", SOWno ) ).list();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new SOWException("Error occured:", e.getMessage());
		}
		return sowlist;
	}
	
	protected BigDecimal calculatedResult(String curtype, BigDecimal curvalue) throws SOWException {
		Session session = null;
		Transaction trans = null;
		BigDecimal resultvalue = null;
		BigDecimal calculation = null;
		try {
			session = getSession();
			trans = session.beginTransaction();
			Object sow = session.createCriteria(SOWCurrency.class).setProjection(Projections.distinct(Projections.projectionList().add(Projections.property("rate"),"rate"))).add(Restrictions.eq("currency", curtype)).uniqueResult();
			calculation = new BigDecimal(sow.toString());
			resultvalue = curvalue.multiply(calculation);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			throw new SOWException("Error occured:", e.getMessage());
		}
		return resultvalue;
	}
*/
}