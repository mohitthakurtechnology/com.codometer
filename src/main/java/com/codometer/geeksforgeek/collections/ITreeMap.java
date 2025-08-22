package com.codometer.geeksforgeek.collections;

import java.util.TreeMap;

public interface ITreeMap {
	
		void addElementToTreeMap(TreeMap<String,String> treemap,String key,String value);
		String readElementFromTreeMap(TreeMap<String,String> treemap,String key);
		String deleteElementFromTreeMap(TreeMap<String,String> treemap,String key);
		void printAllElementOfTreeMap(TreeMap<String,String> treemap);
		
}