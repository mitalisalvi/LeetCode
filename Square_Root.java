package com;

public class Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2147483647;
		int result= mySqrt(x);
		System.out.println("result:"+result);

	}
	
//	public int mySqrt(int x) {
//		double z = 0.5 *(Math.log(x));
//		z = (Math.pow(Math.E, z));
//		if((((int)z+1) - z)<0.00000001)
//		return (int)z+1;
//		return (int)z;
//		}
	
	public static int mySqrt(int x) 
	{
		//System.out.println("x:"+x);
//		System.out.println(46340*46340);
		int temp=0;
		boolean flag=false;
		for (int i=2;i<=x;i++)
		{
			if(i*i==x)
			{
				temp=i;
				flag=true;
				break;
			}
			else if(i*i>x)
			{
				temp=i;
				break;
			}
			
		}
//		System.out.println("temp:"+temp);
		
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else
		{
			if(flag)
				temp=temp;
			else
				temp=temp-1;
		}
		
//		System.out.println(temp);
		return temp;
        
    }

}
