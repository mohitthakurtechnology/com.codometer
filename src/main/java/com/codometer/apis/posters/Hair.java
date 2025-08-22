package com.codometer.apis.posters;

public class Hair 
{ 
    public Hair(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	String color;
    String type;
    
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
//	@Override
//	public String toString() {
//		return "Hair [color=" + color + ", type=" + type + ", getColor()=" + getColor() + ", getType()=" + getType()
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
	@Override
	public String toString() {
		return "Hair [color=" + color + ", type=" + type + "]";
	}
}
