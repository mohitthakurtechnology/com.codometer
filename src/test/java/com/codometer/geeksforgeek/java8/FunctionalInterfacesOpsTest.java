package com.codometer.geeksforgeek.java8;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class FunctionalInterfacesOpsTest {
	
	FunctionalInterfacesOps functionalInterfacesOps = new FunctionalInterfacesOps();

  @Test
  public void programusinglambdaaddintegersbiconsumerTest() {
	  functionalInterfacesOps.programusinglambdaaddintegersbiconsumer();
  }

  @Test
  public void programusinglambdaaddintegersbifuncTest() {
	  functionalInterfacesOps.programusinglambdaaddintegersbifunc();
  }

  @Test
  public void programusinglambdaaddintegersconsumerTest() {
	  functionalInterfacesOps.programusinglambdaaddintegersconsumer();
  }

  @Test
  public void programusinglambdaaddintegersfuncTest() {
	  functionalInterfacesOps.programusinglambdaaddintegersfunc();
  }

  @Test
  public void programusinglambdaaddintegerssupplierTest() {
	  functionalInterfacesOps.programusinglambdaaddintegerssupplier();
  }
  
  @Test
  public void programtofilterprintevennumbersfromlistbifuncTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistbifunc();;
  }

  @Test
  public void programtofilterprintevennumbersfromlistfuncTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistfunc();
  }

  @Test
  public void programtofilterprintevennumbersfromlistsupplierTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistsupplier();
  }

  @Test
  public void programtofilterprintevennumbersfromlistconsumerTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistconsumer();
  }

  @Test
  public void programtofilterprintevennumbersfromlistbiconsumerTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistbiconsumer();
  }
  
  @Test
  public void programtofilterprintevennumbersfromlistpredicateTest() {
	  functionalInterfacesOps.programtofilterprintevennumbersfromlistpredicate();
  }

  @Test
	public void programtomapintegerstotheirsquaresandprintresultsbifuncTest() {
		
	  functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultsbifunc();
		
	}

  	@Test
	public void programtomapintegerstotheirsquaresandprintresultsfuncTest() {
		
  		functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultsfunc();
		
	}

  	@Test
	public void programtomapintegerstotheirsquaresandprintresultssupplierTest() {

  		functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultssupplier();
		
	}

  	@Test
	public void programtomapintegerstotheirsquaresandprintresultsconsumerTest() {
		
  		functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultsconsumer();
		
	}

  	@Test
	public void programtomapintegerstotheirsquaresandprintresultsbiconsumerTest() {
		
  		functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultsbiconsumer();
		
	}

  	@Test
	public void programtomapintegerstotheirsquaresandprintresultspredicateTest() {
		
  		functionalInterfacesOps.programtomapintegerstotheirsquaresandprintresultspredicate();
		
	}
  	
  	@Test
	public void programtofindandprintmaxvaluefromlistTest() {
		
  		functionalInterfacesOps.programtofindandprintmaxvaluefromlist();
		
	}
  	
  	@Test
	public void programtocountandprintnumberofelementsalistTest() {
		
  		functionalInterfacesOps.programtocountandprintnumberofelementsalist();
		
	}
  	
	@Test
	public void programtoreducealistofintegerstotheirsumTest() {
		
		functionalInterfacesOps.programtoreducealistofintegerstotheirsum();
		
	}
	
	@Test
	public void programtoreducealistofintegerstotheirmulTest() {
		
		functionalInterfacesOps.programtoreducealistofintegerstotheirmul();
		
	}
	
	@Test
	public void programtoprintthelengthsofstringsinalistTest() {
		
		functionalInterfacesOps.programtoprintthelengthsofstringsinalist();
		
	}
	
	@Test
	public void programtoprintdistinctelementsfromalistofintegersTest() {
		
		functionalInterfacesOps.programtoprintdistinctelementsfromalistofintegers();
		
	}
	
	@Test
	public void programtoprintnamessortedinalphabeticalorderfromalistTest() {
		
		functionalInterfacesOps.programtoprintnamessortedinalphabeticalorderfromalist();
		
	}
	
	@Test
	public void programtogroupstringsbytheirlengthsandprintgroups() {
		
		functionalInterfacesOps.programtogroupstringsbytheirlengthsandprintgroups();
		
	}
	
	@Test
	public void mostcommonwordfindinparagraphTest() {
		
		/*
		 * 	Given a string paragraph and a string array of the banned words banned, 
		 * 	return the most frequent word that is not banned. 
		 * 	It is guaranteed there is at least one word that is not banned, and that the answer is unique.
			The words in paragraph are case-insensitive and the answer should be returned in lowercase.
			Note that words can not contain punctuation symbols.			
		 */
		
		String []ban = {"occurence","the"};
		
		functionalInterfacesOps.mostcommonwordfindinparagraph("this api api api api and api we the occurence and the the occurence of the words", ban);
			
	}
	

	
	@Test
	public void programtopickevenfromthelistTest() {
		
		functionalInterfacesOps.programtopickevenfromthelist();
		
	}
	
	@Test
	public void programtocheckoddinthelistTest() {
		
		functionalInterfacesOps.programtocheckoddinthelist();
	
	}
  	
}
