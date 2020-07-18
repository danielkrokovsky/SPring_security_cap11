package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Otp {
	
	@Id
	@Getter
	@Setter
	private String username;
	
	@Getter
	@Setter
	private String code;
// Omitted getters and setters
}