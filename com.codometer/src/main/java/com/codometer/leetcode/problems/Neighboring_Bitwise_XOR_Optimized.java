package com.codometer.leetcode.problems;

public class Neighboring_Bitwise_XOR_Optimized {

	public static void main(String[] args) {
		
		int[] derived = {1,1,0};
		int flag = 0,numberOfZerosOrOne,i,j,k = 0;
	    int[][] expectedBinaryArray = new int[derived.length][(int) Math.pow(2,derived.length)];
	    numberOfZerosOrOne = expectedBinaryArray[0].length / 2;
	    
	    for(i = 0;i < derived.length;i++)
	    {
	        for(j = 0;j < expectedBinaryArray[0].length;j++)
	        {
	            for( k = 0;k < numberOfZerosOrOne;k++)
	            { 
	            	expectedBinaryArray[i][j + k] = (flag == 1) ? 1 : 0;
                }
	            j = j + (k - 1);
	            flag = (flag == 0) ? 1 : 0;
	        }
	        numberOfZerosOrOne = numberOfZerosOrOne / 2;
	    }
	    
	    for(i = 0;i < expectedBinaryArray[0].length;i++)
	    {
	    	for(j = 0;j < expectedBinaryArray.length;j++)
	    	{
	    		System.out.print(expectedBinaryArray[j][i]);
	    		System.out.print(" ");
	    	}
	    	System.out.println("");
	    }
	   int m;
	    for(i = 0;i < expectedBinaryArray[0].length;i++)
	    {
	    	m = 0;
	    	for(j = 0;j < expectedBinaryArray.length;j++)
	    	{ 
	    		if(j == expectedBinaryArray.length - 1)
	    		{
	    			if(derived[j] != (expectedBinaryArray[j][i] ^ expectedBinaryArray[0][i]))
	   				{
	    				System.out.println("false");
	    				j = expectedBinaryArray.length;
	   				}
	    			else
	    			{
	    				derived[j] = (expectedBinaryArray[j][i] ^ expectedBinaryArray[0][i]);
	    				m++;
	    			}
	   			}
    			else if(j < expectedBinaryArray.length ){
	    			if(derived[j] != (expectedBinaryArray[j][i] ^ expectedBinaryArray[j+1][i]))
	    			{
	    				System.out.println("false");
	    				j = expectedBinaryArray.length;
	    			}
	    			else
	    			{
	    				m++;
	    			}
	   			}
	    		if(m == derived.length)
	    			System.out.println("True");
			}
    	}
	}
}