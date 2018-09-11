package com;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		int a[]=
			//   {1,1,0,1,1,1};
			 {1,0,1,1,0,1};
		int res=findMaxConsecutiveOnes(a);
		System.out.println(res);

	}
	
	public static int findMaxConsecutiveOnes(int[] nums) 
	{
		int count=0;
		int finalCount=0;
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println("i::"+i+ "  "+nums[i]);
			if((nums[i]==1))
			{
				System.out.println("Inside");
				count++;
				finalCount=finalCount>count?finalCount:count;
			}
			else
				count=0;
//			else if(count!=0 && (nums[i]!=nums[i+1]))
//			{
//				count=count;
//			}
//			else if(count==0 && (nums[i]!=nums[i+1]))
//			{
//				count=0;
//			}
		}
		//System.out.println(count);
		return finalCount;
    }

}
