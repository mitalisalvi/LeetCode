package com;

import java.util.HashMap;

public class Number_of_Boomerangs {

	public static void main(String[] args) {
		int[][] points={{0,0},{1,0},{2,0}};
		int result=numberOfBoomerangs(points);
		System.out.println("result::"+result);

	}
	
	public  static int numberOfBoomerangs(int[][] points)
	{
		int res = 0;
        for (int i = 0; i < points.length; ++i) 
        {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = 0; j < points.length; ++j) 
            {
                int dis = (int) (Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
                map.put(dis, map.containsKey(dis) ? (map.get(dis) + 1) : 1); 
            }
            for (int dis : map.keySet())
                res += map.get(dis) * (map.get(dis) - 1); 
        }
        return res;
		
	}

}
