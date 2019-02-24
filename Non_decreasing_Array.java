package com;

public class Non_decreasing_Array 
{
	public static void main(String[] args) 
	{
		int nums[]= {3,4,2,3};
		Non_decreasing_Array n = new Non_decreasing_Array();
		System.out.println(n.checkPossibility(nums));
	}
	
	public boolean checkPossibility(int[] nums) 
	{
		int cnt = 0;                                                                    
        for(int i = 1; i < nums.length && cnt<=1 ; i++)
        {
            if(nums[i-1] > nums[i])
            {
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])
                	nums[i-1] = nums[i];                    
                else 
                	nums[i] = nums[i-1];                                                
            }
        }
        return cnt<=1; 
        
    }

}
