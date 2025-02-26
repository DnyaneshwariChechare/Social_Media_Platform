package com.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	    private Profile profile;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private Set<Post> posts = new HashSet<>();

	    @ManyToMany
	    @JoinTable(
	        name = "user_likes",
	        joinColumns = @JoinColumn(name = "user_id"),
	        inverseJoinColumns = @JoinColumn(name = "post_id")
	    )
	    private Set<Post> likedPosts = new HashSet<>();

	    // Getters and Setters
	}

