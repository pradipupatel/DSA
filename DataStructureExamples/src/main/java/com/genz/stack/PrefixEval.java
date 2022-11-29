package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Sample Input 1:
+ 6 4
Sample Output 1:
10
Sample Input 2:
 
Sample Output 2:
10*/
public class PrefixEval {

	public static int computeResult(String input) {
		Stack<String> stack = new Stack<String>();
		input = input.replaceAll("\\(", "\\( ");
		input = input.replaceAll("\\)", " \\)");
		String[] inputString = input.split(" ");
		for (int i = 0; i < inputString.length; i++) {
			String currentString = inputString[i];
			boolean isSymbol = checkSymbol(currentString);
			if (!isSymbol) {
				if (currentString.equalsIgnoreCase(")")) {
					while (!stack.peek().equalsIgnoreCase("(")) {
						calculateTotal(stack);
						String tempNum = stack.pop();
						if (stack.peek().equalsIgnoreCase("(")) {
							stack.pop();
							stack.push(tempNum);
							break;
						}
					}

				} else {
					boolean isLastOperand = !(checkSymbol(stack.peek()) || stack.peek().equalsIgnoreCase("("));
					stack.push(currentString);
					if (i == inputString.length - 1) {
						while (stack.size() != 1) {
							calculateTotal(stack);
						}
					} else {
						
						while(isLastOperand) {
							calculateTotal(stack);
							//Need to add code isOperand
							//String operand1 = calculateTotal(stack)
						}
					}
				}
			} else {
				if (stack.isEmpty() || checkSymbol(stack.peek()) || stack.peek().equalsIgnoreCase("(")) {
					stack.push(currentString);
				} else {
					String operand1 = stack.pop();
					if (checkSymbol(stack.peek())) {
						stack.push(operand1);
						stack.push(currentString);
					} else {
						calculateTotal(stack);
					}
				}
			}
		}
		return Integer.parseInt(stack.pop());
	}

	private static void calculateTotal(Stack<String> stack) {
		int operand1 = Integer.parseInt(stack.pop());
		int operand2 = Integer.parseInt(stack.pop());
		char operator = stack.pop().toCharArray()[0];
		switch (operator) {
		case '+':
			stack.push(String.valueOf((operand2 + operand1)));
			break;
		case '-':
			stack.push(String.valueOf((operand2 - operand1)));
			break;
		case '*':
			stack.push(String.valueOf((operand2 * operand1)));
			break;
		case '/':
			stack.push(String.valueOf((operand2 / operand1)));
			break;
		case '^':
			stack.push(String.valueOf((operand2 ^ operand1)));
			break;
		}
	}

	private static boolean checkSymbol(String currentString) {
		if (currentString.equalsIgnoreCase("+") || currentString.equalsIgnoreCase("-")
				|| currentString.equalsIgnoreCase("*") || currentString.equalsIgnoreCase("/")
				|| currentString.equalsIgnoreCase("^"))
			return true;
		return false;
	}

	public static void main(String[] args) {
		PrefixEval obj = new PrefixEval();
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		int result = obj.computeResult(inputString);
		System.out.println(result);
	}
}