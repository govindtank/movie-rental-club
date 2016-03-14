package org.movieRental.model;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.movieRental.entities.Movie;
import org.movieRental.util.HibernateUtil;


public class ModelMovie {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@SuppressWarnings("unchecked")
	public ArrayList <Movie> ShowMovies(){
		Session session = sessionFactory.openSession();
		ArrayList<Movie> list= null;
		Transaction transaction=null;
		  try {
		    	transaction = session.beginTransaction();
		    	list  =  (ArrayList<Movie>) session.createCriteria(Movie.class).list();
		    	transaction.commit();
				
			} catch (Exception e) {
				if(transaction != null){
				transaction.rollback();	
				
				}e.printStackTrace();
			}finally{
		    session.close(); 	    
		    }
		    return list;
	}
}
