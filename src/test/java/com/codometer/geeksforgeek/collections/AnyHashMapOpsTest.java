package com.codometer.geeksforgeek.collections;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnyHashMapOpsTest {
	
	String Key,Value;
	HashMap<String,String> hm = new HashMap<>();
	AnyHashMapOps<String,String> hmOps = new AnyHashMapOps<>(Key, Value);
	Scanner sc = new Scanner(System.in);

  @Test(priority=1)
  public void addElementToMapTest() {
	  
	  System.out.println("addElementToMapTest => Please Enter Key");
	  Key = sc.nextLine();
	  
	  System.out.println("addElementToMapTest => Please Enter Value");
	  Value = sc.nextLine();
	  
	  hmOps.addElementToMap(hm, Key, Value);
	  hmOps.readElementFromMap(hm, Key);
  }

  @Test(priority=4)
  public void deleteElementFromMapTest() {
	  System.out.println("deleteElementFromMapTest => Please Enter Key to be deleted");
	  
	  Key = sc.nextLine();
	  hmOps.deleteElementFromMap(hm, Key);
  }

  @Test(priority=3)
  public void printAllElementOfMapTest() {
	  System.out.println("printAllElementOfMapTest => ");
		 hmOps.printAllElementOfMap(hm);
  }

  @Test(priority=2)
  public void readElementFromMapTest() {
	  
	  System.out.println("readElementFromMapTest => Please Enter Key To Be Read");
	  Key = sc.nextLine();
	  System.out.println("keysValue => " + hmOps.readElementFromMap(hm, Key));
	  
  }
}