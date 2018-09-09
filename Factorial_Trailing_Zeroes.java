package com;

public class Factorial_Trailing_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int result = trailingZeroes(n);
		System.out.println("result:"+result);
		

	}
	
	public static int trailingZeroes(int n) 
	{
		//return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
		int fact=1;
		for(int i=1;i<=n;i++)
		{    
			fact=fact*i;    
		} 
		System.out.println(fact);
		int result=0;
		while(fact!=0)
		{
			if(fact%10==0)
			{
				result++;
			}
//			else
//				break;
			
			fact=fact/10;
			
		}
		return result;
        
    }

}
