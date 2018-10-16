package com;

public class Student_Attendance_Record_I 
{
	
	public static void main(String[] args) 
	{
//		String s= "PPALLL";
//		String s = "PPALLP"; 
		String s = "ALLAPPL";
		System.out.println(checkRecord(s));
		
	}
	
	
	public static boolean checkRecord(String s) 
	{
		boolean flag = true;
		char[] temp = s.toCharArray();
		
		for (int i=0;i<temp.length-2;i++)
		{
			if (temp[i]=='L' && temp[i+1]=='L' && temp[i+2]=='L')
			{
				flag = false;
				return flag;
			}
		}
		
		int count = 0;
		for (int i=0;i<temp.length;i++)
		{
			if (temp[i]=='A'  )
			{
				count++;
			}
		}
		
		if(count>1)
		{
			flag = false;
			return flag;
		}
		
		
		return flag;
    }

}
