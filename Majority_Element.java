package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class Majority_Element {

	public static void main(String[] args) {
		int nums[]={3,2,3};
		int result = majorityElement(nums);
		System.out.println("result:"+result);
		

	}
	
	public static int majorityElement(int[] nums) {
		
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
		ArrayList<Integer> hh=new ArrayList<>();
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
//	        if (Objects.equals(1, entry.getValue())) {
//	            result= entry.getKey();
//	        }
			hh.add(entry.getValue());
	    }
		int max =Integer.MIN_VALUE;
		for(Integer j:hh)
		{
			if (j>max)
			{
				max=j;
			}
		}
		//System.out.println("max:"+max);
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
	        if (Objects.equals(max, entry.getValue())) {
	            result= entry.getKey();
	        }
			
	    }
		
		return result;
        
    }

}
