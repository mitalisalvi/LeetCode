package com;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		int nums1[]={1,2,2,1};
		int nums2[]={2,2,1};
		int result[]= intersection(nums1, nums2);
		for(Integer temp:result)
			System.out.println(temp);

	}
	
	public static int[] intersection(int[] nums1, int[] nums2) 
	{
		//int result[]=new int[1];
		ArrayList<Integer> gg=new ArrayList<Integer>();
		for (int i=0; i<nums1.length ; i++ )
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums2[j]==nums1[i])
				{
					gg.add(nums2[j]);
				}
			}
		}
        //System.out.println(gg);
        HashSet<Integer>j = new HashSet<Integer>(gg);
        //System.out.println(j);
        
        int[] y = new int[j.size()];
        int c = 0;
        for(int x : j) y[c++] = x;

        
		return y;
    }

}
