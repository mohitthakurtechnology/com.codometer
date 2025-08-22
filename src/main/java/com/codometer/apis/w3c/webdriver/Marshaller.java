package com.codometer.apis.w3c.webdriver;

import com.google.gson.Gson;

/**
 * 
 */
public class Marshaller<T> 
{
	Gson gson;
	
	T object;
	
	Marshaller(T t)
	{
		this.object = t;
	}
	
	public String toJson(T t)
	{
		return gson.toJson(t);
	}
	
	public  T toJavaObject(String Json)
	{
	//	gson.fromJson(Json, null);
		return object;
	}
}
