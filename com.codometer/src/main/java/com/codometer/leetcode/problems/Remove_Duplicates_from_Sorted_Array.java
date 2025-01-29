package com.codometer.leetcode.problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		
		 int i,j,k = 0,count = 0;
		 int nums[] = {1,1,2};
		 for(i = 0;i < nums.length;i++)
	        {
	            for(j = i;j < nums.length;j++)
	            {
	                if(j < nums.length - 1 && nums[i] == nums[j + 1])
	                {
	                    if(k == 0)
	                    {
	                        count++;
	                        k = 1;
	                    }
	                }
	            }
	            if(k == 0)
	            {
	                count++;
	                k = 1;
	            }
	            else
	                k = 0;
	        }
	}

}
