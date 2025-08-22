package com.codometer.geeksforgeek.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class AnyTreeMapOps<ANYTYPE> implements IAnyTreeMap<ANYTYPE> {
	
	private ANYTYPE key,value;
	
	AnyTreeMapOps(ANYTYPE key,ANYTYPE value)
	{
		this.key = key;
		this.value = value;		
	}

	@Override
	public void addElementToTreeMap(TreeMap<ANYTYPE,ANYTYPE> hs,ANYTYPE key,ANYTYPE value) {
		hs.put(key,value); //insert
	}
	
	@Override
	public ANYTYPE readElementFromTreeMap(TreeMap<ANYTYPE,ANYTYPE> hs,ANYTYPE key) {
		return hs.containsKey(key) ? hs.get(key) : null;     // retrive
	}

	@Override
	public ANYTYPE deleteElementFromTreeMap(TreeMap<ANYTYPE,ANYTYPE> hs,ANYTYPE key) {
		return hs.remove(key);  //delete 
	}

	@Override
	public void printAllElementOfTreeMap(TreeMap<ANYTYPE,ANYTYPE> hs) {
		
			Set<Entry<ANYTYPE, ANYTYPE>> keyset = hs.entrySet();
			Iterator<Entry<ANYTYPE, ANYTYPE>> it = keyset.iterator();
			
			while(it.hasNext())
			{
				Map.Entry<ANYTYPE,ANYTYPE> entry = it.next();
				System.out.println("TreeMap's entry key is => " + entry.getKey() + "TreeMap's entry value is => " + entry.getValue());
			}
			
			System.out.println("Treemap as a whole => " + hs );
	
	}

	@Override
	public void addMultipleElementToTreeMap(TreeMap<ANYTYPE, ANYTYPE> treemap) {
		
		int pressKey;
	
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("Please enter key .... ");
			key = (ANYTYPE) scanner.next();
			
			System.out.println("Please enter value .... ");
			value = (ANYTYPE) scanner.next();
			
			treemap.put(key, value);
			System.out.println("press 0 to continue .... ");
			
			pressKey = scanner.nextInt();
			
		}while(pressKey == 0);
	}

}
