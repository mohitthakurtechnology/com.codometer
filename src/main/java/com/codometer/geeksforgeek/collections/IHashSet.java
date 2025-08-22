package com.codometer.geeksforgeek.collections;

import java.util.HashSet;

public interface IHashSet {
	
		void addElementToSet(HashSet<String> hashset,String element);
		String readElementFromSet(HashSet<String> hashset,String element);
		boolean deleteElementFromSet(HashSet<String> hashset,String element);
		void printAllElementOfSet(HashSet<String> hashset);
		
}