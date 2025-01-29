package com.codometer.geeksforgeek.hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Input: HashSet: [Geeks, For, ForGeeks, GeeksforGeeks]
 * Output: [For, ForGeeks, Geeks, GeeksforGeeks]
 *
 * either use treeset or convert set to the treeset and use the comparator for other than default natural sorting
 */
public class HowtoSortHashSetinJava 
{
    public static void main( String[] args )
    {    	
    	TreeSet<String> set = new TreeSet<>((element1,element2) -> element1.compareTo(element2) > 0 ? 1 : element1.compareTo(element2) < 0 ? -1:0);
    	set.add("Geeks");
    	set.add("For");
    	set.add("ForGeeks");
    	set.add("GeeksforGeeks");
//    	set.add("practice");
//    	set.add("geeks");
//    	set.add("contribute");
//    	set.add("ide");
        
        System.out.println(set);
    }
}
