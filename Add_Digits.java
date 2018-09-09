package com;

public class Add_Digits {

	public static void main(String[] args) {
		int num=8;
		int result = addDigits(num);
		System.out.println("result::"+result);

	}
	
	public static int addDigits(int num) 
	{
		if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
        
    }

}
