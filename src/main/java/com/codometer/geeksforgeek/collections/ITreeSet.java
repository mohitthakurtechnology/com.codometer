package com.codometer.geeksforgeek.collections;

import java.util.TreeSet;

public interface ITreeSet {
		
		void addElementToTreeSet(TreeSet<String> treeset,String element);
		void addMultipleElementsToTreeSet(TreeSet<String> treeset);
		String readElementFromTreeSet(TreeSet<String> treeset,String element);
		boolean deleteElementFromTreeSet(TreeSet<String> treeset,String element);
		void printAllElementOfTreeSet(TreeSet<String> treeset);
		
}