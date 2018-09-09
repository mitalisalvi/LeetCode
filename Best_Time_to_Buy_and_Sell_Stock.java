package com;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		
		int prices[]={2,4,1};
		Best_Time_to_Buy_and_Sell_Stock bt= new Best_Time_to_Buy_and_Sell_Stock();
		int result = bt.maxProfit(prices);
		System.out.println("result:"+result);

	}
	
//	public int maxProfit(int[] prices) 
//	{
//		int result =0;
//		if(prices.length!=0)
//		{
//			IntSummaryStatistics stat = Arrays.stream(prices).summaryStatistics();
//			int max = stat.getMax();
//			int min = stat.getMin();
//			boolean buy = false ; 
//			//boolean sell = false;
//			
//			int temp_min=0;
//			//int h=0;
//			
//			for (int i=0;i<prices.length;i++)
//			{
//				if(buy ==false)
//				{
//					if(prices[i]==min)
//					{
//						buy=true;
//						temp_min=i;
//						//h=prices[i];
//						break;
//					}
//				}
//			}
//			//System.out.println("temp_min:"+prices[temp_min]);
//			//System.out.println("buy:"+buy);
//			int temp_max=0;
//			int g=0;
//			
//			int[] bb= new int[prices.length-temp_min];
//			//System.out.println("###"+bb.length);
//			int k=0;
//			for(int i=temp_min;i<prices.length;i++)
//			{
//				//System.out.println((temp_min+k));
//				bb[k]=prices[i];
//				k++;
//			}
//			for(int i=0;i<bb.length;i++)
//			{
//				//System.out.println(bb[i]);
//			}
//			
//			
//			IntSummaryStatistics poi = Arrays.stream(bb).summaryStatistics();
//			int maxOfSmaller = poi.getMax();
//			//System.out.println(maxOfSmaller);
//			for(int i=0;i<bb.length;i++)
//			{
//				//System.out.println("***"+bb[i]);
//				if(buy==true)
//				{
//					if(bb[i]==maxOfSmaller)
//					{
//						temp_max=i;
//						//sell=true;
//						//g=prices[i+temp_min-1];
//						break;
//					}
//				}
//			}
//			int y=0;
//			for(int i=0;i<prices.length;i++)
//			{
//				if(prices[i]==maxOfSmaller)
//				{
//					y=i;
//				}
//			}
//			result = prices[y] - prices[temp_min];
//		}
//		
//		return result;
//        
//    }

	
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price: prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        return max;
    }
}
