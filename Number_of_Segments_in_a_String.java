package com;

public class Number_of_Segments_in_a_String {

	public static void main(String[] args) {
		String s="    foo    bar";
		int result = countSegments(s);
		System.out.println("result::"+result);

	}
	
	public static int countSegments(String s) 
	{
		if(s.equals(""))
		{
			return 0;
		}
      String temp[]= s.split("\\s+"); 
      int count=0;
      for(String h:temp)
      {
    	  System.out.println("*****"+h+"****");
    	  if(!h.equals(""))
    	  {
    		  count++;
    	  }
      }
    	  
      return count;
      
    }

}
