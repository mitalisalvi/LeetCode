package com;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {

	public static void main(String[] args) {
		int n =15;
		List<String> result= fizzBuzz(n);
		for(String s:result)
			System.out.println(s);

	}
	
	public static List<String> fizzBuzz(int n)
	{
		List<String> result = new ArrayList<String>();
		for(int i=1;i<=n;i++)
		{
			String temp="";
			if(i%15==0)
			{
				temp="FizzBuzz";
				
			}
			else if(i%3==0)
			{
				temp="Fizz";
			}
			else if (i%5==0)
			{
				temp="Buzz";
			}
			else
			{
				temp=Integer.toString(i);
			}
			result.add(temp);
		}
		return result;
		
		
	}

}
