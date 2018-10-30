package com;

import java.util.Arrays;

public class Array_Partition_I 
{

	public static void main(String[] args) 
	{
		int nums[] = {1,2,4,3};
		System.out.println(arrayPairSum(nums));


	}
	
	public static  int arrayPairSum(int[] nums) 
	{
        int numberOfRows = nums.length/2;
        int[][] arr = new int[numberOfRows][2];
        Arrays.sort(nums);
        
        int m =0;
        for (int i =0; i<nums.length && m < arr.length; i = i+2 ,m++)
        {
//        	System.out.println("i:"+i);
        	{
//        		System.out.println("m:"+m);
        		arr[m][0] = nums[i];
        		arr[m][1] = nums[i+1];
        	}
        }
        
//        for (int i =0; i<arr.length; i++)
//        {
//        	for (int j =0;j < arr[0].length ; j++)
//        	{
//        		System.out.print(arr[i][j] +"  ");
//        	}
//        	System.out.println();
//        }
        
        
        int count = 0;
        for (int i =0; i<arr.length; i++)
        {
        	count  += Math.min(arr[i][0], arr[i][1]);
        }
        
        
        return count;
    }


}
