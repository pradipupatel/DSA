package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchInQueue {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			queue.add(s.nextInt());
		printFifthElementFromEnd(queue);
	}

	static void printFifthElementFromEnd(Queue<Integer> queue) {

		if (queue.size() < 5) {
			System.out.println("There are not enough elements in the queue");
		} else {
			while (queue.size() > 5) {
				queue.remove();
			}
			System.out.println(queue.remove());
		}
	}

	// Method to print the fifth element from the head of the queue
	static void printFifthElementFromStart(Queue<Integer> queue) {
		int i = 0;
		while (i < 4) {
			++i;
			if (!queue.isEmpty()) {
				queue.remove();
			}
		}
		if (queue.isEmpty()) {
			System.out.println("There are not enough elements in the queue");
		} else {
			System.out.println(queue.remove());
		}
	}
}
