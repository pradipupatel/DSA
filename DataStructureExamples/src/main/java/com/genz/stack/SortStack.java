package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Sample Input:
12
6 12 3 4 5 1 7 8 10 9 11 2
Sample Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]*/

public class SortStack {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			stack.push(s.nextInt());
		sort(stack);
	}

	static void sort(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int topItem = stack.pop();
			while (!tempStack.isEmpty() && topItem < tempStack.peek()) {
				stack.push(tempStack.pop());
			}
			tempStack.push(topItem);
		}
		System.out.println(tempStack);
	}
}
