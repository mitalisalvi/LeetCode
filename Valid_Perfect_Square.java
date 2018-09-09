package com;

public class Valid_Perfect_Square {

	public static void main(String[] args) {
		int n =1;
		boolean result=isPerfectSquare(n);
	    System.out.println("result::"+result);

	}
	
	// Time Limit Exceeded
//	public static boolean isPerfectSquare(int n) 
//	{
//		boolean flag=false;
//		for (int i=1;i<=n;i++)
//		{
//			if(i*i==n)
//			{
//				flag=true;
//				break;
//			}
//			else if(i*i>n)
//			{
//				flag=false;
//				break;
//			}
//			
//		}
//		return flag;
//        
//    }
	
	public static boolean isPerfectSquare(int num){
        
        if(num <= 0) return false;
        
        int left = 1, right = num;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            // use "/" to avoid overflow
            if(mid > num / mid){
                right = mid - 1;
            }else if(mid < num / mid){
                left = mid + 1;
            }else{
                return num % mid == 0;
            }
        }
        return false;
    }

}
