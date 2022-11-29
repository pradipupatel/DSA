package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Sample Input 1:
abcd
Sample Output 1:
dcba
Sample Input 2:
abcdef
Sample Output 2:
fedcba*/
public class ReverseUsingStack {

	public static void main(String arg[]) {
		Stack<Character> s = new Stack<Character>();
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		for (int i = 0; i < data.length(); i++) {
			s.push(data.charAt(i));
		}
		while (!s.isEmpty())
			System.out.print(s.pop());
	}

}
