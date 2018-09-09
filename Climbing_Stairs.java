package com;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int result = climbStairs(n);
		System.out.println("result:"+result);
		

	}
	
	public static int climbStairs(int n) 
	{
		if(n<=2) 
			return n;
		
        int[] arr = new int[n+1];
        arr[0]=0;arr[1]=1;arr[2]=2;
        for(int i =3; i <=n;i++)
        {
        	//System.out.println("i:"+i);
        	//System.out.println("arr[i-1]:"+arr[i-1]);
        	//System.out.println("arr[i-2]:"+arr[i-2]);
            arr[i]=arr[i-1]+arr[i-2];
        }
        
//        for(int i =0;i<arr.length;i++)
//        {
//        	System.out.println(arr[i]);
//        }
     return arr[n];
        
    }

}
