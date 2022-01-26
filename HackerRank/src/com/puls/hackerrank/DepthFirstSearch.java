package com.puls.hackerrank;
public class DepthFirstSearch {

	static class Edge {
		int src;
		int nbr;

		Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
		}
	}
	
	static class Pair {
		int v;
		String psf;
		
		Pair(int v , String psf){
			this.v = v;
			this.psf = psf;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	}

}
