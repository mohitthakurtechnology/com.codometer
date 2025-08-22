package com.codometer.geeksforgeek.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnyHashSetOpsTest {
	
	String element;

	HashSet<String> hashset = new HashSet<>();
	AnyHashSetOps anyhashsetops = new AnyHashSetOps(hashset,element);
	
	Scanner scanner = new Scanner(System.in);

  @Test(priority = 1)
  public void addElementToSetTest() {
	  
	  System.out.println("addElementToSetTest => Please Enter element");
	  
	  element = scanner.nextLine();
	  
	  anyhashsetops.addElementToSet(hashset, element);
	  anyhashsetops.printAllElementOfSet(hashset);
	  
	  
  }

  @Test(priority = 4)
  public void deleteElementFromSetTest() {
	  
	  System.out.println("deleteElementFromSetTest => Please Enter Element");
	  
	  element = scanner.nextLine();
	  
	  anyhashsetops.deleteElementFromSet(hashset, element);
	  anyhashsetops.printAllElementOfSet(hashset);
	  
  }

  @Test(priority = 3)
  public void printAllElementOfSetTest() {
	  anyhashsetops.printAllElementOfSet(hashset);
  }

  @Test(priority = 2)
  public void readElementFromSetTest() {
	  
	  System.out.println("readElementFromSetTest => Please Element to read");
	  
	  element = scanner.nextLine();
	  
	  anyhashsetops.readElementFromSet(hashset,element);
	  anyhashsetops.printAllElementOfSet(hashset);
	  
  }
}
