package com;

public class Number_of_1_Bits {

	public static void main(String[] args) 
	{
		int n=67;
		int result = hammingWeight(n);
		System.out.println("result::"+result);

	}
	
	public static int hammingWeight(int n) 
	{
//		return Integer.bitCount(n);
		int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	    }
	    return bits;
        
    }

}
