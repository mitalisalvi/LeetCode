package com;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public void rotate(int[] nums, int k) 
	{
		int temp, previous;
        for (int i = 0; i < k; i++) 
        {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        
    }

}
