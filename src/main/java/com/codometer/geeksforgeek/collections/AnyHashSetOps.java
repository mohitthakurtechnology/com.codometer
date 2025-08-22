package com.codometer.geeksforgeek.collections;

import java.util.HashSet;
import java.util.Iterator;

public class AnyHashSetOps<ANYTYPE> implements IAnyHashSetops<ANYTYPE> {
	
	private ANYTYPE anytype,anyelement;
	
	AnyHashSetOps(ANYTYPE anytype,ANYTYPE anyelement)
	{
		this.anytype = anytype;
		this.anyelement = anyelement;
	}

	@Override
	public void addElementToSet(HashSet<ANYTYPE> hs,ANYTYPE element) {
		hs.add(element); //insert
	}
	
	@Override
	public ANYTYPE readElementFromSet(HashSet<ANYTYPE> hs,ANYTYPE element) {
		return hs.contains(element) ? element : null;     // retrive
	}

	@Override
	public void deleteElementFromSet(HashSet<ANYTYPE> hs,ANYTYPE element) {
			hs.remove(element);
	}

	@Override
	public void printAllElementOfSet(HashSet<ANYTYPE> hs) {
		
			Iterator<ANYTYPE> it = hs.iterator();
			while(it.hasNext())
				System.out.println("Set's Value are => " + it.next());
			
	}

}
