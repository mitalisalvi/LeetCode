package com;

public class Convert_a_Number_to_Hexadecimal {

	public static void main(String[] args) {
		int num =-1;
		String result = toHex(num);
		System.out.println("result::"+result);

	}
	
//	to convert -20 into hex
//	Let's start with 20 in binary: (Somebody please check my math here!)
//	20 = 0000 0000 0001 0100
//	Go through 2's complement to find -20 in binary
//	~20 = 1111 1111 1110 1011
//	~20 + 1 = -20 = 1111 1111 1110 1100
//	For Hexidecimal, just convert every group of 4 bits:
//	-20 = F F E C = 0xFFEC

	
	public static String toHex(int num) 
	{
		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;
		
        
    }

}
