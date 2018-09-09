package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class Contains_Duplicate_II {

	public static void main(String[] args) {
		int[] nums={99,99};
		int k=2;
		boolean result  =containsNearbyDuplicate(nums, k);
		System.out.println("result:"+result);


	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(nums[i])) {
	            if (i - map.get(nums[i]) <= k) return true;
	        }
	        map.put(nums[i], i);
	    }
	    return false;
	}
	
//	public static boolean containsNearbyDuplicate(int[] nums, int k) 
//	{
//		boolean flag=false;
//		if(nums.length!=0)
//		{
//			
//		
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		Set<Integer> val= hm.keySet();
//
//		for(int i =0;i<nums.length;i++)
//		{
//			if(!val.contains(nums[i]))
//			{
//				hm.put(nums[i], 1);
//			}
//			else
//			{
//				int temp=hm.get(nums[i]);
//				hm.put(nums[i], temp+1);
//			}	
//		}
//		System.out.println(hm);
//
//		int temp=0;
//		for (Entry<Integer, Integer> entry : hm.entrySet()) {
//	        if (!Objects.equals(1, entry.getValue())) 
//	        {
//	        	temp= entry.getKey();
//
//	        }
//	    }
//		
//		System.out.println("temp:"+temp);
//		if(temp!=0)
//		{
//		int r[]=new int[hm.get(temp)];
//		int u=0;
//		for(int b=0;b<nums.length;b++)
//		{
//			if(nums[b]==temp)
//			{
//				r[u]=b;
//				u++;
//				
//			}
//		}
//		
////		for (Integer a:r)
////		{
////			System.out.println(a);
////		}
//		
//		for(int t=0;t<r.length-1;t++)
//		{
//			if(r[t+1]-r[t]==k)
//			{
//				flag=true;
//				break;
//			}
//				
//		}
//		
//		
//		}
//		}
//		return flag;
//        
//    }

}
