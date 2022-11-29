package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingSingleQueue { /* implementing queue using linked list */
	Queue<Integer> q = new LinkedList<Integer>();

	/* Push operation of stack using queue */
	void push(int x) {
		if (q.isEmpty()) {
			q.add(x);
		} else {
			int size = q.size();
			q.add(x);
			while (size > 0) {
				q.add(q.remove());
				--size;
			}
		}
	}

	/* Removes the top element of the stack */

	int pop() {
		if (!q.isEmpty())
			return q.remove();
		else
			return -1;
	}

	/* Returns the element at the top of the stack */
	int top() {
		if (!q.isEmpty())
			return q.peek();
		else
			return -1;
	}

	public static void main(String[] args) {
		StackUsingSingleQueue obj = new StackUsingSingleQueue();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			obj.push(in.nextInt());
		}
		if (obj.q.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(obj.top());
			obj.pop();
			if (obj.q.isEmpty())
				System.out.println("Stack is empty");
			else
				System.out.println(obj.top());
		}

	}
}