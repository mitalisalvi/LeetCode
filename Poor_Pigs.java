package com;

public class Poor_Pigs {

	public static void main(String[] args) {
		int buckets=1000;
		int minutesToDie = 15;
		int minutesToTest=60;
		int result=poorPigs(buckets, minutesToDie, minutesToTest);
		System.out.println("result::"+result);
	}
	
	public  static int poorPigs(int buckets, int minutesToDie, int minutesToTest) 
	{
		 int status = minutesToTest/minutesToDie + 1;
	     int num_of_pig = 0;
	     while(Math.pow(status, num_of_pig) < buckets) 
	     {
	    	 num_of_pig++;
	     }
	     return num_of_pig;
	}

}
