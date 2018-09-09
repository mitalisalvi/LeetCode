package com;

public class Minimum_Moves_to_Equal_Array_Elements {

	public static void main(String[] args) {
		int nums[]={1,2,3,4};
		int result = minMoves(nums);
		System.out.println("result:"+result);

	}
	
	public static int minMoves(int[] nums)
	{
		if(nums==null||nums.length<=1) 
			return 0;
		
        long min=(long)nums[0];
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(long)nums[i];
            min=Math.min(min,nums[i]);
        }
        return (int)(sum-min*nums.length);
	}

}
