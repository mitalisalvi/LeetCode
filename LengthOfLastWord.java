package com;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "            ";
		int result = lengthOfLastWord(s);
		System.out.println("result::"+result);

	}
	
	public static int lengthOfLastWord(String s) 
	{
		if(s==null || s.length()==0)
		{
			return 0;
		}
//		else if (s.equals(" "))
//		{
//			return 0;
//		}
		else if (s.trim().length() == 0)
		{
			return 0;
		}
		else
		{
			String[] temp = s.split("\\s+");
			return temp[temp.length-1].length();
		}
		
		
    }

}
