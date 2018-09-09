package com;

public class Min_Stack {
	
	private Node head;

	public static void main(String[] args) {
		
		int x=6;
		  Min_Stack obj = new Min_Stack();
		  obj.push(x);
		  obj.push(3);
		  obj.pop();
		  int param_3 = obj.top();
		  int param_4 = obj.getMin();
		 

	}
	

    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
        	System.out.println(head.val);
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
