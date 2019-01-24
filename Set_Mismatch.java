package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Set_Mismatch 
{
	public static void main(String[] args) 
	{
		Set_Mismatch m = new Set_Mismatch();
		int[] nums= {1,2,2,4};
		m.findErrorNums(nums);
		
	}
	
	public int[] findErrorNums(int[] nums) 
	{
		
		Set<Integer> temp = new HashSet<Integer>();
		for (Integer h : nums)
			temp.add(h);
		
		System.out.println(temp);
		
		int missing=0;
		for (int i=1;i<=nums.length;i++)
		{
			System.out.println("i:"+i);
			if (!temp.contains(i))
			{
				missing=i;
				break;
				
			}
		}
		System.out.println(missing);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0;i<nums.length;i++)
		{
			if (!hm.containsKey(nums[i]))
			{
				hm.put(nums[i], 1);
			}
			else
				hm.put(nums[i], hm.get(nums[i])+1);
		}
		
		System.out.println(hm);
		int repeat=0;
        for (Map.Entry<Integer,Integer> entry : hm.entrySet())  
        {
        	//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
        	if (entry.getValue()>1)
        	{
        		repeat = entry.getKey();
        	}
        }
        System.out.println("repeat"+repeat);
        int result[] = {repeat, missing};
		
		return result;
    }

}
