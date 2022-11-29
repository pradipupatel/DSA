package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Input: 
12+ 
Output: 
3 
Input : 
123*-4- 
Output: 
-9*/
public class PostfixEval {
	public static void main(String arg[]) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner in = new Scanner(System.in);
		String exp = in.nextLine();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (Character.isDigit(ch)) {
				s.push(Integer.parseInt(exp.charAt(i) + ""));
			} else {
				getTotal( ch , s);
			}
		}
		System.out.println(s.peek());
	}

	private static void getTotal(char charAt, Stack<Integer> s) {
		int a = s.pop();
		int b = s.pop();
		switch (charAt) {
		case '+':
			s.push(b + a);
			break;
		case '-':
			s.push(b - a);
			break;
		case '*':
			s.push(b * a);
			break;
		case '/':
			s.push(b / a);
			break;
		case '^':
			s.push(b ^ a);
			break;
		default:
			break;
		}
	}

}
