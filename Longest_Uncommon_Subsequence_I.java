package com;

public class Longest_Uncommon_Subsequence_I {
	
	public static void main(String[] args) 
	{
		String a="abc";
		String b="abd";
		System.out.println(findLUSlength(a, b));
		
	}
	
	public static int findLUSlength(String a, String b) 
	{
		if(a.equals(b))
		{
			return -1;
		}
		if(a.length()==b.length() && !a.equals(b))
		{
			return a.length();
		}
		else
		{
			if(a.length()>b.length())
			{
				return a.length();
			}
			else
			{
				return b.length();
			}
		}
		//return -1;
        
    }

}
