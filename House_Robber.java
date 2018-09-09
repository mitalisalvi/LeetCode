package com;

public class House_Robber {

	public static void main(String[] args) 
	{
		int nums[]={2,1,1,2};
		int result = rob(nums);
		System.out.println("result:"+result);
		

	}
	
//	public static int rob(int[] nums) 
//	{
//		int even=0;
//		int odd=0;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(i%2==0)
//			{
//				even+=nums[i];
//			}
//			else
//			{
//				odd=odd+nums[i];
//			}
//		}
//		//System.out.println("even::"+even);
//		//System.out.println("odd::"+odd);
//		if(even>odd)
//			return even;
//		else
//			return odd;
//		
//		
//		//return 0;
//    }
	
	public static int rob(int[] num) 
	{
	    int prevNo = 0;
	    int prevYes = 0;
	    for (int n : num) 
	    {
	        int temp = prevNo;
	        prevNo = Math.max(prevNo, prevYes);
	        prevYes = n + temp;
	    }
	    return Math.max(prevNo, prevYes);
	}

}
