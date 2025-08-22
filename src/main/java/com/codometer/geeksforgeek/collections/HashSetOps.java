package com.codometer.geeksforgeek.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOps implements IHashSet {

	@Override
	public void addElementToSet(HashSet<String> hs,String element) {
		hs.add(element); //insert
	}
	
	@Override
	public String readElementFromSet(HashSet<String> hs,String element) {
		return hs.contains(element) ? element : null;     // retrive
	}

	@Override
	public boolean deleteElementFromSet(HashSet<String> hs,String element) {
		return hs.remove(element);  //delete 
	}

	@Override
	public void printAllElementOfSet(HashSet<String> hs) {
			Iterator<String> it = hs.iterator();
			while(it.hasNext())
				System.out.println("Set's Value are => " + it.next());
	}

}
