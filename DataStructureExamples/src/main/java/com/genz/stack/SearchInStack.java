package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

public class SearchInStack {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			stack.push(s.nextInt());
		printFifthElementFromStart(stack);
	}
	
	static void printFifthElementFromStart(Stack<Integer> stack) {
		while (stack.size() != 5) {
			if(stack.isEmpty())
				break;
			stack.pop();
		}
		if (stack.isEmpty()) {
			System.out.println("There are not enough elements in the stack");
		} else {
			System.out.println(stack.peek());
		}
	}

	static void printFifthElementFromEnd(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			if (!stack.empty()) {
				int poppedElement = stack.pop();
				if (i == 4)
					System.out.println(poppedElement);

			} else {
				System.out.println("There are not enough elements in the stack");
				break;
			}
		}
	}

}
