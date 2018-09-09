package com;

public class Range_Sum_Query_Immutable {
	
	private int[] data;

	public Range_Sum_Query_Immutable(int[] nums) 
	{
		data = nums;
    }
    
    public int sumRange(int i, int j) 
    {
        int sum=0;
        for(int h=i;h<=j;h++)
        {
        	sum=sum+data[h];
        }
        return sum;
    }
    
    
	public static void main(String[] args) {
		
		int nums[]={-2, 0, 3, -5, 2, -1};
		Range_Sum_Query_Immutable obj = new Range_Sum_Query_Immutable(nums);
		int param_1 = obj.sumRange(0,2);
		System.out.println("result::"+param_1);

	}

}
