package com;

public class Island_Perimeter {

	public static void main(String[] args) {
		int [][]grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int result= islandPerimeter(grid);
		System.out.println("result::"+result);

	}
	
	public static int islandPerimeter(int[][] grid)
	{
		int[][] d = new int[][] {{0,-1}, {-1,0}, {0,1}, {1,0}};
	    int perimeter = 0;
	    for(int i=0; i<grid.length; i++) 
	    {
	        for(int j=0; j<grid[0].length; j++) 
	        {
	            if(grid[i][j] == 0)
	                continue;
	            
	            for(int k=0; k<d.length; k++) 
	            {
	                int x=i+d[k][0], y=j+d[k][1];
	                if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y] == 0)
	                    perimeter++;
	            }
	        }
	    }
	    return perimeter;
		
	}

}
