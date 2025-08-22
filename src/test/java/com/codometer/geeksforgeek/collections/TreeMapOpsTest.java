package com.codometer.geeksforgeek.collections;

import java.util.Scanner;
import java.util.TreeMap;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TreeMapOpsTest {
	
	String key,value;

	TreeMap<String,String> tree = new TreeMap<>();
	TreeMapOps treeMapOps = new TreeMapOps();
	
	Scanner scanner = new Scanner(System.in);

	 @Test(priority = 1)
	  public void addElementToTreeMapTest() {
		  
		  System.out.println("addElementToTreeMapTest => Please Enter key");
		  
		  key = scanner.nextLine();
		  System.out.println("addElementToTreeMapTest => Please Enter value");
		  value = scanner.nextLine();
		  
		  treeMapOps.addElementToTreeMap(tree, key,value);
		  treeMapOps.printAllElementOfTreeMap(tree);
		  
	  }

	  @Test(priority = 4)
	  public void deleteElementFromTreeSetTest() {
		  
		  System.out.println("deleteElementFromTreeSetTest => Please Enter Element");
		  
		  key = scanner.nextLine();
		  
		  treeMapOps.deleteElementFromTreeMap(tree, key);
		  treeMapOps.printAllElementOfTreeMap(tree);
		  
	  }

	  @Test(priority = 2)
	  public void printAllElementOfTreeSetTest() {
		  
		  System.out.println("printAllElementOfTreeSetTest");
		  
		  treeMapOps.printAllElementOfTreeMap(tree);
		  
	  }

	  @Test(priority = 3)
	  public void readElementFromTreeSetTest() {
		  
		  System.out.println("readElementFromTreeSetTest => Please Element to read");
		  
		  key = scanner.nextLine();
		  
		  treeMapOps.readElementFromTreeMap(tree,key);
		  treeMapOps.printAllElementOfTreeMap(tree);
	  }
}
