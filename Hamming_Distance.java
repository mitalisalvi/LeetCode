package com;

public class Hamming_Distance {

	public static void main(String[] args) {
		int x=1;
		int y=4;
		int result= hammingDistance(x, y);
		System.out.println("result::"+result);

	}
	
	public static int hammingDistance(int x, int y) 
	{
	    return Integer.bitCount(x ^ y);
	}

}
