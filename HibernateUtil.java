package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Comment;
import com.entities.Post;
import com.entities.Profile;
import com.entities.User;

public class HibernateUtil {
	   private static final SessionFactory sessionFactory;

	    static {
	        sessionFactory = new Configuration()
	                .addAnnotatedClass(User.class)
	                .addAnnotatedClass(Profile.class)
	                .addAnnotatedClass(Post.class)
	                .addAnnotatedClass(Comment.class)
	                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
	                .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
	                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/social_media")
	                .setProperty("hibernate.connection.username", "root")
	                .setProperty("hibernate.connection.password", "password")
	                .setProperty("hibernate.hbm2ddl.auto", "update")
	                .setProperty("hibernate.show_sql", "true")
	                .setProperty("hibernate.format_sql", "true")
	                .buildSessionFactory();
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}

