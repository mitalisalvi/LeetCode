package com;

public class Remove_Duplicates_From_Sorted_List {
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode current)
	{
//		ListNode current = head;
		ListNode next_next;
		while (current.next != null) {
			 
            /*Compare current node with the next node */
            if (current.val == current.next.val) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }
            else // advance if no deletion
               current = current.next;
        }
		return current;
	}

}
