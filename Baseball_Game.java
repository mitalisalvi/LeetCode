package com;

import java.util.LinkedList;

public class Baseball_Game {
	public static void main(String[] args) 
	{
		String ops[]= {"5","2","C","D","+"};
		Baseball_Game bg= new Baseball_Game();
		System.out.println(bg.calPoints(ops));
		
	}
	
	public int calPoints(String[] ops) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : ops) {
            if (op.equals("C")) {
                sum -= list.removeLast();
            }
            else if (op.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peekLast();
            }
            else if (op.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            }
            else {
                list.add(Integer.parseInt(op));
                sum += list.peekLast();
            }
        }
        return sum;
    }

}
