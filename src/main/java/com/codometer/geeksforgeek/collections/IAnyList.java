package com.codometer.geeksforgeek.collections;

import java.util.*;

public interface IAnyList<ANYTYPE> {
	
		void addElementToList(List<ANYTYPE> list,ANYTYPE element);
		ANYTYPE readElementFromList(List<ANYTYPE> list,ANYTYPE element);
		boolean deleteElementFromList(List<ANYTYPE> list,ANYTYPE element);
		void printAllElementsOfList(List<ANYTYPE> list);
		
}