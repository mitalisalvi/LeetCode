package com;

public class Next_Greater_Element_I {

	public static void main(String[] args) {
		int[] nums1={4,1,2};
		int[] nums2={1,3,4,2};
		int[] res= nextGreaterElement(nums1, nums2);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
	}
	
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
    	int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++)
        {
            boolean flag = false;
            int temp = Integer.MAX_VALUE;
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                    temp = nums2[j];
                if(temp < nums2[j])
                {
                    res[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            if(!flag)
                res[i] = -1;
        }
        return res;        
    }

}
