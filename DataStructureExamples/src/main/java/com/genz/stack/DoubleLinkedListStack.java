package com.genz.stack;

import java.util.Scanner;

public class DoubleLinkedListStack {

	class Node {
		Node prev;
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	class StackNode {
		Node head;
		Node mid;
		int count;
	}

	StackNode implementStackUsingLinkedlist() {
		StackNode stack = new StackNode();
		stack.count = 0;
		return stack;
	}

	void push(StackNode node, int new_data) {
		Node tempNode = new Node(new_data);
		tempNode.prev = null;
		tempNode.next = node.head;
		++node.count;
		if (node.count == 1) {
			node.mid = tempNode;
		} else {
			node.head.prev = tempNode;
			if (node.count % 2 == 1) {
				node.mid = node.mid.prev;
			}
		}
		node.head = tempNode;

	}

	int pop(StackNode stack) {
		if (stack.count == 0) {
			System.out.println("The stack is empty");
			System.exit(0);
		}
		int poppedItem = stack.head.data;
		stack.head = stack.head.next;
		if (stack.head != null) {
			--stack.count;
			stack.head.prev = null;
		}

		if (stack.count % 2 == 0) {
			stack.mid = stack.mid.next;
		}
		return poppedItem;
	}

	int middleElement(StackNode stack) {
		if (stack.count == 0) {
			System.out.println("The stack is empty");
			System.exit(0);
		}
		return stack.mid.data;
	}

	public static void main(String args[]) {
		DoubleLinkedListStack obj = new DoubleLinkedListStack();
		StackNode stack = obj.implementStackUsingLinkedlist();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			obj.push(stack, in.nextInt());
		}
		System.out.println(obj.pop(stack) + "");
		System.out.println(obj.middleElement(stack) + "");
	}
}
