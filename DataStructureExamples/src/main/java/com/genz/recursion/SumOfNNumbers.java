package com.genz.recursion;

import java.util.Scanner;

/*Sample input
3
Sample Output
6

Sample input
1
Sample Output
1*/

public class SumOfNNumbers {
	public static int sum(int n) {
		if (n <= 1)
			return n;
		else
			return n + sum(--n);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n > 0) {
			int value = SumOfNNumbers.sum(n);
			System.out.print(value);
		} else {
			System.out.println("Enter a natural number");
		}
	}
}
