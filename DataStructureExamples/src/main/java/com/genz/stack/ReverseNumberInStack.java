package com.genz.stack;

import java.util.Scanner;

/*Sample Input:
8 A 1 B 2 C 3 D 4
Sample Output:
4 D 3 C 2 B 1 A  
A 1 B 2 C 3 D 4*/
public class ReverseNumberInStack {
	class Node {
		char data;
		Node next;

		public Node(char new_data) {
			data = new_data;
			next = null;
		}
	}

	Node top;

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

	public void display(Node node) {
		Node temp = node;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

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
		this.top = prev;
		return top;
	}

	public static void main(String[] args) {
		ReverseNumberInStack obj = new ReverseNumberInStack();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			obj.push(in.next().charAt(0));

		}

		obj.display(obj.top);
		System.out.println(" ");
		// reverse
		Node temp = obj.reverse();
		obj.display(temp);

	}
}
