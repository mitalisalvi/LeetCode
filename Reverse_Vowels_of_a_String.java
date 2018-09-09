package com;

import java.util.HashSet;
import java.util.Set;

public class Reverse_Vowels_of_a_String {

	public static void main(String[] args) {
		String s ="hello";
		String result = reverseVowels(s);
		System.out.println("result::"+result);

	}
	
	public static String reverseVowels(String s) 
	{
		 char[] list=s.toCharArray();
	        Set<Character> set=new HashSet<>();
	        set.add('a');
	        set.add('e');
	        set.add('i');
	        set.add('o');
	        set.add('u');
	        set.add('A');
	        set.add('E');
	        set.add('I');
	        set.add('O');
	        set.add('U');
	        for (int i=0, j=list.length-1; i<j; ) {
	            if (!set.contains(list[i])) {
	                i++;
	                continue;
	            }
	            if (!set.contains(list[j])) {
	                j--;
	                continue;
	            }
	            char temp=list[i];
	            list[i]=list[j];
	            list[j]=temp;
	            i++;
	            j--;
	        }
	        return String.valueOf(list);
    }

}
