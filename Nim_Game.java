package com;

public class Nim_Game {

	public static void main(String[] args) {
		int n =4;
		boolean result =canWinNim(n);
		System.out.println("result::"+result);

	}
	
	public static boolean canWinNim(int n) 
	{
		return (n % 4 != 0);
        
    }

}
