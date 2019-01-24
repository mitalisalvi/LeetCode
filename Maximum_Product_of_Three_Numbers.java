package com;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers 
{
	public static void main(String[] args) 
	{
		int[] nums = {-4,-3,-2,-1,60};
		Maximum_Product_of_Three_Numbers m = new Maximum_Product_of_Three_Numbers();
		System.out.println(m.maximumProduct(nums));
		
	}
	
	public int maximumProduct(int[] nums) 
	{
		
		 Arrays.sort(nums);
         //One of the Three Numbers is the maximum value in the array.

         int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
         int b = nums[0] * nums[1] * nums[nums.length - 1];
         return a > b ? a : b;
        
    }

}
