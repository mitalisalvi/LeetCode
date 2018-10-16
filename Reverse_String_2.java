package com;

public class Reverse_String_2 
{
	public static void main(String[] args) 
	{
		String s ="abcd";
		int k =2;
		System.out.println(reverseStr(s, k));
		
	}
	
	public static String reverseStr(String s, int k) 
	{
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) 
        {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i = i+ 2 * k;
        }
        return String.valueOf(arr);
    }
    private static void swap(char[] arr, int l, int r) 
    {
        while (l < r) 
        {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

}
