package com.codometer.geeksforgeek.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AnyTreeSetOps<ANYTYPE> implements IAnyTreeSet<ANYTYPE> {

	private ANYTYPE treeset,element;
	
	AnyTreeSetOps(ANYTYPE treeset,ANYTYPE element)
	{
		this.treeset = treeset;
		this.element = element;
	}
	
	@Override
	public void addElementToTreeSet(TreeSet<ANYTYPE> treeset, ANYTYPE element) {
		treeset.add(element);
	}

	@Override
	public ANYTYPE readElementFromTreeSet(TreeSet<ANYTYPE> treeset, ANYTYPE element) {
		return treeset.contains(element) ? element : null;     // retrive	
	}

	@Override
	public boolean deleteElementFromTreeSet(TreeSet<ANYTYPE> treeset, ANYTYPE element) {
		return treeset.remove(element);  //delete 
	}

	@Override
	public void printAllElementOfTreeSet(TreeSet<ANYTYPE> treeset) {
		
		Iterator<ANYTYPE> it = treeset.iterator();
		
		while(it.hasNext())
			System.out.println("TreeSet's Value are => " + it.next());
		System.out.println("TreeSet is => " + treeset);
	}

	@Override
	public void addMultipleElementsToTreeSet(TreeSet<ANYTYPE> treeset, ANYTYPE element) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pressKey;
		
		do {
			
			System.out.println("Please enter a value to the tree node => ");
			element = (ANYTYPE) scanner.next();
			treeset.add(element);
			System.out.println("Press 0 to continue ... ");
			pressKey = scanner.nextInt();
			
		}while(pressKey == 0);
		
	}

}
