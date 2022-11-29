package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingSingleStack {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ImplementQueue obj = new ImplementQueue();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			obj.enQueue(in.nextInt());

		}
		obj.deQueue();
		obj.deQueue();
		obj.deQueue();
	}
}

class ImplementQueue {

	Stack<Integer> stack = new Stack<Integer>();

	public void enQueue(int newData) {
		stack.push(newData);
	}

	public void deQueue() {
		if (stack.isEmpty()) {
			System.out.println("no elements left");
			return;
		}
		int temp = stack.pop();
		if (stack.size() == 0) {
			System.out.println(temp);
		} else {
			deQueue();
			stack.push(temp);
		}
	}

}
