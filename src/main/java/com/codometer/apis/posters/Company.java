package com.codometer.apis.posters;

public class Company 
{ 
    public Company(String department, String name, String title, Address address) {
		super();
		this.department = department;
		this.name = name;
		this.title = title;
		this.address = address;
	}
	String department;
    String name;
    String title;
    Address address;
    
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	@Override
//	public String toString() {
//		return "Company [department=" + department + ", name=" + name + ", title=" + title + ", address=" + address
//				+ ", getDepartment()=" + getDepartment() + ", getName()=" + getName() + ", getTitle()=" + getTitle()
//				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
	@Override
	public String toString() {
		return "Company [department=" + department + ", name=" + name + ", title=" + title + ", address=" + address
				+ "]";
	}
}