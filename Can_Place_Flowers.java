package com;

public class Can_Place_Flowers 
{
	public static void main(String[] args) 
	{
		int n=1;
		int[] flowerbed = {1,0,0,0,1};
		Can_Place_Flowers c = new Can_Place_Flowers();
		System.out.println(c.canPlaceFlowers(flowerbed, n));
		
	}
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) 
	{
		int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) 
        {
            if(flowerbed[i] == 0) 
            {
               //get next and prev flower bed slot values. 
               //If i lies at the ends the next and prev are considered as 0. 
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) 
               {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        return count == n;
    }

}
