package com;


public class Convert_Sorted_Array_to_Binary_Search_Tree {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]={1,2,3,4,5};
		Convert_Sorted_Array_to_Binary_Search_Tree c=new Convert_Sorted_Array_to_Binary_Search_Tree();
		TreeNode result = c.sortedArrayToBST(nums);

	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=createBST(nums,0,nums.length-1);
        return root;
    }
    public TreeNode createBST(int[] nums,int start,int end)
    {
        if(end<start)
            return null;
        
        int mid=(start+end)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=createBST(nums,start,mid-1);
        n.right=createBST(nums,mid+1,end);
        return n;
    }

}
