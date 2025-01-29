package com.codometer.geeksforgeek.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * given array of string ,coverting into collection and print it
 *
 */
public class PrintingCollectionInJavaArraylist 
{
    public static void main( String[] args )
    {
        String []string = {"Lucky","Pinky",
        "Mohit Thakur","Urvashi Thakur","Ekagra Thakur","Santa","Little Santa"};
        
        List<String> arraylist = new ArrayList<>();
       
        Collections.addAll(arraylist, string);
        
        System.out.println(arraylist);
        
        // another approach is to convert array to stream and loop through it
        // and add element to the list and then pass list to collections.addAll
    }
}
