package com;

import java.util.Stack;

public class Implement_Queue_using_Stacks {

	private int front;
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();


	public void push(int x) {
	    if (s1.empty())
	        front = x;
	    while (!s1.isEmpty())
	        s2.push(s1.pop());
	    s2.push(x);
	    while (!s2.isEmpty())
	        s1.push(s2.pop());
	}
	
	public void pop() {
	    s1.pop();
	    if (!s1.empty())
	        front = s1.peek();
	}
	
	public boolean empty() {
	    return s1.isEmpty();
	}
	
	public int peek() {
		  return front;
		}
	
	

}
