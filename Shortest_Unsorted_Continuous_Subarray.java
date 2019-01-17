package com;

import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray 
{
	public static void main(String[] args) 
	{
		int[] inp = new int[]{2, 6, 4, 8, 10, 9, 15};
		Shortest_Unsorted_Continuous_Subarray m = new Shortest_Unsorted_Continuous_Subarray();
		System.out.println(m.findUnsortedSubarray(inp));
		
	}
	
	public int findUnsortedSubarray(int[] nums) 
	{
		int n = nums.length;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        
        int start = 0;
        while (start < n  && nums[start] == temp[start]) start++;
        
        int end = n - 1;
        while (end > start  && nums[end] == temp[end]) end--;
        
        return end - start + 1;
    }

}
