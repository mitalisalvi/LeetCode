package com;



  class TreeNode 
 {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 

public class Construct_String_from_Binary_Tree 
{
	public static void main(String[] args) 
	{
		Construct_String_from_Binary_Tree c = new Construct_String_from_Binary_Tree();
		TreeNode t = new TreeNode(1);

		
	}
	
	public String tree2str(TreeNode t) {
        if (t == null) return "";
        
        String result = t.val + "";
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if (right == "") return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }

}
