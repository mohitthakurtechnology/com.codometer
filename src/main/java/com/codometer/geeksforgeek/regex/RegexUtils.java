package com.codometer.geeksforgeek.regex;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils implements IRegex{
	
	Scanner scanner = new Scanner(System.in);
	
	String inputString,regexToEvaluate;
	Pattern pattern;
	Matcher matcher;
	
	boolean bool = false;

	@Override
	public boolean validIpAddress() {
		
		System.out.println("Enter input string ");
		
		inputString = scanner.nextLine();
		
	//	regexToEvaluate = "([0-3]{2})\\.(\\d{2})\\.(\\d{4})"; // date format
		
	//  regexToEvaluate = "([0-5]{1,3})\\.([0-5]{1,3})\\.([0-5]{1,3})\\.([0-5]{1,3})"; // Ip format 
		String address = "(([0-9]|[1-9][0-9])|([0-1]{1}[0-9]{0,1}[0-9]{0,1})|(2[0-5]{1}[0-5]{1}))";
	//  String address = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		
		regexToEvaluate = address.concat("\\.").concat(address).concat("\\.")
				.concat(address).concat("\\.").concat(address); // Ip format
		
		pattern = Pattern.compile(regexToEvaluate);
		matcher = pattern.matcher(inputString);
		
		while(matcher.find())
		{
			System.out.println("Start Index Is ==> " + matcher.start() +
					" End Index Is ==> " + matcher.end() + " Group is ==> " + matcher.group());
			bool = true;
		}
		return bool;
	}

	@Override
	public boolean removeContigousDuplicateWordsFromSentencesRegex() {
		
		System.out.println("Please Enter The Input String To Validate");
		inputString = scanner.nextLine();
		regexToEvaluate = "\\b(\\w+)(?:\\W+\\1\\b)+";
		
		Pattern pattern = Pattern.compile(regexToEvaluate);
		Matcher match = pattern.matcher(inputString);
		
		int count = 0;
		
		while(match.find())
		{
			inputString = inputString.replaceAll(match.group(), match.group(1));
		}
		
		System.out.println("inputString => " + inputString);
		
		bool = (count > 0) ? true : false;
		
		return bool;
		
	}

	@Override
	public boolean removeDuplicateWordsFromSentencesRegex() {
		
		System.out.println("Please Enter The Input String To Validate Dups");
		inputString = scanner.nextLine();
		
		regexToEvaluate = "(\\b\\w+\\b)((\\W\\1)|(.+\\1.+)|(.+\\1\\3.+))";
		
		Pattern pattern = Pattern.compile(regexToEvaluate);
		Matcher match = pattern.matcher(inputString);
		
		int count = 0;
		
		while(match.find())
		{
			
			count++;
			System.out.println("match.group(0) => " + match.group(0));
			System.out.println("match.group(0) => " + match.group(0));
			System.out.println("match.group(1) => " + match.group(1));
			System.out.println("match.group(2) => " + match.group(2));
			System.out.println("match.group(3) => " + match.group(3));
			System.out.println("count => " + count);
			
			inputString = inputString.replaceAll(match.group(), match.group(1));
			System.out.println("inputString => " + inputString);
			
		}
		
		System.out.println("inputString => " + inputString);
		
		return false;
	}

	@Override
	public void findEveryOccurenceOfAWordInString() {
		
		System.out.println("Please Enter The Input String To Validate Occurence");
		
		inputString = scanner.nextLine();
		
		regexToEvaluate = "(\\b\\w+\\b)+";
		
		Pattern pattern = Pattern.compile(regexToEvaluate);
		Matcher match = pattern.matcher(inputString);
		
		String matchedWord;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		int count = 0;
		
		while(match.find())
		{
			
			if(map.containsKey(match.group()))
				map.put(match.group(), map.get(match.group())+1);
			else
				map.put(match.group(), 1);
		}
		
		System.out.println("the occurence of word => " + map);	
	}

	@Override
	public void validDate() {
		System.out.println("Please Enter The Input String for valid date format");
		
		inputString = scanner.nextLine();
		
		regexToEvaluate = "([0-9]){1,2}=([0-9]){2}=([0-9]){4}"; //21-12-2012
		
		Pattern pattern = Pattern.compile(regexToEvaluate);
		Matcher matcher = pattern.matcher(inputString);
		
		while(matcher.find())
		{
			System.out.println("Starting Index => " + matcher.start() + "Ending Index => " + matcher.end()
			+ "Group Index => " + matcher.group());
		}
		
	}
}