package com;

public class Quad_Tree_Intersection 
{
	class Node {
	    public boolean val;
	    public boolean isLeaf = false;
	    public Node topLeft;
	    public Node topRight;
	    public Node bottomLeft;
	    public Node bottomRight;

	    public Node() {}

	    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
	        val = _val;
	        isLeaf = _isLeaf;
	        topLeft = _topLeft;
	        topRight = _topRight;
	        bottomLeft = _bottomLeft;
	        bottomRight = _bottomRight;
	    }
	};

	public static void main(String[] args) 
	{
		Quad_Tree_Intersection qti = new Quad_Tree_Intersection();
		
		
		Node TL = qti.new Node(true , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node TR = qti.new Node(true , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node BL = qti.new Node(true , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node BR = qti.new Node(true , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		
		Node tree1 = qti.new Node(true , false , TL, TR, BL, BR);
		
		
		
		Node TLaa = qti.new Node(false , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node TRaa = qti.new Node(false , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node BLaa = qti.new Node(false , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		Node BRaa = qti.new Node(false , true , qti.new Node() , qti.new Node(), qti.new Node(), qti.new Node());
		
		Node tree2 = qti.new Node(false , false , TLaa, TRaa, BLaa, BRaa);
		
		Node result  = intersect(tree1, tree2);
		System.out.println(result.isLeaf);

	}
	
	public  static Node intersect(Node quadTree1, Node quadTree2) 
	{
		Quad_Tree_Intersection qti = new Quad_Tree_Intersection();
		if(quadTree1.isLeaf && quadTree2.isLeaf)
		{
            quadTree1.val =  quadTree1.val || quadTree2.val ;
            return quadTree1;
        }
        else if(quadTree1.isLeaf)
        {
            if(quadTree1.val)
            {
                return quadTree1;
            }
            else
            {
                return quadTree2;
            }
        }
        else if(quadTree2.isLeaf)
        {
            if(quadTree2.val)
            {
                return quadTree2;
            }
            else
            {
                return quadTree1;
            }
        }
        else
        {
              Node topLeft =  intersect( quadTree1.topLeft,  quadTree2.topLeft);
              Node topRight = intersect( quadTree1.topRight,  quadTree2.topRight);
              Node bottomLeft = intersect( quadTree1.bottomLeft,  quadTree2.bottomLeft);
              Node bottomRight = intersect( quadTree1.bottomRight,  quadTree2.bottomRight);
            if( topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && (topLeft.val==topRight.val) && (bottomLeft.val==topRight.val) && (bottomLeft.val==bottomRight.val) )
                return qti.new Node(topLeft.val, true, null,null,null,null);
            else
             return qti.new Node(false,false,topLeft,topRight,bottomLeft,bottomRight);
            
        }
        
    }

}
