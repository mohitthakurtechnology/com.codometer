package com.codometer.geeksforgeek.collections;

import java.util.HashSet;
import java.util.Scanner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class HashSetOpsTest {
	
	HashSet<String> hashset = new HashSet<>();
	HashSetOps hashsetops = new HashSetOps();
	
	Scanner scanner = new Scanner(System.in);
	String element;

  @Test(priority = 1)
  public void addElementToSetTest() {
	  
	  System.out.println("addElementToSetTest => Please Enter element");
	  
	  element = scanner.nextLine();
	  
	  hashsetops.addElementToSet(hashset, element);
	  hashsetops.printAllElementOfSet(hashset);
	  
  }

  @Test(priority = 4)
  public void deleteElementFromSetTest() {
	  
	  System.out.println("deleteElementFromSetTest => Please Element Key to be deleted");
	  
	  element = scanner.nextLine();
	  
	  hashsetops.deleteElementFromSet(hashset, element);
	  hashsetops.printAllElementOfSet(hashset);
	  
  }

  @Test(priority = 3)
  public void printAllElementOfSetTest() {
	  
	  System.out.println("printAllElementOfSetTest => Please print all elements");
	  
	  hashsetops.printAllElementOfSet(hashset);
	  
  }

  @Test(priority = 2)
  public void readElementFromSetTest() {
	  
	  System.out.println("readElementFromSetTest => Please Element to read");
	  
	  element = scanner.nextLine();
	  
	  hashsetops.readElementFromSet(hashset,element);
	  hashsetops.printAllElementOfSet(hashset);
	  
  }
}
