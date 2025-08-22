package com.codometer.geeksforgeek.collections;

import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnyTreeSetOpsTest {
	
	String element;

	TreeSet<String> treeset = new TreeSet<>(new TreeComparator());
	
	AnyTreeSetOps anytreesetops = new AnyTreeSetOps(treeset,element);
	
	Scanner scanner = new Scanner(System.in);

  @Test(priority = 1)
  public void addElementToTreeSetTest() {
	  
	  System.out.println("addElementToTreeSetTest => Please Enter element");
	  
	  element = scanner.nextLine();
	  
	  anytreesetops.addElementToTreeSet(treeset, element);
	  
	  anytreesetops.printAllElementOfTreeSet(treeset);
	  
  }

  @Test(priority = 4)
  public void deleteElementFromTreeSetTest() {
	  
	  System.out.println("deleteElementFromTreeSetTest => Please Enter Element");
	  
	  element = scanner.nextLine();
	  
	  anytreesetops.deleteElementFromTreeSet(treeset, element);
	  anytreesetops.printAllElementOfTreeSet(treeset);
	  
  }

  @Test(priority = 3)
  public void printAllElementOfTreeSetTest() {
	  anytreesetops.printAllElementOfTreeSet(treeset);
  }

  @Test(priority = 2)
  public void readElementFromTreeSetTest() {
	  
	  System.out.println("readElementFromTreeSetTest => Please Element to read");
	  
	  element = scanner.nextLine();
	  
	  anytreesetops.readElementFromTreeSet(treeset,element);
	  anytreesetops.printAllElementOfTreeSet(treeset);
	  
  }
  @Test(priority = 5)
  public void addMultipleElementsToTreeSet() {
	  
	  System.out.println("addMultipleElementsToTreeSet =>");
	  
	  anytreesetops.addMultipleElementsToTreeSet(treeset,element);
	  anytreesetops.printAllElementOfTreeSet(treeset);
	  
  }
}
