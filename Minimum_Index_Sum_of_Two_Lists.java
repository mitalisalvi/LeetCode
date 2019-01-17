package com;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Index_Sum_of_Two_Lists {
	public static void main(String[] args) 
	{
		String[] i1 = {"Shogun", "KFC"};
		String[] i2 = {"Shogun" , "KFC"};

		Minimum_Index_Sum_of_Two_Lists m = new Minimum_Index_Sum_of_Two_Lists();
		m.findRestaurant(i1, i2);
		
	}
	
	public String[] findRestaurant(String[] list1, String[] list2) 
	{	
		int i=0;
		List<String> temp = new ArrayList<String>();
		int sum=Integer.MIN_VALUE;
		while (i<list1.length)
		{
			
			for (int j=0;j<list2.length;j++)
			{
				if (list1[i].equals(list2[j]))
				{
					if ((i+j)<sum && sum!=Integer.MIN_VALUE)
					{
						sum = i+j;
						temp.add(list1[i]);
					}
					else if (sum==Integer.MIN_VALUE)
					{
						sum = i+j;
						temp.add(list1[i]);
					}
					else if ((i+j)==sum)
					{
						temp.add(list1[i]);						
					}
					
				}
				
			}
			i++;
		}
		
		System.out.println(temp);
		
		String res[] = new String[temp.size()];
		for (int z=0;z<res.length;z++)
			res[z] = temp.get(z);
		
		
		
		return res;
        
    }

}