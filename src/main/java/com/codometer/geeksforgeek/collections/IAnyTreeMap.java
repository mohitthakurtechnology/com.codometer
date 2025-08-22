package com.codometer.geeksforgeek.collections;

import java.util.TreeMap;

public interface IAnyTreeMap<ANYTYPE> {
	
		void addElementToTreeMap(TreeMap<ANYTYPE,ANYTYPE> treemap,ANYTYPE key,ANYTYPE value);
		ANYTYPE readElementFromTreeMap(TreeMap<ANYTYPE,ANYTYPE> treemap,ANYTYPE key);
		ANYTYPE deleteElementFromTreeMap(TreeMap<ANYTYPE,ANYTYPE> treemap,ANYTYPE key);
		void printAllElementOfTreeMap(TreeMap<ANYTYPE,ANYTYPE> treemap);
		void addMultipleElementToTreeMap(TreeMap<ANYTYPE,ANYTYPE> treemap);
		
}