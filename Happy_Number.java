package com;

//import java.math.*;

public class Happy_Number {

	public static void main(String[] args) {
		
		int n =1111111;
		boolean flag=isHappy(n);
		System.out.println("result:"+flag);

	}
	
	public static boolean isHappy(int n) 
	{
		String s = Integer.toString(n);
		char temp[]=s.toCharArray();
		int sum=0;
		for (int i=0;i<temp.length;i++)
		{
			sum=sum+((Integer.parseInt((Character.toString(temp[i]))))* (Integer.parseInt((Character.toString(temp[i])))));
		}
		System.out.println("sum:"+sum);
		if(sum==1)
		{
			return true;
		}
		else if (sum<10)
		{
			return false;
		}
		else
		{
			return isHappy(sum);
		}
		
    }

}
