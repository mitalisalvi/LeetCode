package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Relative_Ranks {

	public static void main(String[] args) 
	{
		int[] n={5,4,3,2,1};
		String[] res= findRelativeRanks(n);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}
	
	public static String[] findRelativeRanks(int[] nums) 
	{
		String[] res = new String[nums.length];
		Map<Integer, Integer> hm = new HashMap<>();
		int p = 1;

		for (int i = 0; i < nums.length; i++)
			hm.put(nums[i], i);
		
		//System.out.println(hm);
		Arrays.sort(nums);

		for (int i = nums.length - 1; i >= 0; i--) 
		{
			if (p == 1)
			{
				res[hm.get(nums[i])] = "Gold Medal";				
			}
			else if (p == 2)
			{
				res[hm.get(nums[i])] = "Silver Medal";				
			}
			else if (p == 3)
			{
				res[hm.get(nums[i])] = "Bronze Medal";
			}
			else
			{
				res[hm.get(nums[i])] = String.valueOf(p);				
			}
			
			p++;
		}
		return res;

	}

}
