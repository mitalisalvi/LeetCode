package com;

public class PlusOne {

	public static void main(String[] args) 
	{
		int nums[]={7,2,8,5,0,9,1,2,9,5,3,6,6,7};
		int gg[] = plus (nums);
		for(int i=0;i<gg.length;i++)
		{
			System.out.print(gg[i]+" ");
		}
		

	}
	
	public static int[] plus (int[] nums)
	{
		String s ="";
		for(int i=0;i<nums.length;i++)
		{
			s=s+nums[i];
		}
		System.out.println(s);
		Long g = Long.parseLong(s);
		g=g+1;
		Long k[]=null;
		
		boolean tt=false;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=9)
			{
				tt=true;
				break;
			}
		}
		
		
		int i=0;
		if(tt==false)
		{
			k=new Long[nums.length+1];
			i=nums.length;
		}
		else
		{
			k=new Long[nums.length];
			i=nums.length-1;
		}
		
		
		while(g!=0)
		{
			k[i]=g%10;
			g=g/10;
			i--;
		}
		
		int o[]= new int[k.length];
		for(int v=0;v<k.length;v++)
		{
			o[v]=k[v].intValue();
		}
		return o;
	}
	
	public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
                digits[i]=(digits[i]+1)%10;
                if((digits[i])==0){
                    continue;
                }
                return digits;
            }
                digits=new int[digits.length+1];
                digits[0]=1;
            return digits;
    }

}
