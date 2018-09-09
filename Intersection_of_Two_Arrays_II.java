package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		int nums1[]={1,2,2,1};
		int nums2[]={2};
		int result[]= intersect(nums1, nums2);
		for(Integer temp:result)
			System.out.println(temp);

	}
	
	public static int[] intersect(int[] nums1, int[] nums2) 
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
    
       return r;
    }

}
