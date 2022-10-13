package com.genz.recursion;

import java.util.Scanner;

/*Sample Input:
2
3
Sample Output:
8

Sample Input:
3
2
Sample Output:
9 */
public class PowerOfNumber {
	public static int powerfunc(int base, int power) {
		// write your code here
		if (power <= 1)
			return base;
		else
			return base * powerfunc(base, --power);
	}

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		int a = inpt.nextInt();
		int b = inpt.nextInt();
		// printing the value of a^b i.e.,
		System.out.printf("%d", powerfunc(a, b));
	}
}
