package com.codometer.leetcode.problems;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.*;

class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        String longestSubString = new String();
        Set<Character> set = new HashSet<>();
        for(int i = 0;i < s.length();i++)
        {
            for(int j = i;j < s.length();j++)
            {
            	System.out.println(s.substring(i,j));
                Pattern pattern = Pattern.compile(s.substring(i,j));
                Matcher m = pattern.matcher(s);
                while(m.find())
                {
                    if(longestSubString.length() < m.group().length())
                        longestSubString = m.group();
                }
            }
        }
        return longestSubString.length();
    }
    public static void main(String args[])
    {
    	int len;
    	Longest_Substring_Without_Repeating_Characters solution = new Longest_Substring_Without_Repeating_Characters();
    	len = solution.lengthOfLongestSubstring("abcabcbb");
    	System.out.println("len is => "+ len);
    }
}