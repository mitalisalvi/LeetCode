package com;

public class Power_of_Three {

	public static void main(String[] args) {
		int n=27;
		boolean result = isPowerOfThree(n);
		System.out.println("result:"+result);

	}
	
	public static boolean isPowerOfThree(int n) 
	{
		if(n==0) 
			return false;
		while(n%3==0)
			n/=3;
		
		
		return (n==1);
        
    }

}
