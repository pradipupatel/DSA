package com.genz.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumOfSubarray {

	static void max(int arr[], int n, int g) {
		if (n == 0) {
			System.out.println("the array is empty");
			return;
		}
		if (n < g) {
			System.out.println("the size of subgroup exceeds the number of elements in the array");
			return;
		}
		Deque<Integer> queue = new LinkedList<Integer>();

		int i;
		for (i = 0; i < g; ++i) {
			while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()])
				queue.removeLast();
			queue.addLast(i);
		}
		for (; i < n; ++i) {
			System.out.print(arr[queue.peek()] + " ");
			while ((!queue.isEmpty()) && queue.peek() <= i - g)
				queue.removeFirst();
			while ((!queue.isEmpty()) && arr[i] >= arr[queue.peekLast()])
				queue.removeLast();
			queue.addLast(i);
		}
		System.out.print(arr[queue.peek()]);
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int g = in.nextInt();

		max(arr, n, g);
	}
}