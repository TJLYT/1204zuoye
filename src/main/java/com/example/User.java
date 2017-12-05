package com.example;

import lombok.Data;

@Data

public class User {
	
	private String name;
	private Integer age;
	private Integer score;
	public User() {
		super();
	}
	public User(String name, Integer age, Integer score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	



}
