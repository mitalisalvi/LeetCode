package com;

public class Nth_Digit {

	public static void main(String[] args) {
		int n=100000;
		int result = findNthDigit(n);
		System.out.println("result::"+result);

	}
	
	// Time Limit Exceeded for 100000
//	public static int findNthDigit(int n) {
//        String s="";
//        for(int i=1;i<=n;i++)
//        {
//        	//System.out.println(i);
//        	s=s+i;
//        }
//        //System.out.println(s);
//        //System.out.println(s.charAt(n-1));
//        return Integer.parseInt(Character.toString(s.charAt(n-1)));
//    }
//	
	
	public static int findNthDigit(int n) {
		int len = 1;
		long count = 9;
		int start = 1;

		while (n > len * count) {
			n -= len * count;
			len += 1;
			count *= 10;
			start *= 10;
		}

		start += (n - 1) / len;
		String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % len));
	}

}
