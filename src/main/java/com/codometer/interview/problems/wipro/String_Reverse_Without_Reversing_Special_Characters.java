package com.codometer.interview.problems.wipro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * interview dated at 1/15/2025
 * reverse a string without changing special character position
 * input=a#bhiji&t // output=t#ijihb&a
 */

public class String_Reverse_Without_Reversing_Special_Characters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		char [] outputCharArray = new char[input.length()];
		HashMap<Integer,Character> hs = new HashMap<>();
		String output = null;
		int j = 0;
		
		for(int i = input.length()-1;i >= 0;i--)
		{			
			if(input.charAt(i) == '&' || input.charAt(i) == '#')
			{
				hs.put(input.indexOf(input.charAt(i)), input.charAt(i));
				outputCharArray[j] = ' ';
				j++;
			}
			else
			{
				outputCharArray[j] = input.charAt(i);
				j++;
			}
		}
		for(Map.Entry<Integer, Character> entry : hs.entrySet())
			outputCharArray[entry.getKey()] = entry.getValue();
		
		output = output.copyValueOf(outputCharArray);
		
		System.out.println("output => " + output);
	}
}