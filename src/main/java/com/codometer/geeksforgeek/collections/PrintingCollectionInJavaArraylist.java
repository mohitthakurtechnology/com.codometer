package com.codometer.geeksforgeek.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintingCollectionInJavaArraylist 
{
    public static void main( String[] args )
    {
    	
        String []string = {"Lucky","Pinky","Mohit Thakur","Urvashi Thakur","Ekagra Thakur","Santa","Little Santa"};
        Integer [] iArray = {3,45,2,34,30,20,15,27};
        
        List<String> arraylist = new ArrayList<>();
        
        List<Integer> arraylist1 = Arrays.asList(iArray);
       
        Collections.addAll(arraylist, string);
      //  Collections.sort(arraylist1); //default natural Sorting
      //  Collections.sort(arraylist1, new CustomComparator());
      //  Collections.sort(arraylist1, (ele1,ele2) -> (ele1.compareTo(ele2) < 0 ) ? 1 : (ele1.compareTo(ele2) > 0) ? -1 : 0);
        System.out.println(arraylist1);
        System.out.println(arraylist1);
    }
}