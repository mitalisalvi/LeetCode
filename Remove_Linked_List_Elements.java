package com;


public class Remove_Linked_List_Elements {
	

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
	
	public ListNode removeElements(ListNode head, int val) 
	{
		ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
        
    }

}
