package com.genz.basic.problems;

import java.util.Scanner;

public class TwoPeopleMeetEachOther {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int p1 = s.nextInt();
		int p2 = s.nextInt();
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		System.out.println(twoPeopleMeet(p1, p2, s1, s2));
	}

	// Method to find whether two people meet after jumping for the same number of
	// times
	static String twoPeopleMeet(int p1, int p2, int s1, int s2) {
		if (p1 == p2)
			return "YES";
		if ((p1 > p2 && s1 > s2) || (p2 > p1 && s2 > s1))
			return "NO";
		else
			return twoPeopleMeet(p1 + s1, p2 + s2, s1, s2);
		// Write your code here
	}
}
