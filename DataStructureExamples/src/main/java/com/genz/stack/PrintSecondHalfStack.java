package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Sample Input:
12
1 2 3 4 5 6 7 8 9 10 11 12

Sample Output:
[7, 8, 9, 10, 11, 12]*/
public class PrintSecondHalfStack {
	static Stack<Integer> tempStack = new Stack<Integer>();

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			stack.push(s.nextInt());
		deleteFirstHalf(stack);
	}

	static void deleteFirstHalf(Stack<Integer> stack) {
		int mid = (stack.size() % 2 == 0) ? stack.size() / 2 : (stack.size()) / 2 + 1;
		addIntempStack(stack, mid);
		System.out.println(tempStack);
	}

	private static void addIntempStack(Stack<Integer> stack, int mid) {
		if (mid == 0) {
			return;
		}
		int tempElement = stack.pop();
		addIntempStack(stack, --mid);
		tempStack.push(tempElement);

	}

}