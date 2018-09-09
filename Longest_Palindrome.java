package com;

import java.util.HashMap;
import java.util.Set;

public class Longest_Palindrome {

	public static void main(String[] args) {
		String s="abccccddeee";
		int result = longestPalindrome(s);
		System.out.println("result::"+result);

	}
	
	public static int longestPalindrome(String s)
	{
		int res=0;
		char[] temp=s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		Set<Character> val= hm.keySet();
		
		for(int i =0;i<temp.length;i++)
		{
			if(!val.contains(temp[i]))
			{
				hm.put(temp[i], 1);
			}
			else
			{
				int t=hm.get(temp[i]);
				hm.put(temp[i], t+1);
			}	
		}
		//System.out.println(hm);
		for (Character c :val)
		{
			if(hm.get(c)%2==0)
			{
				res=res+hm.get(c);
			}
		}
		//System.out.println("after adding even::"+res);
		for (Character c :val)
		{
			if(hm.get(c)%2!=0)
			{
				//System.out.println(c);
				res=res+(hm.get(c));
				hm.remove(c);
				break;
			}
		}
		//System.out.println("after adding first odd::"+res);
		for (Character c :val)
		{
			if(hm.get(c)%2!=0)
			{
				//System.out.println(c);
				res=res+(hm.get(c)-1);
				//hm.remove(c);
				//break;
			}
		}
		//System.out.println("after adding rest of odd::"+res);
		return res;
	}

}
