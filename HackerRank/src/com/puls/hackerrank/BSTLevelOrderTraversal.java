package com.puls.hackerrank;

import java.util.*;
import java.io.*;

class BSTLNode {
	BSTLNode left, right;
	int data;

	BSTLNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTLevelOrderTraversal {

	static void levelOrder(BSTLNode root) {
		// Write your code here
		Queue<BSTLNode> q = new LinkedList<BSTLNode>();
		q.add(root);

		while (!q.isEmpty()) {
			BSTLNode tmp = q.poll();
			System.out.print(tmp.data + " ");
			if (tmp.left != null) {
				q.add(tmp.left);
			}
			if (tmp.right != null) {
				q.add(tmp.right);
			}
		}

	}

	public static BSTLNode insert(BSTLNode root, int data) {
		if (root == null) {
			return new BSTLNode(data);
		} else {
			BSTLNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BSTLNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}