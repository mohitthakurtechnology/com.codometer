package com.codometer.geeksforgeek.collections;

import java.util.HashMap;

public interface IHashMap {
	
		void addElementToMap(HashMap<String,String> hm,String key,String element);
		String readElementFromMap(HashMap<String,String> hm,String key);
		String deleteElementFromMap(HashMap<String,String> hm,String key);
		void printAllElementOfMap(HashMap<String,String> hm);
		
}