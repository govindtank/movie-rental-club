package org.movieRental.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.movieRental.entities.User;
import org.movieRental.util.HibernateUtil;

public class ModelUser {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public boolean Autenticate(String name, String password){
		User user = getUserByName(name);
		if(user!=null && user.getUser().equals(name) && user.getPassword().equals(password) ){
			return true;
		}else{
			return false;
		}
	}
	public User getUserByName(String name){
		Session session = sessionFactory.openSession();
		Transaction trans = null;
		User user = null;

		try {
			trans = session.getTransaction();
			trans.begin();
			 Query query = session.createQuery("from User where user = '"+ name +"'");
			 user=(User) query.uniqueResult();
			 trans.commit();
		} catch (Exception e) {
			if (trans!= null)
				trans.rollback();			
		}finally{
			session.close();
		}
		return user;
	}

}
