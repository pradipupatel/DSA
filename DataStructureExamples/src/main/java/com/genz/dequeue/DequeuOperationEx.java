package com.genz.dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*Sample Input:
10
1 5 1 4 1 2 1 1 1 3 3 4 5 2 6 6
Expected Output:
4
1
[6, 4, 2, 1]*/
public class DequeuOperationEx {

	public static Deque<Integer> deque = new LinkedList<Integer>();

	public static void add_atend(int data) {
		deque.addLast(data);
	}

	public static void add_athead(int data) {
		deque.addFirst(data);
	}

	public static void delete_atend() {
		deque.removeLast();
	}

	public static void delete_athead() {
		deque.removeFirst();
	}

	public static int return_head() {
		return deque.peekFirst();
	}

	public static int return_tail() {
		return deque.peekLast();
	}

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int value;
		for (int j = 0; j < n; j++) {
			value = in.nextInt();
			switch (value) {
			case 1:
				add_atend(in.nextInt());
				break;
			case 2:
				add_athead(in.nextInt());
				break;
			case 3:
				if (deque.isEmpty()) {
					System.out.println("Not Possible");
				} else {
					delete_atend();
				}
				break;
			case 4:
				if (deque.isEmpty()) {
					System.out.println("Not Possible");
				} else {
					delete_athead();
				}
				break;
			case 5:
				if (deque.isEmpty()) {
					System.out.println("Not Possible");
				} else {
					System.out.println(return_head());
				}
				break;
			case 6:
				if (deque.isEmpty()) {
					System.out.println("Not Possible");
				} else {
					System.out.println(return_tail());
				}
				break;
			}
		}
		System.out.println(deque);
	}
}
