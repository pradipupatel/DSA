package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Input :
a^b
Output:
ab^

Input:
a*(b+c)
Output:
abc+**/
public class InfixToPostfix {
	public static void main(String arg[]) {
		Stack<Character> s = new Stack<Character>();
		Scanner in = new Scanner(System.in);

		String exp = in.nextLine();
		String postfixExp = "";
		for (int i = 0; i < exp.length(); i++) {
			char atI = exp.charAt(i);
			if (Character.isAlphabetic(atI)) {
				postfixExp = postfixExp + atI;
			} else {
				if (atI == ')') {
					while (s.peek() != '(') {
						postfixExp = postfixExp + s.pop();
					}
					if (s.peek() == '(') {
						s.pop();
					}
				} else if (atI == '(') {
					s.push(atI);
				} else if (!s.isEmpty() && s.peek() != '(' && isSymbol(atI) && exp.charAt(i+1) != '(') {
					while (!s.isEmpty() && prec(atI) <= prec(s.peek())) {
						postfixExp = postfixExp + s.pop();
					}
					s.push(atI);
				} else {
					s.push(atI);
				}
			}
		}
		while (!s.empty()) {
			postfixExp = postfixExp + s.pop();
		}
		System.out.println(postfixExp);
	}

	private static int prec(char atI) {
		if (atI == '+' || atI == '-')
			return 1;
		else if (atI == '*' || atI == '/')
			return 2;
		else if (atI == '^')
			return 3;

		return 0;
	}

	private static boolean isSymbol(char atI) {
		if (atI == '+' || atI == '-' || atI == '*' || atI == '/' || atI == '^')
			return true;
		return false;
	}

}
