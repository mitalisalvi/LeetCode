package com;

public class Range_Addition_II {
	
	public static void main(String[] args) 
	{
		int m =4000;
		int n=4000;
//		int[][] operations = {{2,2},{3,3}};
		int[][] operations = {};
		Range_Addition_II g = new Range_Addition_II();
		System.out.println(g.maxCount(m, n, operations));
		
		
	}
	
//	public int maxCount(int m, int n, int[][] ops) {
//        if (ops == null || ops.length == 0) {
//            return m * n;
//        }
//        
//        int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
//        for(int[] op : ops) {
//            row = Math.min(row, op[0]);
//            col = Math.min(col, op[1]);
//        }
//        
//        return row * col;
//    }
	
	public int maxCount(int m, int n, int[][] ops) 
	{
		if (ops == null || ops.length == 0) {
            return m * n;
        }
		
		int M[][] = new int[m][n];
//		for (int i=0;i<m;i++)
//		{
//			for (int j=0;j<n;j++)
//			{
//				M[i][j]=0;
//			}
//		}
		
		for (int k=0;k< ops.length;k++)
		{
			int row = ops[k][0];
			int col = ops[k][1];
			System.out.println("row:"+row);
			System.out.println("col:"+col);
			
			for (int i=0;i<row;i++)
			{
				for (int j=0;j<col;j++)
				{
					M[i][j]+=1;
				}
			}	
		}
		
		System.out.println("Printing");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print(M[i][j] +"  ");
			}
			System.out.println();
		}
		
		//find max value from mat
		int max =0;
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (M[i][j]>=max)
				{
					max= M[i][j];
				}
			}
		}
		System.out.println("max:"+max);
		
		int count=0;
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (M[i][j]==max)
					count++;
			}
		}
		
		
		return count;
        
    }

}
