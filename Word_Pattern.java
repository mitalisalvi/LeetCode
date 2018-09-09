package com;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {

	public static void main(String[] args) {
		String str="dog cat cat dog";
		String pattern="abba";
		boolean result= wordPattern(pattern, str);
		System.out.println("result:"+result);
		

	}
	
	public static boolean wordPattern(String pattern, String str) 
	{
		String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
        
    }

}
