package com.codometer.apis.serialization;

import com.google.gson.Gson;

/*
 * Serialization using the GSON API for ANY API.
 */
public class GsonOps<ANY> 
{
	String anyclassname,anyresponse;
	Object anyobject;
	
	Gson gson;
	Class anyclass;
	
	public GsonOps(Object anyobject)
	{
		this.anyobject = anyobject;
	}
	
	public GsonOps(String anyresponse,String anyclassname)
	{
		this.anyclassname = anyclassname;
		this.anyresponse = anyresponse;
	}
	
	@SuppressWarnings("unchecked")
	public ANY deserializePayload()
	{
		 try {
				 anyclass = Class.forName(this.anyclassname);
				 gson = new Gson();
				 
				 return (ANY) gson.fromJson(anyresponse.toString(), anyclass);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String serializePayload()
	{
		 try {
			 	gson = new Gson();
			 	return gson.toJson(anyobject);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
}
