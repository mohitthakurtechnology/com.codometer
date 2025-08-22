package com.codometer.geeksforgeek.collections;

import java.util.Scanner;
import java.util.TreeMap;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnyTreeMapOpsTest {
	
	Integer key;
	String value; 
	
	TreeMap<Integer,String> treemap = new TreeMap<>(new TreeComparator());
	AnyTreeMapOps anytreemapops = new AnyTreeMapOps(key,value);
	Scanner scanner = new Scanner(System.in);

  @Test(priority = 1)
  public void addElementToTreeMapTest() {
	  
	  System.out.println("addElementToTreeMapTest => Please enter key");
	  key = scanner.nextInt();
	  
	  System.out.println("addElementToTreeMapTest => Please enter value");
	  value = scanner.next();
	  
	  anytreemapops.addElementToTreeMap(treemap, key, value);
	  
  }
  @Test(priority = 5)
  public void addMultipleElementToTreeMapTest() {
	  
	  System.out.println("addMultipleElementToTreeMapTest => ");
	  anytreemapops.addMultipleElementToTreeMap(treemap);
	  anytreemapops.printAllElementOfTreeMap(treemap);
	  
  }

  @Test(priority = 4)
  public void deleteElementFromTreeMapTest() {
	  
	  System.out.println("deleteElementFromTreeMapTest => Please enter key need to be deleted");
	  key = scanner.nextInt();
	  
	  anytreemapops.deleteElementFromTreeMap(treemap, key);
	  anytreemapops.printAllElementOfTreeMap(treemap);
	  
  }

  @Test(priority = 3)
  public void printAllElementOfTreeMapTest() {
    
	  System.out.println("printAllElementOfTreeMapTest => ");
	  
	  anytreemapops.printAllElementOfTreeMap(treemap);
	  
  }

  @Test(priority = 2)
  public void readElementFromTreeMapTest() {

	  System.out.println("readElementFromTreeMapTest => Please enter key");
	  key = scanner.nextInt();
	  
	  System.out.println(anytreemapops.readElementFromTreeMap(treemap, key));
	  
  }
}
