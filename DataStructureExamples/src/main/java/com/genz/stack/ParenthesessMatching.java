package com.genz.stack;

import java.util.Scanner;

public class ParenthesessMatching {
	public static boolean match(String parens) {
		int count = 0;
		char[] charArray = parens.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(')
				++count;
			else if (charArray[i] == ')') {
				if (count > 0) {
					--count;
				} else {
					return false;
				}
			}
		}
		return count == 0 ? true : false;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(match(in.nextLine()));
	}
}
