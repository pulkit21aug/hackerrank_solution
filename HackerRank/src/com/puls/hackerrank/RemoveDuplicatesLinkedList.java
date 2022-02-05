package com.puls.hackerrank;

import java.io.*;
import java.util.*;

class LLNode {
	int data;
	LLNode next;

	LLNode(int d) {
		data = d;
		next = null;
	}

}

public class RemoveDuplicatesLinkedList {

	public static LLNode removeDuplicates(LLNode head) {
		// Write your code here - sorted list 
		LLNode curr = head;
		while (curr != null) {
			LLNode tmp = curr;
			while (tmp != null && tmp.data == curr.data) {
				tmp = tmp.next;
			}
			curr.next = tmp;
			curr = curr.next;

		}

		return head;

	}

	public static LLNode insert(LLNode head, int data) {
		LLNode p = new LLNode(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			LLNode start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(LLNode head) {
		LLNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LLNode head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}