package com.codometer.geeksforgeek.linkedlist;

import java.util.LinkedList;

/**
 * 
 */
public class HowtoIterateLinkedListinJava 
{
    public static void main( String[] args )
    {
        LinkedList<Integer> list = new LinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        list.forEach(element -> System.out.println(element));
    }
}
