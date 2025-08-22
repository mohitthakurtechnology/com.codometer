package com.codometer.apis.posters;

public class Coordinates 
{ 
    public Coordinates(Double lat, Double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
    
	Double lat;
    Double lng;
    
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
//	@Override
//	public String toString() {
//		return "Coordinates [lat=" + lat + ", lng=" + lng + ", getLat()=" + getLat() + ", getLng()=" + getLng()
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
	@Override
	public String toString() {
		return "Coordinates [lat=" + lat + ", lng=" + lng + "]";
	}
}
