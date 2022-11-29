package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Sample Input:
(((a+1))+(b+1))

Sample output:
Input string contains duplicate parenthesis*/
public class CheckDuplicateParenthesis {
	public static String findDuplicateParenthesis(String inputString) {
		Stack<Character> charStack = new Stack<Character>();
		boolean isDuplicatePar = false;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ')') {
				if (charStack.peek() == '(') {
					isDuplicatePar = true;
					break;
				} else {
					while (!charStack.isEmpty()) {
						char ch = charStack.pop();
						if (ch == '(')
							break;
					}
				}
			} else {
				charStack.push(inputString.charAt(i));
			}
		}
		if (isDuplicatePar) {
			return "Input string contains duplicate parenthesis";
		} else {
			return "Input string does not contain duplicate parenthesis";
		}
	}

	public static void main(String[] args) {
		CheckDuplicateParenthesis obj = new CheckDuplicateParenthesis();
		String inputString = new String();
		Scanner in = new Scanner(System.in);
		inputString = in.nextLine();
		System.out.println(obj.findDuplicateParenthesis(inputString));

	}

}
