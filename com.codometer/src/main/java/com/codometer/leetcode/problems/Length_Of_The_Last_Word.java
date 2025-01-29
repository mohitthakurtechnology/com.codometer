package com.codometer.leetcode.problems;

public class Length_Of_The_Last_Word {

	public static void main(String[] args) {
		String s = "   fly  ";
		s = s.trim();
	    String[] word = s.split(" ");
	    System.out.println(word[word.length - 1].length());
	}

}
