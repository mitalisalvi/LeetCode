package com;

public class Number_Complement {

	public static void main(String[] args) {
		int num=5;
		int result=findComplement(num);
		System.out.println("result::"+result);
	}
	
	public static int findComplement(int num)
	{
		System.out.println("Binary = " + Integer.toBinaryString(num));
		System.out.println("Left::"+Integer.toBinaryString((Integer.highestOneBit(num) << 1)-1));
		System.out.println("negative::" + Integer.toBinaryString(~num));
		return ~num & ((Integer.highestOneBit(num) << 1) - 1); 
	}

}
