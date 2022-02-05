package com.puls.hackerrank;

import java.util.*;
import java.io.*;

class BSTNode {
	BSTNode left, right;
	int data;

	BSTNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTHieght {

	public static int getHeight(BSTNode root) {
		if (root == null) {
			return -1;
		} else {
			int left = getHeight(root.left);
			int right = getHeight(root.right);

			if (left > right) {
				return left + 1;
			} else {
				return right + 1;
			}
		}

		// Write your code here
	}

	public static BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		} else {
			BSTNode cur;
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
		BSTNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}