package com.entities;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Post {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String content;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	    private Set<Comment> comments = new HashSet<>();

	    @ManyToMany(mappedBy = "likedPosts")
	    private Set<User> likedByUsers = new HashSet<>();

	    // Getters and Setters
	}

