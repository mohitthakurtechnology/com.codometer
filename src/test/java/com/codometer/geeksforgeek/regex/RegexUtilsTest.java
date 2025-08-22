package com.codometer.geeksforgeek.regex;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class RegexUtilsTest {
	
	  RegexUtils regexUtils = new RegexUtils();
	  boolean is;
	  
	  @Ignore
	  @Test
	  public void validIpAddressTest() {
		  
		  is = regexUtils.validIpAddress();
		  System.out.println("Is ==> "+ is);

	  }
	  @Ignore
	  @Test
	  public void removeContigousDuplicateWordsFromSentencesRegexTest() {
		  
		  is = regexUtils.removeContigousDuplicateWordsFromSentencesRegex();
		  System.out.println("Is ==> "+ is);

	  }
	  @Ignore
	  @Test
	  public void removeDuplicateWordsFromSentencesRegexTest() {
		  
		  is = regexUtils.removeDuplicateWordsFromSentencesRegex();
		  System.out.println("Dups Is ==> "+ is);
		  

	  }
	  @Ignore
	  @Test
	  public void findEveryOccurenceOfAWordInStringTest() {
		  
		  regexUtils.findEveryOccurenceOfAWordInString();
		  System.out.println("Dups Is ==> "+ is);

	  }
	  
	  @Test
	  public void validDateTest() {
			
			regexUtils.validDate();
			
		}
}