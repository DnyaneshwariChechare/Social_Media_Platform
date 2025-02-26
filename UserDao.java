package com.dao;

import com.service.Session;
import com.service.Transaction;
import com.service.User;

public class UserDao {
	 public void saveUser(User user) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            session.save(user);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) transaction.rollback();
	            e.printStackTrace();
	        }
	    }
	}

