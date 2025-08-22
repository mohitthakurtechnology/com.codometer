package com.codometer.geeksforgeek.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOps implements IHashMap {

	@Override
	public void addElementToMap(HashMap<String,String> hm,String key,String element) {
		hm.put(key, element);
	}
	@Override
	public String readElementFromMap(HashMap<String,String> hm,String key) {
		return hm.get(key);
	}

	@Override
	public String deleteElementFromMap(HashMap<String,String> hm,String key) {
		return hm.remove(key);
	}

	@Override
	public void printAllElementOfMap(HashMap<String,String> hm) {
		
			for(Map.Entry<String, String> entry : hm.entrySet())
				System.out.println("Key => " + entry.getKey() + " Value => " + entry.getValue());
	}

}
