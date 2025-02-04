package com.codometer.leetcode.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring_Matching_Pattern {


public static boolean hasMatch(String s, String p) {
        
        Pattern pattern; Matcher match;
        String pat;
        if(p.length() > 1)
        {
            String []patternSplit = p.split("\\*");
            pat = (patternSplit.length > 1) ? 
        		"[a-zA-Z]*" + patternSplit[0] + "[a-zA-Z]*" + patternSplit[1] + "[a-zA-Z]*" 
        				:  "[a-zA-Z]*" + patternSplit[0] + "[a-zA-Z]*";
        }
        else
        {
        	pat = "[a-zA-Z]";
        }
        pattern = Pattern.compile(pat);
        match = pattern.matcher(s);
        System.out.println(pattern.pattern());

        return match.matches() ? true : false;
    }
	public static void main(String []args)
	{
		String mainString = "L";
		String patternToBeMatched = "*";
		System.out.println(Substring_Matching_Pattern.hasMatch(mainString, patternToBeMatched));
	}
}
