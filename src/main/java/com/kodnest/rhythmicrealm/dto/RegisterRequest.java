package com.kodnest.rhythmicrealm.dto;

public class RegisterRequest {
	private String username;
    private String email;
    private String password;
    private String gender;
    private String role;
	public RegisterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterRequest(String username, String email, String password, String gender, String role) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "RegisterRequest [username=" + username + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", role=" + role + "]";
	}
    
    

}
