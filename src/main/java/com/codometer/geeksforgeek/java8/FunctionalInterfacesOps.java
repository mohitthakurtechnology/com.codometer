package com.codometer.geeksforgeek.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfacesOps implements IFunctionalInterfaces {
	
	List<Integer> numberList = Arrays.asList(12,23,34,40,33,22,11,55,78,56,4,3,45,67,34,23);
	
	List<String> stringList = Arrays.asList("Checks","Validate","Santa","Ekagra","Mohit","Thakur");
	
	List<Integer> dupList = Arrays.asList(12,33,33,45,33,22,12,55,78,56,45,33,45,67,34,33);
	
	
	//higher order functions

	@Override
	public void programusinglambdaaddintegersbifunc() {
		
		BiFunction<Integer,Integer,Integer> sum = (a,b) -> a + b;
		
		Integer result = sum.apply(40, 50); //90
		
		System.out.println("Sum of 2 numbers using BiFunction is => " + result);
		
	}
	
	@Override
	public void programusinglambdaaddintegersfunc() {
		
		Function<Integer,Integer> sum = b -> b + b;
		Integer result = sum.apply(40);

		System.out.println("Sum of 2 numbers using Function is => " + result);  // 80
		
	}

	@Override
	public void programusinglambdaaddintegerssupplier() {
		
		Supplier<Integer> supplier = () -> 10 + 10 ;
		Integer result = supplier.get();//60
		
		System.out.println("Sum of 2 numbers using supplier is => " + result);
		
	}

	@Override
	public void programusinglambdaaddintegersconsumer() {
		Consumer<Integer> sum = b -> System.out.println("sum of 2 numbers using consumer is ==> "+ (b+b));
		sum.accept(30);//60
		
	}

	@Override
	public void programusinglambdaaddintegersbiconsumer() {
		
		BiConsumer<Integer,Integer> sum = (a,b) -> System.out.println("sum of 2 numbers using biconsumer is ==> "+ (a+b));
		sum.accept(30,60);//90
		
	}

	@Override
	public void programtofilterprintevennumbersfromlistbifunc() {
		
		BiFunction<List<Integer>,Integer,List<Integer>> evenList = (numberList,b) -> numberList.stream().filter(x -> x % 2 == 0).toList();
		
		System.out.println("even filter numbers using Bifucntion is ==> " + evenList.apply(numberList, 0));
		
	}

	@Override
	public void programtofilterprintevennumbersfromlistfunc() {

		Function<List<Integer>,List<Integer>> evenList = numberList -> numberList.stream().filter(x -> x % 2 == 0).toList();
		
		System.out.println("even filter numbers using fucntion is ==> " + evenList.apply(numberList));
		
	}

	@Override
	public void programtofilterprintevennumbersfromlistsupplier() {
		
		Supplier<List<Integer>> evenList = () -> numberList.stream().filter(x -> x % 2 == 0).toList();
		System.out.println("even filter numbers using Supplier is ==> " + evenList.get());

	}

	@Override
	public void programtofilterprintevennumbersfromlistconsumer() {
		
		Consumer<List<Integer>> evenlist = numberList -> System.out.println("even filter numbers using consumer is ==> " + numberList.stream().filter(x -> x % 2 == 0).toList());
		
		evenlist.accept(numberList);
		
	}

	@Override
	public void programtofilterprintevennumbersfromlistbiconsumer() {
		
		BiConsumer<List<Integer>,List<Integer>> evenList = (numberList,list2) -> System.out.println("even filter numbers using bi-consumer is ==> " + numberList.stream().filter(x -> x % 2 == 0).toList());
		
		evenList.accept(numberList, null);
		
	}

	@Override
	public void programtofilterprintevennumbersfromlistpredicate() {
		
		Predicate<List<Integer>> evenList = numberList -> numberList.stream().filter(x -> x % 2 == 0).toList().size() > 0;
		
		System.out.println(evenList.test(numberList) + " even list using predicate");
		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultsbifunc() {
		
		BiFunction<List<Integer>,Integer,List<Integer>> squreMapOfNumbers = (numberList,b) -> numberList.stream().map(x -> x * x).toList();
		
		System.out.println("square map of numbers using Bi-fucntion is ==> " + squreMapOfNumbers.apply(numberList, 0));
		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultsfunc() {
		
		Function<List<Integer>,List<Integer>> squreMapOfNumbers = numberList -> numberList.stream().map(x -> x * x).toList();
		
		System.out.println("square map of numbers using fucntion is ==> " + squreMapOfNumbers.apply(numberList));

		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultssupplier() {

		Supplier<List<Integer>> squreMapOfNumbers = () -> numberList.stream().map(x -> x * x).toList();
		System.out.println("square map of numbers using Supplier is ==> " + squreMapOfNumbers.get());
		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultsconsumer() {
		
		Consumer<List<Integer>> squreMapOfNumbers = numberList -> System.out.println("square map of numbers using consumer is ==> " + numberList.stream().map(x -> x * x).toList());
		
		squreMapOfNumbers.accept(numberList);
		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultsbiconsumer() {
		
		BiConsumer<List<Integer>,List<Integer>> squreMapOfNumbers = (numberList,list2) -> System.out.println("square map of numbers using bi-consumer is ==> " + numberList.stream().map(x -> x * x).toList());
		
		squreMapOfNumbers.accept(numberList, null);
		
	}

	@Override
	public void programtomapintegerstotheirsquaresandprintresultspredicate() {
		
		//Predicate<List<Integer>> evenList = numberList -> numberList.stream().map(x -> x * x).toList().size() > 0;
		
		System.out.println(" NA square map list using predicate");
		
	}

	@Override
	public void programtofindandprintmaxvaluefromlist() {
		
		System.out.println("Max Value is => " + numberList.stream().max((num1,num2) -> num1<num2 ? -1 : num1>num2 ? 1 : 0).get());
		
	}

	@Override
	public void programtocountandprintnumberofelementsalist() {
		
		System.out.println("Total Number Of Elements Are ==> " + numberList.stream().count());
		
	}
	
	@Override
	public void programtoreducealistofintegerstotheirsum() {
		
		System.out.println("Sum Of Elements Are ==> " + numberList.stream().reduce(0, (a,b) -> a + b));
		
	}
	
	@Override
	public void programtoreducealistofintegerstotheirmul() {
		
		System.out.println("Multi Of Elements Are ==> " + numberList.stream().reduce((a,b) -> a * b).get());
		
	}

	@Override
	public void programtoprintthelengthsofstringsinalist() {
		
		List<Integer> stringListWithLength = stringList.stream().map(string -> string.length()).toList();
		
		System.out.println(" Lengths of strings are => " + stringListWithLength);
		
	}

	@Override
	public void programtoprintdistinctelementsfromalistofintegers() {
		
		System.out.println(" List post dup removal is => " + dupList.stream().distinct().toList());
		
	}

	@Override
	public void programtoprintnamessortedinalphabeticalorderfromalist() {
		
		System.out.println(stringList.stream().sorted().toList());
		stringList.stream().collect(Collectors.groupingBy(string -> string.length()));
		
	}

	@Override
	public void programtogroupstringsbytheirlengthsandprintgroups() {
		
		System.out.println(" group by strings are => " + stringList.stream().collect(Collectors.groupingBy(string -> string.length())));
		
	}

	@Override
	public void mostcommonwordfindinparagraph(String paragraph,String []bannedwords) {
		
		/*
		 * 	Given a string paragraph and a string array of the banned words banned, 
		 * 	return the most frequent word that is not banned. 
		 * 	It is guaranteed there is at least one word that is not banned, and that the answer is unique.
			The words in paragraph are case-insensitive and the answer should be returned in lowercase.
			Note that words can not contain punctuation symbols.		
		 *
		 */
		
		HashMap<String,Integer> map = new HashMap<>();
		
		List<String> l1 = Arrays.stream(paragraph.split(" ")).filter(x -> Arrays.asList(bannedwords).contains(x) == false).toList();
		
		for(String ele : l1)
		{
			if (map.containsKey(ele) == true)
				map.put(ele, map.get(ele)+1);
			else
				map.put(ele, 1);
		}
		
		
		
		System.out.println(" most frequent word that is not banned is ==> " + map.entrySet().stream().max((entry1,entry2) -> (entry1.getValue() > entry2.getValue()) ? 1 : (entry1.getValue() < entry2.getValue()) ? -1 : 0).get());
	}

	@Override
	public void programtopickevenfromthelist() {
		
		System.out.println(" Even list is ----> " + numberList.stream().filter(x -> x % 2 == 0).toList());
		
	}

	@Override
	public void programtocheckoddinthelist() {
		
		String string = "this is the string mohit thakur";
		
		System.out.println("any odd number in the list -->" + numberList.stream().anyMatch(x -> x % 2 != 0));
		System.out.println("all odd number in the list -->" + numberList.stream().allMatch(x -> x % 2 != 0));
	}
}
