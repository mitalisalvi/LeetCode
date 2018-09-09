package com;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		String s="aadadaad";
		int result =firstUniqChar(s);
		System.out.println("result::"+result);

	}
	
	public static int firstUniqChar(String s) 
	{
		int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

}
