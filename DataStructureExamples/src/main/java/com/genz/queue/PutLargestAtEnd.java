package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PutLargestAtEnd {
	static Queue<Integer> q = new LinkedList<Integer>();

	public static void func() {
		int length = q.size();
		int max = Integer.MIN_VALUE;
		while (length > 0) {
			--length;
			int no = q.remove();
			q.add(no);
			if (max < no)
				max = no;
		}
		length = q.size();
		while (length > 0) {
			--length;
			int no = q.remove();
			if (no == max) {
				continue;
			}
			q.add(no);
		}
		q.add(max);
	}

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int j = 0; j < n; j++) {
			q.add(in.nextInt());
		}
		func();
		System.out.println(q);
	}
}
