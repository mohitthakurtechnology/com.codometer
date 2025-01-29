package com.codometer.leetcode.problems;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.*;

class Parse {
    public static String isValid(String s) {
        
        int i = 0,j = 0;
        ArrayList<Character> array = new ArrayList<>();
        while(i < s.length())
        {
        	if(s.charAt(i) == '{' || s.charAt(i) == '(')
        	{
        		array.add(s.charAt(i));
        		j++;
        	}
        	else if(j > 0 && s.charAt(i) == '}')
        	{
        		if(array.get(j - 1) == '{')
        		{
        				array.remove(j - 1);
        				j--;
        		}
        	}
        	else if(j > 0 && s.charAt(i) == ')')
        	{
        		if(array.get(j - 1) == '(')
        		{
        			array.remove(j - 1);
        			j--;
        		}
        	}
        	i++;
        }
        return array.size() == 0 ? "true" : "false";
    }
    
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	while(in.hasNextLine())
    	{
    		System.out.println("is => "+ Parse.isValid(in.next()));
    	}
    	in.close();
    }
}