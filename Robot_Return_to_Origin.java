package com;

public class Robot_Return_to_Origin 
{
	public static void main(String[] args) 
	{
		
		Robot_Return_to_Origin r = new Robot_Return_to_Origin();
		String moves = "UD";
		System.out.println(r.judgeCircle(moves));
		
		
	}
	
	public boolean judgeCircle(String moves) 
	{
		int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) 
        {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;		
    }

}
