package com.codometer.geeksforgeek.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOps implements ITreeSet {


	@Override
	public void addElementToTreeSet(TreeSet<String> treeset, String element) {
		treeset.add(element);  //insertion
		
	}

	@Override
	public String readElementFromTreeSet(TreeSet<String> treeset, String element) {
		
		return treeset.contains(element) ? element : null;     // retrive
		
	}

	@Override
	public boolean deleteElementFromTreeSet(TreeSet<String> treeset, String element) {
		
		return treeset.remove(element);  //delete 
		
	}

	@Override
	public void printAllElementOfTreeSet(TreeSet<String> treeset) {
		
		Iterator<String> it = treeset.iterator();
		
		while(it.hasNext())
			System.out.println("TreeSet's Value are => " + it.next());
		
	}

	@Override
	public void addMultipleElementsToTreeSet(TreeSet<String> treeset) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pressedKey;
		
		String valueToBeAdded;
		
		do {
			
			System.out.println("Please enter values to be inserted into the treeset");
			
			valueToBeAdded = scanner.next();
			treeset.add(valueToBeAdded);
			
			System.out.println("Press 0 to continue...");
			pressedKey = scanner.nextInt();
			
		}while(pressedKey == 0);
		
	}

}
