package com.codometer.apis.posters;

import java.util.List;

public class Users 
{
	
	public Users(List<User> users, int total, int skip, int limit) {
		super();
		this.users = users;
		this.total = total;
		this.skip = skip;
		this.limit = limit;
	}
	List<User> users;
	int total;
    int skip;
    int limit;
    
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Users [users=" + users + ", total=" + total + ", skip=" + skip + ", limit=" + limit + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Users [users=" + users + ", total=" + total + ", skip=" + skip + ", limit=" + limit + ", getUsers()="
//				+ getUsers() + ", getTotal()=" + getTotal() + ", getSkip()=" + getSkip() + ", getLimit()=" + getLimit()
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
}
