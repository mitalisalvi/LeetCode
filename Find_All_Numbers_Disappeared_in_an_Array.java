package com;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {

	public static void main(String[] args) {
		int nums[]={4,3,2,7,8,2,3,1};
		List<Integer> res= findDisappearedNumbers(nums);
		for(Integer r:res)
			System.out.println(r);
		

	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) 
	{
		List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i ++) 
        	nums[(nums[i]-1) % n] += n;
        
        for (int i = 0; i < nums.length; i ++) 
        	if (nums[i] <= n) 
        		res.add(i+1);
        
        return res;
		
	}

}
