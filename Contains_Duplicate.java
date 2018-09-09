package com;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class Contains_Duplicate {

	public static void main(String[] args) {
		int[] nums={1,2,3,1};
		boolean result  =containsDuplicate(nums);
		System.out.println("result:"+result);

	}
	
	public static boolean containsDuplicate(int[] nums) 
	{
		boolean flag=false;
		HashMap<Integer, Integer> hm = new HashMap<>();
		Set<Integer> val= hm.keySet();

		for(int i =0;i<nums.length;i++)
		{
			if(!val.contains(nums[i]))
			{
				hm.put(nums[i], 1);
			}
			else
			{
				int temp=hm.get(nums[i]);
				hm.put(nums[i], temp+1);
			}	
		}
		System.out.println(hm);
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
	        if (!Objects.equals(1, entry.getValue())) 
	        {
	            flag=true;
	        }
	    }
		
		return flag;
        
    }

}
