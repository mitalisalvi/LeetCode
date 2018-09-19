package com;

public class Detect_Capital {
	
	public static void main(String[] args) 
	{
		//String w="USA";
		//String w="leetcode";
		//String w="Leetcode";
		String w="FlaG";
		System.out.println(detectCapitalUse(w));
		
	}
	
	public static boolean detectCapitalUse(String word) 
	{
		if(word.length()==0)
		{
			return false;
		}
		if(word.matches("^[A-Z]+$"))
		{
			System.out.println("all caps");
			return true;
		}
		
		if(word.matches("^[a-z]+$"))
		{
			System.out.println("all small");
			return true;
		}
		if(word.substring(0, 1).matches("^[A-Z]+$") && word.substring(1, word.length()).matches("^[a-z]+$"))
		{
			System.out.println("sentence case");
			return true;
		}
		
		return false;
    }

}
