package com.codometer.geeksforgeek.collections;

import java.util.HashMap;
import java.util.Map;

public class AnyHashMapOps<ANYKEY,ANYVALUE> implements IAnyHashMapOps<ANYKEY,ANYVALUE> {

	private ANYKEY anykey;
	private ANYVALUE anyvalue;
	
	AnyHashMapOps(ANYKEY anykey,ANYVALUE anyvalue)
	{
		this.anykey = anykey;
		this.anyvalue = anyvalue;
	}
	
	@Override
	public void printAllElementOfMap(HashMap<ANYKEY,ANYVALUE> hm) {
		
			for(Map.Entry<ANYKEY, ANYVALUE> entry : hm.entrySet())
				System.out.println("Key => " + entry.getKey() + " Value => " + entry.getValue());
	}

	@Override
	public void addElementToMap(HashMap<ANYKEY, ANYVALUE> hm, ANYKEY key, ANYVALUE element) {
		hm.put(key, element);
		
	}

	@Override
	public ANYVALUE readElementFromMap(HashMap<ANYKEY, ANYVALUE> hm, ANYKEY key) {
		return hm.get(key);
	}

	@Override
	public ANYVALUE deleteElementFromMap(HashMap<ANYKEY, ANYVALUE> hm, ANYKEY key) {
		return hm.remove(key);
	}

}
