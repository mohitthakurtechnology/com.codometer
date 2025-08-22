package com.codometer.geeksforgeek.collections;

import java.util.TreeSet;

public interface IAnyTreeSet<ANYTYPE> {
	
		void addElementToTreeSet(TreeSet<ANYTYPE> treeset,ANYTYPE element);
		ANYTYPE readElementFromTreeSet(TreeSet<ANYTYPE> treeset,ANYTYPE element);
		boolean deleteElementFromTreeSet(TreeSet<ANYTYPE> treeset,ANYTYPE element);
		void printAllElementOfTreeSet(TreeSet<ANYTYPE> treeset);
		void addMultipleElementsToTreeSet(TreeSet<ANYTYPE> treeset,ANYTYPE element);
		
}