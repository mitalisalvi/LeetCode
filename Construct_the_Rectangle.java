package com;

public class Construct_the_Rectangle {

	public static void main(String[] args) {
		int a =2;
		int[] res= constructRectangle(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	
	public static int[] constructRectangle(int area) 
	{
		int[][] temp = new int[1000][2];
		int m=0;
		for(int i=1;i<=(area);i++)
		{
			if(area%i==0)
			{
				temp[m][0]=i;
				temp[m][1]=area/i;
				m++;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				if(temp[i][j]>0)
					System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int l=0;
		int w=0;
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<1000;i++)
		{
			if(temp[i][0]>=temp[i][1] && Math.abs(temp[i][0]-temp[i][1])<=diff && temp[i][0]>0 && temp[i][1]>0)
			{
				diff=Math.abs(temp[i][0]-temp[i][1]);
				l=temp[i][0];
				w=temp[i][1];
			}

		}
		//System.out.println("l::"+l+"  w:"+w);
		int[] res = {l,w};
		return res;
        
    }

}
