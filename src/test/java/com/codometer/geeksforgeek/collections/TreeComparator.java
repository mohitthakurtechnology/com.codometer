package com.codometer.geeksforgeek.collections;

import java.util.Comparator;

public class TreeComparator implements Comparator{

	@Override
	public int compare(Object object1, Object object2) {

		Integer upperBound = Integer.parseInt(object2.toString());
		Integer lowerBound = Integer.parseInt(object1.toString());

		
		if(lowerBound < upperBound)
			return -1;
		else if(lowerBound > upperBound)
			return 1;
		else
			return 0;
	}

}
