package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Input Format:
12
1 2 3 4 5 6 7 8 9 10 11 12
Output format:
[1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]*/

public class ReverseSecondHalfStack {
	static int midSize;
	static int stackSize;

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			stack.push(s.nextInt());
		stackSize = stack.size();
		midSize = (stackSize%2 == 0) ? (stackSize/2):(stackSize/2)+1;
		
		reverseSecondHalf(stack);
		System.out.println(stack);
	}

	static void reverseSecondHalf(Stack<Integer> stack) {
		if (stack.size() > midSize) {
			int topNumber = stack.pop();
			reverseSecondHalf(stack);
			insertInStack(topNumber, stack);
		}
	}

	private static void insertInStack(int topNumber, Stack<Integer> stack) {
		if (stack.size() == midSize)
			stack.push(topNumber);
		else {
			int currentTop = stack.pop();
			insertInStack(topNumber, stack);
			stack.push(currentTop);
		}
	}

}
