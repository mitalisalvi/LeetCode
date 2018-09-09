package com;

public class Count_Primes {

	public static void main(String[] args) {
		int n=499979;
		int result = countPrimes(n);
		System.out.println("result::"+result);

	}
	
	public static int countPrimes(int n) 
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				count++;
			}
			
		}
		return count;
        
    }
	
	public static boolean isPrime(int num)
	{
		boolean flag=false;
		for(int i = 2; i*i<=num; ++i)
        {
            if(num % i == 0)
            {
            	//System.out.println(num);
                flag = true;
                break;
            }
        }
		
        return (!flag);
	}

}
