package com;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_II {

	public static void main(String[] args) {
		int numRows= 3;
		List<Integer> allrows = new ArrayList<Integer>();
		Pascals_Triangle_II pt= new Pascals_Triangle_II();
		allrows=pt.getRow(numRows);
		System.out.println(allrows.toString());


	}
	
	public List<Integer> getRow(int rowIndex) {
		rowIndex=rowIndex+1;
		
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<rowIndex;i++)
		{
			row.add(0, 1);
			for(int j=1;j<row.size()-1;j++)
			{
				
				row.set(j, row.get(j)+row.get(j+1));
			}
			//System.out.println("i:"+i+"  "+row.toString());
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows.get(rowIndex-1);
        
    }

}
