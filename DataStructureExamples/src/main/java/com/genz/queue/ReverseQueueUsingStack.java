package com.genz.queue;

import java.util.Scanner;

public class ReverseQueueUsingStack {
	class Node {
		char data;
		Node next;

		public Node(char new_data) {
			data = new_data;
			next = null;
		}
	}

	Node top;

	// Push and pop operations
	public void push(char new_data) {

		Node new_node = new Node(new_data);
		if (top == null) {

			top = new_node;
		} else {
			new_node.next = top;
			top = new_node;

		}
	}

	public Node pop() {
		Node node = top;
		top = top.next;
		return node;
	}

	// prints contents of stack
	public void display(Node node) {
		Node temp = node;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Reverses the stack using simple
	// linked list reversal logic.
	public Node reverse() {
		Node prev, cur, succ;
		cur = prev = this.top;
		cur = cur.next;
		prev.next = null;
		while (cur != null) {

			succ = cur.next;
			cur.next = prev;
			prev = cur;
			cur = succ;
		}
		return prev;
	}

	public static void main(String[] args) {
		ReverseQueueUsingStack obj = new ReverseQueueUsingStack();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			obj.push(in.next().charAt(0));

		}
		if (obj.top != null) {
			obj.display(obj.top);
			System.out.println(" ");
			// reverse
			Node temp = obj.reverse();
			obj.display(temp);
		} else {
			System.out.println("the stack is empty");
		}

	}
}