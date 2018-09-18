package com;

public class Base_7 {

	public static void main(String[] args) 
	{
		int n=-7;
		System.out.println(convertToBase7(n));

	}
	
	public static String convertToBase7(int num) 
	{
		StringBuilder res= new StringBuilder();
		int temp=num;
		if (num==0)
			return "0";
		
		if(num<0)
		{
			num=Math.abs(num);
		}
		
		while(num>0)
		{
			res=res.append(num%7);
			num=num/7;
		}
		if(temp<0)
		{
			res.append("-");
		}
		res=res.reverse();
		
		return res.toString();
    }

}
