package com;

public class Sum_of_Square_Numbers 
{
	public static void main(String[] args) 
	{
		Sum_of_Square_Numbers s = new  Sum_of_Square_Numbers();
		System.out.println(s.judgeSquareSum(4));
		
		
	}
	
	public boolean judgeSquareSum(int n) 
	{
		for (long i = 0; i * i <= n; i++)
		{
			for (long j = 0; j * j <= n; j++) 
			{
	               if (i * i + j * j == n) 
	                { 
	                    System.out.println(i + "^2 + " + j + "^2"); 
	                    return true; 
	                } 
			}
		}
            
  
        return false; 
        
    }

}
