package com.codometer.geeksforgeek.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: { "A" = "Angular" , "P": "Python" , "J" = "Java" , "H" = "Hibernate" }
	Output: P = Python
              A = Angular
              H = Hibernate
               J = Java
 *
 */
public class HowtoIterateHashMapinJava 
{
    public static void main( String[] args )
    {
        HashMap<String,String> map = new HashMap<>();
        
        map.put("A","Angular");
        map.put("P","Python");
        map.put("J","Java");
        map.put("H","Hibernate");
        
        for(Map.Entry<String, String> m:map.entrySet())
        	System.out.println(m.getKey() + "=" + m.getValue());
    }
}
