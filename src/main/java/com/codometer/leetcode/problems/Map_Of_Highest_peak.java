package com.codometer.leetcode.problems;

public class Map_Of_Highest_peak {
	public int[][] highestPeak(int[][] isWater) {
               
		//int[][] a = new int[isWater.length][isWater[0].length];
        int k,entry = 0,match = 0,waterCell = 0;
        int a[][] = {{0,1},{0,0}};
        
        for(int i = 0;i < isWater.length;i++)
        {
            for(int j = 0;j < isWater[0].length;j++)
                a[i][j] = (isWater[i][j] == 1) ? 0 : 1;
        }

        for(int i = 0;i < isWater.length;i++)
        {
            for(int j = 0;j < isWater[0].length;j++)
            {
                if(i + 1 < isWater[0].length)
                {
                    entry++;
                    k = (a[i][j] + 1) - a[i+1][j];
                    k = k > 0 ? k : k * -1;
                    if(k <= 1 && k >= 0)
                        match++;
                    if(a[i][j] == 0)
                        waterCell = 1;
                }
                if(j + 1 < isWater[0].length)
                {
                    entry++;
                    k = (a[i][j] + 1) - a[i][j+1];
                    k = k > 0 ? k : k * -1;
                    if(k <= 1 && k >= 0)
                        match++;
                    if(a[i][j] == 0)
                        waterCell = 1;
                }
                if(i - 1 >= 0)
                {
                    entry++;
                    k = (a[i][j] + 1) - a[i-1][j];
                    k = k > 0 ? k : k * -1;
                    if(k <= 1 && k >= 0)
                        match++;
                    if(a[i][j] == 0)
                        waterCell = 1;
                }
                if(j - 1 >= 0)
                {
                    entry++;
                    k = (a[i][j] + 1) - a[i][j-1];
                    k = k > 0 ? k : k * -1;
                    if(k <= 1 && k >= 0)
                        match++;
                    if(a[i][j] == 0)
                        waterCell = 1;
                }
                if(match >= 2 && match == entry && waterCell == 0)
                    a[i][j] = a[i][j] + 1;
                match = 0;
                entry = 0;
                waterCell = 0;
            }
        }
        for(int i = 0;i < a[0].length;i++)
	    {
	    	for(int j = 0;j < a.length;j++)
	    	{
	    		System.out.print(a[i][j]);
	    		System.out.print(" ");
	    	}
	    	System.out.println("");
	    }
        return a;
    }
}
