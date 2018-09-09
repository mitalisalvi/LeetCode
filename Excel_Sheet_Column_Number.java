package com;

public class Excel_Sheet_Column_Number {

	public static void main(String[] args) 
	{
		String s="ZZ";
		int n =titleToNumber(s);
		System.out.println("result:"+n);

	}
	
	public static int titleToNumber(String s) 
	{
		int res = 0;
        for(int i=0; i < s.length(); i++)
        {
        	System.out.println("before:"+res);
            res = res*26+(s.charAt(i)-'A'+1);
            System.out.println("after:"+res);
            System.out.println();
            
        }
        return res;
        
    }

}
