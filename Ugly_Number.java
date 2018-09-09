package com;

public class Ugly_Number {

	public static void main(String[] args) {
		int num=8;
		boolean result =isUgly(num);
		System.out.println("result:"+result);

	}
	
	public static boolean isUgly(int num) 
	{
		if(num <= 0) return false;
        while((num % 2) == 0) num /= 2;
        while((num % 3) == 0) num /= 3;
        while((num % 5) == 0) num /= 5;
        return num == 1;    
    }

}
