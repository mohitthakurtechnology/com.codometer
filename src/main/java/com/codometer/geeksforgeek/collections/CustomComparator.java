package com.codometer.geeksforgeek.collections;

import java.util.Comparator;

public class CustomComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1,i2;
		
		i1 = Integer.parseInt(o1.toString());
		i2 = Integer.parseInt(o2.toString());
		
		if(i1 < i2)
				return -1;
		else if(i1 > i2)
				return 1;
		else
			return 0;
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}