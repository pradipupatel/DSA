package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveSecondHalfQueue {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0)
			queue.add(s.nextInt());
		deleteSecondHalf(queue);
	}

// Method to delete the second half of the elements and print the remaining elements
	static void deleteSecondHalf(Queue<Integer> queue) {
		int length = (queue.size()%2 == 0) ? queue.size()/2 :(queue.size()/2)+1;
		int tempLength = queue.size() - length;
		while (length > 0) {
			queue.add(queue.remove());
			--length;
		}
		while (tempLength > 0) {
			queue.remove();
			--tempLength;
		}
		System.out.println(queue);
		// Write your code here
	}
}