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
		// write your code here
		if(n == 1)
			return "*";
		else 
			return "*" + func(--n);
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(func(n));
	}
}
