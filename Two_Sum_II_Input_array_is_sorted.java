package com;

public class Two_Sum_II_Input_array_is_sorted {

	public static void main(String[] args) {
		int numbers[]={2,7,11,13};
		int target =13;
		int[] result = twoSum(numbers, target);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		
		

	}
	
	public static int[] twoSum(int[] numbers, int target) 
	{
		int res[]=new int[2];
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				System.out.println("i:"+i+"  "+numbers[i]);
				System.out.println("j:"+j+"  "+numbers[j]);
				System.out.println();
				if(target-numbers[i]==numbers[j])
				{
					
					res[0]=i+1;
					res[1]=j+1;
					return res;
					
				}
			}
			
		}
		return res;
		
        
    }
	
	
//	public int[] twoSum(int[] num, int target) {
//	    int[] indice = new int[2];
//	    if (num == null || num.length < 2) return indice;
//	    int left = 0, right = num.length - 1;
//	    while (left < right) {
//	        int v = num[left] + num[right];
//	        if (v == target) {
//	            indice[0] = left + 1;
//	            indice[1] = right + 1;
//	            break;
//	        } else if (v > target) {
//	            right --;
//	        } else {
//	            left ++;
//	        }
//	    }
//	    return indice;
//	}

}
