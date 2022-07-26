package com.genz.recursion;

import java.util.Scanner;

/*Sample Input:
5
Sample Output:
*
**
***
****
*****

Sample Input:
3
Sample Output:
*
**
****/
public class PrintPattern {
	// function to print the required pattern
	public static String func(int n) {
		if (n <= 0) {
			return "";
		}
		String res = func(n - 1);
		res = res + "*";
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		func(n);
	}
}
