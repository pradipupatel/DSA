package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

public class WeatherReport {
	static Stack<Integer> stack = new Stack<Integer>();

	static void difference(int height[], int S[]) {
		stack.push(0);
		S[0] = 1;
		for (int i = 0; i < height.length; i++) {
			while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				S[i] = i + 1;
			} else {
				S[i] = i - stack.peek();
			}
			stack.push(i);
		}
		for(int num:S) {
			System.out.print(num + " ");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] height = new int[12];
		for (int i = 0; i < 12; i++) {
			height[i] = in.nextInt();
		}

		// Output array that will store the number of months having rainfall less than
		// the current month
		int S[] = new int[12];
		difference(height, S);
	}
}
