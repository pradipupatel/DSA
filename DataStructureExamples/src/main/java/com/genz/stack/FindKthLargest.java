package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*6
4 2 0 9 6 1
4  // k=4, therefore, the 4th largest element has to be found
Sample Output 1:
2
Sample Input 2:
6
1 2 3 4 5 6
2 // k=2 , therefore the 2nd largest element has to be found
Sample Output 2:
5*/
public class FindKthLargest {
	public static Stack<Integer> sortStack(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.pop();
			while (!tempStack.isEmpty() && tempStack.peek() > tmp) {
				input.push(tempStack.pop());
			}
			tempStack.push(tmp);
		}
		return tempStack;
	}

	public static void findKthLargestNum(Stack<Integer> sortedStack, int k) {
		while (k > 1) {
			--k;
			sortedStack.pop();
		}
		System.out.println(sortedStack.pop());
		// write your code here
	}

	public static void main(String args[]) {
		Stack<Integer> inputStack = new Stack<Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			inputStack.add(in.nextInt());
		}

		if (inputStack.isEmpty()) {
			System.out.println("stack is empty");
			System.exit(0);
		}

		int k = in.nextInt();
		if (k > inputStack.size()) {
			System.out.println("invalid input");
			System.exit(0);
		}

		// This is the temporary stack

		Stack<Integer> temp = sortStack(inputStack);
		findKthLargestNum(temp, k);

	}
}
