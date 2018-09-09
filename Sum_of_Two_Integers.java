package com;

public class Sum_of_Two_Integers {

	public static void main(String[] args) {
		int a=4; //100
		int b=6; //110
		int result=getSum(a, b);
		System.out.println("result:"+result);

	}
	
	public static int getSum(int a, int b) 
	{

        while (b != 0) 
        {
            int carry = a & b; //AND
            System.out.println("carry:"+carry);
 
            a = a ^ b; //XOR
            System.out.println("a:"+a);

            b = carry << 1; //LEFT SHIFT
            System.out.println("b:"+b);
            
            System.out.println();
        }
        return a;

    }

}
