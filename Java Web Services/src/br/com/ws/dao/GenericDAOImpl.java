package br.com.ws.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ws.util.HibernateUtil;

public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {
	
	private Class<T> clazz;
	private Transaction tx;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {  	
        this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@SuppressWarnings("unchecked")
	public ID create(T object) {	
		Serializable id = null;
		try {
			this.tx = getSession().beginTransaction();
			id = getSession().save(object);
			this.tx.commit();
		} catch (Throwable e) {
			this.tx.rollback();
			System.err.println(e.getMessage());
			throw new HibernateException(e.getMessage());
		}		
		return (ID) id;
	}

	@SuppressWarnings("unchecked")
	public T read(ID id) {
		return (T) getSession().get(this.clazz, id);
	}



	public void update(T object) {
		try {
			this.tx = getSession().beginTransaction();
			getSession().update(object);
			this.tx.commit();
		} catch (Throwable e) {
			this.tx.rollback();
			System.err.println(e.getMessage());
			throw new HibernateException(e.getMessage());
		}
	}



	public void delete(T object) {
		try {
			this.tx = getSession().beginTransaction();
			getSession().delete(object);
			this.tx.commit();
		} catch (Throwable e) {
			this.tx.rollback();
			System.err.println(e.getMessage());
			throw new HibernateException(e.getMessage());
		}		
	}
	
	@SuppressWarnings("unchecked")

	public List<T> list() {
		try {
			Criteria criteria = getSession().createCriteria(clazz);
			return (List<T>) criteria.list();
		} catch (Throwable e) {
			System.err.println(e.getMessage());
			throw new HibernateException(e.getMessage());
		}
	}
	
	public Session getSession() {	
		try {
			if (HibernateUtil.session == null) {
				HibernateUtil.session = HibernateUtil.getConfiguration()											
										.buildSessionFactory().openSession();
			} else {		
				HibernateUtil.session = HibernateUtil.getSessionFactory().getCurrentSession();
			}	
		} catch (Throwable e) {
			System.err.println("Initial Session creation failed. " + e.getMessage());
			throw new HibernateException(e.getMessage());
		}
		return HibernateUtil.session;
	}

}
