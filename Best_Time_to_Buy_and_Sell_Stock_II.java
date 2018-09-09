package com;

public class Best_Time_to_Buy_and_Sell_Stock_II {

	public static void main(String[] args) {
		int prices[]={2,4,1};
		Best_Time_to_Buy_and_Sell_Stock bt= new Best_Time_to_Buy_and_Sell_Stock();
		int result = bt.maxProfit(prices);
		System.out.println("result:"+result);

	}
	
	public int maxProfit(int[] prices) {
	    int total = 0;
	    for (int i=0; i< prices.length-1; i++) {
	        if (prices[i+1]>prices[i]) 
	        	total += prices[i+1]-prices[i];
	    }
	    
	    return total;
	}

}
