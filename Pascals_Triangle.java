package com;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numRows= 5;
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		Pascals_Triangle pt= new Pascals_Triangle();
		allrows=pt.generate(numRows);
		System.out.println(allrows.toString());

	}
	
	public List<List<Integer>> generate(int numRows) 
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			//System.out.println("i:"+i+"  "+row.toString());
			for(int j=1;j<row.size()-1;j++)
			{
				//System.out.println(row.get(j)+"   "+row.get(j+1));
				row.set(j, row.get(j)+row.get(j+1));
			}
			
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
        
    }

}
