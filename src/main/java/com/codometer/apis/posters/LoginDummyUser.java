package com.codometer.apis.posters;

public class LoginDummyUser 
{
	String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getExpiresInMins() {
		return expiresInMins;
	}
	public void setExpiresInMins(int expiresInMins) {
		this.expiresInMins = expiresInMins;
	}
	String password;
	int	expiresInMins;
	@Override
	public String toString() {
		return "LoginDummyUser [username=" + username + ", password=" + password + ", expiresInMins=" + expiresInMins
				+ "]";
	}
		
}
