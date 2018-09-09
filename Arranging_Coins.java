package com;

public class Arranging_Coins {

	public static void main(String[] args) {
		int n =5;
		int result = arrangeCoins(n);
		System.out.println("result::"+result);

	}

	public static int arrangeCoins(int n) 
	{
		int res=0;
		for(int i=1;i<=n;i++)
		{
			n=n-i;
			if(n<i+1)
			{
				res=i;
				break;
			}
			
		}
		return res;
        
    }
}
