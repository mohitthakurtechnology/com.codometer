package com.codometer.geeksforgeek.collections;

import java.util.HashSet;

public interface IAnyHashSetops<ANYTYPE> {
	
		void addElementToSet(HashSet<ANYTYPE> hashset,ANYTYPE element);
		ANYTYPE readElementFromSet(HashSet<ANYTYPE> hashset,ANYTYPE element);
		void deleteElementFromSet(HashSet<ANYTYPE> hashset,ANYTYPE element);
		void printAllElementOfSet(HashSet<ANYTYPE> hashset);
		
}