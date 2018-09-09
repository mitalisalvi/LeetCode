package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Single_Number {

	public static void main(String[] args) {
		int nums[]={2,2,1};
		int result = singleNumber(nums);
		System.out.println("result:"+result);
		

	}
	
//	public int singleNumber(int[] nums) {
//	    int ans =0;
//	    
//	    int len = nums.length;
//	    for(int i=0;i!=len;i++)
//	        ans ^= nums[i];
//	    
//	    return ans;
//	    
//	}
	
	public static int singleNumber(int[] nums) 
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		Set<Integer> val= hm.keySet();
//		for (Integer g : val)
//			System.out.println(g);
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
		//System.out.println(hm);
		int result =0;
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
	        if (Objects.equals(1, entry.getValue())) {
	            result= entry.getKey();
	        }
	    }
		
		return result;
        
    }

}
