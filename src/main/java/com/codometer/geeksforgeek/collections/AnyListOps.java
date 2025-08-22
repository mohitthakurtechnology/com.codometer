package com.codometer.geeksforgeek.collections;

import java.util.Iterator;
import java.util.List;

public class AnyListOps<ANYTYPE> implements IAnyList<ANYTYPE> {
	
	private ANYTYPE anytype,anyelement;
	
	AnyListOps(ANYTYPE anytype,ANYTYPE anyelement)
	{
		this.anytype = anytype;
		this.anyelement = anyelement;
	}

	@Override
	public void addElementToList(List<ANYTYPE> hs,ANYTYPE element) {
		hs.add(element); //insert
	}
	
	@Override
	public ANYTYPE readElementFromList(List<ANYTYPE> hs,ANYTYPE element) {
		return hs.contains(element) ? element : null;     // retrive
	}

	@Override
	public boolean deleteElementFromList(List<ANYTYPE> hs,ANYTYPE element) {
			return hs.remove(element);
	}

	@Override
	public void printAllElementsOfList(List<ANYTYPE> hs) {
		
			Iterator<ANYTYPE> it = hs.iterator();
			while(it.hasNext())
				System.out.println("List's Value are => " + it.next());
			System.out.println("Whole List is => " + hs);
	}

}
