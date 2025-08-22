package com.codometer.geeksforgeek.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: Number of Elements to be Added: 3
            Elements to be Added : "A" , "B" , "C"
			Output:  list=[ A, B, C ]
 *
 */
public class HowtoAddanElementinJavaArrayList 
{
    public static void main( String[] args )
    {
        int size_of_list = 3;
        
        List<Character> list = new ArrayList<>();
        
        list.add('A');
        list.add('B');
        list.add('C');
        
        System.out.println(list);
        
    }
}
