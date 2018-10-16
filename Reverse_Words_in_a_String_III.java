package com;

public class Reverse_Words_in_a_String_III 
{
	public static void main(String[] args) 
	{
		String s ="Let's take LeetCode contest";
		System.out.println(reverseWords(s));
		
	}
	
	public static String reverseWords(String s) 
	{
		String result ="";
		String temp[] = s.split("\\s+");
//		for (String g:temp)
//			System.out.println(g);
		
		for(int i=0;i<temp.length;i++)
		{
			StringBuilder sb = new StringBuilder(temp[i]);
			sb = sb.reverse();
			result  = result  +" "+ sb.toString();
		}
		result = result.trim();
		
        return result;
    }

}
