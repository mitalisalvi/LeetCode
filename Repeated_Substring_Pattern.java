package com;

public class Repeated_Substring_Pattern {

	public static void main(String[] args) {
		String s="abcabcabcabc";
		boolean result=repeatedSubstringPattern(s);
		System.out.println("result::"+result);

	}
	
	public  static boolean repeatedSubstringPattern(String s)
	{
		String str = s + s;
		System.out.println("str::"+str);
		System.out.println("substring::"+str.substring(1, str.length() - 1));
        return str.substring(1, str.length() - 1).contains(s);
	}
}
