package com;

import java.util.Arrays;

public class Assign_Cookies {

	public static void main(String[] args) {
		int[] g ={3,2,1};
		int s[]={1,2};
		int result = findContentChildren(g, s);
		System.out.println("result::"+result);

	}
	
	public static int findContentChildren(int[] g, int[] s) 
	{
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		for(int j=0;i<g.length && j<s.length;j++) 
		{
			if(g[i]<=s[j]) 
				i++;
		}
		return i;
		
	}

}
