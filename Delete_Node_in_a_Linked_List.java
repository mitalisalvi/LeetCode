package com;


public class Delete_Node_in_a_Linked_List {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	
	public void deleteNode(ListNode node) {
	    node.val=node.next.val;
	    node.next=node.next.next;
	}

}
