package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel {
	//data validation constraints
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password; 
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
}
