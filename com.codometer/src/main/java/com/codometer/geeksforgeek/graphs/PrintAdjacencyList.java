package com.codometer.geeksforgeek.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAdjacencyList {

	public static void main(String[] args) {
		
		int edges[][] = {{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
		int vertexes = 5;
		int latest = 0;  
	
		String s = "04:59:59AM";
		String [] clock = null;
        int hh;
        if(s.lastIndexOf('P') != -1)
        {
        	if(s.charAt(s.lastIndexOf('P')) == 'P')
        	{
	            clock = s.substring(0, s.lastIndexOf('P')).split(":");
	            System.out.println("clock => " + clock[0]);
	            System.out.println("clock => " + clock[1]);
	            System.out.println("clock => " + clock[2]);
	            hh = (Integer.parseInt(clock[0]) + 12 < 24) 
	            ? Integer.parseInt(clock[0]) + 12 
	            : (Integer.parseInt(clock[0]) + 12 > 24) 
	            ? (Integer.parseInt(clock[0]) + 12) - 24 : 00;
	            String hhh = (String.valueOf(hh).length() == 1) ? "0".concat(String.valueOf(hh)) : String.valueOf(hh);
	            System.out.println(hhh.concat(":").concat(clock[1]).concat(":").concat(clock[2]));
        	}
        }
        else
        {
            clock = s.substring(0, s.lastIndexOf('A')).split(":");
            hh = (Integer.parseInt(clock[0]) - 12 < 0) 
            ? (Integer.parseInt(clock[0]) - 12) * -1 : 00;
            String hhh = (String.valueOf(hh).length() == 1) ? "0".concat(String.valueOf(hh)) : String.valueOf(hh);
            System.out.println(String.valueOf(hhh).concat(":").concat(clock[1]).concat(":").concat(clock[2]));
        }
		
		List<Integer> x= new ArrayList<>();
		x.add(-4);
		x.add(3);
		x.add(-9);
		x.add(0);
		x.add(1);
		
		Float xx = Float.parseFloat(String.valueOf(x.stream().filter(ele -> ele > 0).count())) / Float.parseFloat("6");
		System.out.println("xx => "+ xx);
		List<List<Integer>> adjacencyList = new ArrayList<>();
		
		for(int i = 0;i < vertexes;i++)
			adjacencyList.add(new ArrayList<>());
		
		for(int i = 0;i < edges.length;i++)
		{
			for(int j = 0;j < edges[0].length;j++)
			{ 
				System.out.print(edges[i][j]);
				if(adjacencyList.get(edges[i][0]).isEmpty())
					adjacencyList.get(edges[i][0]).add(edges[i][j]);
				else
					adjacencyList.get(edges[i][0]).add(edges[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(adjacencyList);
		
		List<Integer> a = new ArrayList<>();
		// 1 2 3 4 3 2 1
		a.add(18);
		a.add(49);
		a.add(15);
		a.add(30);
		a.add(56);
		a.add(20);
		a.add(49);
		a.add(67);
		a.add(82);
		a.add(69);
		a.add(84);
		a.add(63);
		a.add(93);
		a.add(87);
		a.add(6);
		a.add(6);
		a.add(17);
		a.add(38);
		a.add(32);
		a.add(17);
		a.add(32);
		a.add(94);
		a.add(66);
		a.add(67);
		a.add(63);
		a.add(48);
		a.add(64);
		a.add(84);
		a.add(82);
		a.add(87);
		a.add(18);
		a.add(79);
		a.add(64);
		a.add(79);
		a.add(15);
		a.add(71);
		a.add(94);
		a.add(59);
		a.add(5);
		a.add(22);
		a.add(59);
		a.add(4);
		a.add(98);
		a.add(81);
		a.add(4);
		a.add(9);
		a.add(8);
		a.add(73);
		a.add(69);
		a.add(88);
		a.add(30);
		a.add(81);
		a.add(48);
		a.add(56);
		a.add(71);
		a.add(20);
		a.add(93);
		a.add(22);
		a.add(73);
		a.add(5);
		a.add(88);
		 int i,flag = 0;
	        List<Integer> cache = new ArrayList<>();
	        cache.add(a.get(0));
	        for(i = 0;i < a.size();i++)
	        {
	            flag = 0;
	            for(int j = 0;j < cache.size();j++)
	            {
	                if(cache.get(j) != a.get(i))
	                    flag++;
	            }
	            if(flag == cache.size())
	                cache.add(a.get(i));
	        }
        System.out.println("==========> "+cache.size());
		// ==================================================
	}
}