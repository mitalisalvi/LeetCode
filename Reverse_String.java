package com;

public class Reverse_String {

	public static void main(String[] args) {
		String s ="hello";
		String result = reverseString(s);
		System.out.println("result:"+result);

	}
	
	public static String reverseString(String s) 
	{
		StringBuilder sb = new StringBuilder();
		sb = sb.append(s);
		sb = sb.reverse();
		return sb.toString();
        
    }

}
