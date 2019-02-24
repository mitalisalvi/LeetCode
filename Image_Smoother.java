package com;

public class Image_Smoother 
{
	public static void main(String[] args) 
	{
		Image_Smoother is = new Image_Smoother();
		int M[][] = {{1,1,1}, {1,0,1}, {1,1,1}};
		int result[][] = is.imageSmoother(M);
		for (int row = 0; row < result.length; row++) 
	    {
	      for (int col = 0; col < result[0].length; col++) 
	      {
	    	  System.out.println(result[row][col]);
	      }
	      System.out.println();
	    }
		
		
	}
	
	public int[][] imageSmoother(int[][] M) 
	{
        if (M == null) 
        	return null;
        
        int rows = M.length;
        
        if (rows == 0) 
        	return new int[0][];
        
        int cols = M[0].length;

        int result[][] = new int[rows][cols];

        for (int row = 0; row < rows; row++) 
        {
            for (int col = 0; col < cols; col++) 
            {
                int count = 0;
                int sum = 0;
                for (int incR : new int[]{-1, 0, 1}) 
                {
                    for (int incC : new int[]{-1, 0, 1}) 
                    {
                        if (isValid(row + incR, col + incC, rows, cols)) 
                        {
                            count++;
                            sum += M[row + incR][col + incC];
                        }
                    }
                }
                result[row][col] = sum / count;
            }
        }

        return result;

    }

    private boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
