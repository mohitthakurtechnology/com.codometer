package com.codometer.interview.problems.wipro;
import java.util.*;
/*
 * interview dated at 1/9/2025
 * remove special characters from the string and sort it according to numbers for examples "#dummy-32#tummy-36#rummy-28#jummy-45#"
 * should be sorted print in following manner
 * 28-rummy
 * 32-dummy
 * 36-tummy
 * 45-jummy
 */
public class String_Special_Characters_Removal_Sorting_According_To_Numbers
{
	public static void main(String args[])
	{

            int i,key; String value;
            
            TreeMap<Integer,String> hm = new TreeMap<>();
            
            Scanner sc = new Scanner(System.in);
            String names = sc.nextLine();
            
            String [] extractedNames = names.split("#");
      
            for(i = 0;i < extractedNames.length; i++)
            {
            	
                if(extractedNames[i].split("-").length>1)
                {
                	
                    hm.put(Integer.parseInt(extractedNames[i].split("-")[1]),extractedNames[i].split("-")[0]);
                }
                
            }
            Set<Map.Entry<Integer,String>> entries = hm.entrySet();
            System.out.println(entries);
    }     
}