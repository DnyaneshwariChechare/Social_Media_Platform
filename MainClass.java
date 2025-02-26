package com.main;

public class MainClass {
	 public static void main(String[] args) {
	        UserService userService = new UserService();

	        User user = new User();
	        user.setName("John Doe");

	        Profile profile = new Profile();
	        profile.setBio("Software Developer");
	        profile.setUser(user);
	        user.setProfile(profile);

	        userService.registerUser(user);

	        System.out.println("User registered successfully!");
	    }
	}

