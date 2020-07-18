package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "usuario")
public class User {
	
	@Id
	@Getter
	@Setter
	private String username;
	
	@Getter
	@Setter
	private String password;

}
