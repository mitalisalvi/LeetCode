package com;

public class Maximum_Average_Subarray_I 
{
	public static void main(String[] args) 
	{
		Maximum_Average_Subarray_I m = new Maximum_Average_Subarray_I();
		int nums[] = {1,12,-5,-6,50,3};
		int k =4;
		System.out.println(m.findMaxAverage(nums, k));
		
	}
	
	public double findMaxAverage(int[] nums, int k) 
	{
		double result =0.0;
		
		int mainSum=Integer.MIN_VALUE;
		
		
		for (int i=0;i<nums.length;i++)
		{
			System.out.println("i:"+i);
			int temp =k;
			int h = i;
			int sum=0;
			while  (temp!=0 && h<nums.length)
			{
				sum = sum + nums[h];
				System.out.println("Adding ::"+nums[h]);
				h++;
				temp--;
			}
			
			if (temp==0)
			{
				if (sum >=mainSum)
				{
					mainSum=sum;
				}
			}
			
			
			System.out.println("mainsum:::"+mainSum);
			System.out.println();
			
		}
		result =(double) mainSum/k;		
		return result;
    }

}
