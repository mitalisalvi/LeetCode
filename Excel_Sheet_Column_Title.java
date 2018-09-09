package com;

public class Excel_Sheet_Column_Title {

	public static void main(String[] args) {
		int n=100;
		String result = convertToTitle(n);
		System.out.println("result:"+result);

	}
	
	public static String convertToTitle(int n) {
		
		int digit = 0;
	    StringBuilder sb = new StringBuilder();
	    while(n > 0)
	    {
	    	System.out.println("n:"+n);
	        digit = n % 26;
	        System.out.println("digit:"+digit);
	        if(digit != 0)
	        {
	            sb.append((char) (digit+64)); 
	            n = n/26;
	        }
	        else{
	            sb.append('Z');
	            n = n/26 - 1;
	        }
	    }
	    return sb.reverse().toString();
        
    }

}
