package com.codometer.geeksforgeek.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOps implements ITreeMap {

	@Override
	public void addElementToTreeMap(TreeMap<String,String> hs,String key,String value) {
		hs.put(key,value); //insert
	}
	
	@Override
	public String readElementFromTreeMap(TreeMap<String,String> hs,String key) {
		return hs.containsKey(key) ? hs.get(key) : null;     // retrive
	}

	@Override
	public String deleteElementFromTreeMap(TreeMap<String,String> hs,String key) {
		return hs.remove(key);  //delete 
	}

	@Override
	public void printAllElementOfTreeMap(TreeMap<String,String> hs) {
		
			Set<Entry<String, String>> keyset = hs.entrySet();
			Iterator<Entry<String, String>> it = keyset.iterator();
			while(it.hasNext())
				System.out.println("TreeMap's entry key is => " + it.next().getKey() + "TreeMap's entry value is => " + it.next().getValue());
	
	}

}
