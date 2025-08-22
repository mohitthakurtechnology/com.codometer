package com.codometer.geeksforgeek.collections;

import java.util.HashMap;

public interface IAnyHashMapOps<ANYKEY,ANYVALUE> {
	
		void addElementToMap(HashMap<ANYKEY,ANYVALUE> hm,ANYKEY key,ANYVALUE element);
		ANYVALUE readElementFromMap(HashMap<ANYKEY,ANYVALUE> hm,ANYKEY key);
		ANYVALUE deleteElementFromMap(HashMap<ANYKEY,ANYVALUE> hm,ANYKEY key);
		void printAllElementOfMap(HashMap<ANYKEY,ANYVALUE> hm);	
}
