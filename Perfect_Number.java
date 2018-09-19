package com;


public class Perfect_Number {
	
	public static void main(String[] args) 
	{
		//int n=100000000;
		//int n=28;
		int n=1;
		System.out.println(checkPerfectNumber(n));
	}
	
	public static boolean checkPerfectNumber(int num) 
	{
		if(num==1)
		{
			return false;
		}
			
		int count=1;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				//System.out.println(i);
				//System.out.println(num/i);
				count=count+i+(num/i);
			}
			//System.out.println();
		}
        
		if(count==num)
			return true;
		else
			return false;
    }

}
