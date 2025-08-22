package com.codometer.geeksforgeek.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnyListOpsTest {
	
	  Integer element;
	  List<Integer> list = new ArrayList<>();
	  AnyListOps anylistops = new AnyListOps(list,element);
	  Scanner scanner = new Scanner(System.in);

	  @Test
	  public void addElementToListTest() {
		  
	    System.out.println("addElementToListTest => please enter an element to be added to the list");
	    element = Integer.valueOf(scanner.nextInt());
	    anylistops.addElementToList(list, element);	
	    anylistops.printAllElementsOfList(list);
	    	
	  }
	
	  @Test
	  public void deleteElementFromListTest() {
		  
		  	System.out.println("deleteElementFromListTest => please enter an element to be deleted from the list");
		    element = Integer.valueOf(scanner.nextInt());
		    anylistops.deleteElementFromList(list, element);	
		    anylistops.printAllElementsOfList(list);
		    
	  }
	
	  @Test
	  public void printAllElementsOfListTest() {
		  
		  	System.out.println("printAllElementsOfListTest => ");
		    anylistops.printAllElementsOfList(list);
	  }
	
	  @Test
	  public void readElementFromListTest() {
		  
			System.out.println("readElementFromListTest => please enter an element to be read from the list");
		    element = Integer.valueOf(scanner.nextInt());
		    Integer ele = (Integer) anylistops.readElementFromList(list, element);	
		    System.out.println("read element is => " + ele);
		    
	  }
}
