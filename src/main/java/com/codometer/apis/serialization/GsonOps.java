package com.codometer.apis.serialization;

import com.google.gson.Gson;

/*
 * Serialization using the GSON API for ANY API.
 */
public class GsonOps<ANY> 
{
	String anyclassname,anyresponse;
	
	Gson gson;
	Class anyclass;
	
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
	
	public String serializePayload(Object anyobject)
	{
		 try {
			 	gson = new Gson();
			 	gson.toJson(anyobject);
			 	return gson.toJson(anyobject);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
}
