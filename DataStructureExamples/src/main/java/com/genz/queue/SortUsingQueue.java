package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Input Format:
12
6 12 3 4 5 1 7 8 10 9 11 2

Output format:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]*/
public class SortUsingQueue {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			queue.add(s.nextInt());
		sort(queue);
	}

	static void sort(Queue<Integer> queue) {
		Queue<Integer> tempQueue = new LinkedList<Integer>();
		while (!queue.isEmpty()) {
			int queueFrontItem = queue.remove();
			if (tempQueue.size() >= 1) {
				int count = tempQueue.size();
				while (tempQueue.peek() <= queueFrontItem && count>0) {
					tempQueue.add(tempQueue.remove());
					--count;
				}
				tempQueue.add(queueFrontItem);
				while (tempQueue.peek() > queueFrontItem && count>0) {
					tempQueue.add(tempQueue.remove());
					--count;
				}
			} else {
				tempQueue.add(queueFrontItem);
			}
		}
		System.out.println(tempQueue);
	}

	public static Queue<Integer> callMe(Queue<Integer> tq, int tempFrontItem) {
		if (tq.peek() < tempFrontItem) {

		}
		return tq;
	}

}
