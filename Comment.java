package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String text;

	    @ManyToOne
	    @JoinColumn(name = "post_id")
	    private Post post;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	  
	}

