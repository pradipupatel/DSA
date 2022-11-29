package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeUsingQueue {
	public void checkPalindrome(String input) {
		Queue<Character> queue = new LinkedList<Character>();
		String reverseString = "";
		for (int i = 0; i < input.length(); i++) {
			queue.add(input.charAt(i));
		}
		while (!queue.isEmpty()) {
			reverseString = queue.remove() + reverseString;
		}
		if (reverseString.equals(input)) {
			System.out.println("The given input is a palindrome.");
		} else {
			System.out.println("The given input is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		PalindromeUsingQueue obj = new PalindromeUsingQueue();
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		obj.checkPalindrome(inputString);
	}
}
