package com.puls.hackerrank;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();
		Node root = a.createNode(2);
	    root.left = a.createNode(7);
	    root.right = a.createNode(5);
	    root.left.left = a.createNode(12);
	    root.left.right = a.createNode(6);
	    root.left.right.left = a.createNode(5);
	    root.left.right.right = a.createNode(11);
	    root.right.right = a.createNode(9);
	    root.right.right.left = a.createNode(4);
	    root.right.right.right = a.createNode(40);
		
		System.out.print(getWidth(root));
	}

	public static int getWidth(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		int max_width = 1;
		while(true) {
		  int size = q.size();
		  if(size == 0)
			  break;
			
		  if(size>max_width) {
			  max_width = size;
		  }
		  
		  while(size >0) {
			Node t =   q.remove();
			  if(t.left!=null) {
				  q.add(t.left);
			  }
			  if(t.right!=null) {
				  q.add(t.right);
			  }
			  size --;
		  }
			
		}

		return max_width;

	}
}
