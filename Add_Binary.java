package com;

public class Add_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input0 = "1010";
		 String input1 = "10";
		 String result = addBinary(input0, input0);
		 System.out.println(result);
		 
		 
		    
		    

	}
	
	public static String addBinary(String a, String b) 
	{
//		int number0 = Integer.parseInt(a, 2);
//	    int number1 = Integer.parseInt(b, 2);
//
//	    int sum = number0 + number1;
//	    return Integer.toBinaryString(sum).toString();
		
		StringBuilder str=new StringBuilder();
        int x=0;
        int y=0;
        int pre=0;
        while(a.length()!=b.length()){
            if(a.length()>b.length())
                b="0"+b;
            else
                a="0"+a;
        }
         for(int i=a.length()-1;i>=0;i--){
             x=a.charAt(i)-'0';
             y=b.charAt(i)-'0';
             int sum=x+y+pre;
            if(sum>=2){
                pre=1;
                str.append(sum-2);
            }else{
                pre=0;
                str.append(sum);
            }
        }
        
        if(pre==1){
            str.append(1);
        }
        
        return str.reverse().toString();
        
    }

}
