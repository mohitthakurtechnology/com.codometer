package com.codometer.geeksforgeek.collections;

import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TreeSetOpsTest {
  
	String element;
		
	TreeSet<String> treeset = new TreeSet<>();
	TreeSetOps treeSetOps = new TreeSetOps();
			
	Scanner scanner = new Scanner(System.in);
		
	@Test(priority = 1)
	public void addElementToTreeSetTest() {
			  
	System.out.println("addElementToTreeSetTest => Please Enter element");
			  
		element = scanner.nextLine();
			  
		treeSetOps.addElementToTreeSet(treeset, element);
		treeSetOps.printAllElementOfTreeSet(treeset);
	}
		
		@Test(priority = 4)
		public void deleteElementFromTreeSetTest() {
			  
			  System.out.println("deleteElementFromTreeSetTest => Please Enter Element");
			  
			  element = scanner.nextLine();
			  
			  treeSetOps.deleteElementFromTreeSet(treeset, element);
			  treeSetOps.printAllElementOfTreeSet(treeset);
		}
		
		@Test(priority = 2)
		public void printAllElementOfTreeSetTest() {
			  
			  System.out.println("printAllElementOfTreeSetTest");
			  
			  treeSetOps.printAllElementOfTreeSet(treeset);
			  
		}
		
		@Test(priority = 3)
		public void readElementFromTreeSetTest() {
			  
			  System.out.println("readElementFromTreeSetTest => Please Element to read");
			  
			  element = scanner.nextLine();
			  
			  String readValue = treeSetOps.readElementFromTreeSet(treeset,element);
			  
			  System.out.println("read Value is ==> " + readValue);
			  
			  //treeSetOps.printAllElementOfTreeSet(treeset);
		}
		
		@Test(priority = 5)
		public void addMultipleElementsToTreeSetTest() {
			  
			  System.out.println("addMultipleElementsToTreeSetTest ==> ");
			  treeSetOps.addMultipleElementsToTreeSet(treeset);
			  treeSetOps.printAllElementOfTreeSet(treeset);
			  
		}
}
