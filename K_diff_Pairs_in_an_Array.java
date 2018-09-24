package com;

import java.util.Arrays;

public class K_diff_Pairs_in_an_Array {

	public static void main(String[] args) 
	{
//		int nums[]={1,3,1,5,4};
//		int k=0;
		
		int[] nums ={3, 1, 4, 1, 5};
		int k=2;
		//[3, 1, 4, 1, 5], k = 2	output:2
		System.out.println(findPairs(nums, k));

	}
	
	public static int findPairs(int[] nums, int k) {
        int n = nums.length;
        if(n <= 1)
        {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            if(helper(nums, i + 1, nums[i] + k))
            {
                count++;
            }
        }
        return count;
    }
	
    public static boolean helper(int[]nums, int start, int target)
    {
        int end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(nums[start] == target){
            return true;
        }
        if(nums[end] == target){
            return true;
        }
        return false;
    }

}
