package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*For input: 
S1 = 1 2 3
S2 = 1 4 2 5 6 3
Return: True because S2 also contains 1, 2, 3

For input: 
S1 = 1 2 3
S2 = 1 2 4
Return: False because 3 is not present in S2*/
public class CheckStack1InStack2 {
	public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
		while (!sequence1.isEmpty()) {
			while (!sequence2.isEmpty()) {
				int seq1TopNumber = sequence2.pop();
				if (seq1TopNumber == sequence1.peek()) {
					sequence1.pop();
					break;
				}
			}
		}
		return sequence2.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		Stack<Integer> sequence1 = new Stack<Integer>();
		Stack<Integer> sequence2 = new Stack<Integer>();
		for (String elem1 : line1.split(" ")) {
			sequence1.add(Integer.parseInt(elem1));
		}
		for (String elem2 : line2.split(" ")) {
			sequence2.add(Integer.parseInt(elem2));
		}
		Boolean isSubsequence = contains(sequence1, sequence2);
		System.out.println(isSubsequence);
	}
}
