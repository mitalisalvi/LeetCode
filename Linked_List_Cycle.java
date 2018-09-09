package com;

public class Linked_List_Cycle {
	
	  class ListNode 
	  {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasCycle(ListNode head) {
		
		if (head == null) 
		{
			return false;
		}
	       
		ListNode myNode = new ListNode(0);
	    while(head.next!=null) 
	    {
	           ListNode temp = head;
	           head = head.next;
	           temp.next = myNode;
	    }
	    if (head==myNode) 
	    {
	       return true;
	    } 
	    else 
	    {
	           return false;
	    }
        
    }

}
