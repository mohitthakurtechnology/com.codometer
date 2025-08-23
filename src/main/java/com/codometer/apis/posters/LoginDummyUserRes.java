package com.codometer.apis.posters;

public class LoginDummyUserRes 
{
	String accessToken;
	String refreshToken;
	int id;
	String username;
	String email;
	String firstName;
	String lastName;
	String gender;
	String image;
	
	@Override
	public String toString() {
		return "LoginDummyUserRes [accessToken=" + accessToken + ", refreshToken=" + refreshToken + ", id=" + id
				+ ", username=" + username + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", image=" + image + "]";
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
		
}
