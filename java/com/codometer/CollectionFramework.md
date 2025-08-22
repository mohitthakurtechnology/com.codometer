#Collection Framework

#Collection Class
	Collections.addALL(Collection e, e element)
	-- used to add element or array of element to the collection or list

#Arrays Class	
	Arrays.sort(1d Array - int[])
	-- used for sorting the array in default natural sorting order
	-- ascending order

	Arrays.sort(1d Array - int[],comparator)
	-- used for sorting the array in dscending order

	Arrays.stream(int[] or any type of array)
	-- arrays can be converted to stream.

#HashMaps
	--We can iterate through hashMap using iterator
	--We can iterate through hashMap using Map.Entry<String,String> in advanced for loop

#LinkedLists
	--linkedlist work same fashion as list
	--we can iterate through it using forEach loop lambda or with advance for loop 

#Sets
	--set or hashSet is already sorted in the default natural sorting order 
    --if you want to achieve the customize sorting 
	 --then we need to convert the set to list or to TreeSet.
    --TreeSet constructor take a Comparator Interface object as parameter in it
    --Arrays.sort(Comparator c),Collections.sort(Comparator c) can take Comparator Object as argument
  
	How to use it ? 
	-- we create a customize class implementing the Comparator Functional Interface 
	and override   the compareTo()method of the comparator class comparing to objects
	object 1 and object 2
		
		for example :
		
		Class Sort implements Comparator
		{
			int compare(Object1,Object2)
			{
				if(Object1 > Object2)
					return -1;
				else if(object1 < Object2)
					return 1;
				else
					return 0;
			}
		}
		
	-- and now the since our customized class is ready we can create its object and 
	pass it as an argument wherever customized sorting is needed 
	like Arrays.sort(Sort object),Collections.sort(Sort object)
	-- Comparator is a Functional interface where we can use lambda expression 
	to bring functional programming into the context.