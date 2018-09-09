package com;

public class Power_of_Two {

	public static void main(String[] args) {
		int n=33;
		boolean result = isPowerOfTwo(n);
		System.out.println("result::"+result);

	}
	
	public static boolean isPowerOfTwo(int n) 
	{
		if(n==0) 
			return false;
		while(n%2==0)
			n/=2;
		
		
		return (n==1);
        
    }

}
