package com;

public class Valid_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(String s) {
		
		char[] characters = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
		for(int i =0; i < characters.length/2; i++){
			if(characters[i] != characters[characters.length - i - 1]){
				return false;
			}
		}
		return true;
        
    }

}
