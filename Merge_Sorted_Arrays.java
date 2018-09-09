package com;

public class Merge_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge_Sorted_Arrays p=new Merge_Sorted_Arrays();
		p.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

	}
	
	public  void merge(int[] nums1, int m, int[] nums2, int n) 
	{
		int temp[]=nums1;
		nums1=new int[m+n];
		for(int i=0;i<m;i++)
		{
			nums1[i]=temp[i];
		}
		
		int g=0;
		for(int i=m;i<(m+n);i++)
		{
			nums1[i]=nums2[g];
			g++;
		}
		
		
		bubbleSort(nums1);
		
		//printing
				for(int i=0;i<nums1.length;i++)
				{
					System.out.println(nums1[i]);
					
				}
        
    }
	
	public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

}
