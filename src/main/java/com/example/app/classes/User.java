package com.example.app.classes;

public class User {
	private String name;
	private int count;
	
	public User(String name) {
		this.name = name;
		this.count = 1;
	}

	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}

	public void incrementAccessCount() {
		this.count += 1;
	}
	
}
