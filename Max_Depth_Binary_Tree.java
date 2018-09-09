package com;


public class Max_Depth_Binary_Tree {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	//int h=0;
	int l,r=0;

	public static void main(String[] args) {
		Max_Depth_Binary_Tree st = new Max_Depth_Binary_Tree();
		TreeNode a = st.new TreeNode(1);
		a.left=st.new TreeNode(2);
		a.right=st.new TreeNode(3);
		
		int result =st.maxDepth(a);
		System.out.println("result:"+result);
		
	}
	
	public int maxDepth(TreeNode root) 
	{
        int count = 0;
        int maxVal = 0;
        int result = searchTree(root, count, maxVal);
        return result;             
    }
    
    public int searchTree(TreeNode root, int count, int maxVal)
    {
        if (root == null) 
        	return Math.max(count, maxVal);
        else
        {
            count = count + 1;
            maxVal = searchTree(root.left, count, maxVal);
            maxVal = searchTree(root.right, count, maxVal);        
        }   
        return maxVal;
    } 
}
