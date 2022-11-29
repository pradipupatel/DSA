package com.genz.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Input:
5
7
Output: 
1100*/
public class GenerateAndAddBinaryNumbers {
	Queue<String> queue = new LinkedList<String>();

	static String generatePrintBinary(int n) {
		if (n == 0) {
			return "0";
		}
		if (n == 1) {
			return "1";
		} else {
			int quotient = n / 2;
			int reminder = n % 2;
			return generatePrintBinary(quotient) + reminder;
		}
	}

	public String binaryAddition(String s1, String s2) {
		String temp = "";
		if (s1.length() > s2.length()) {
			temp = countTotal(s1.charAt(s1.length() - 1) + "", binaryAddition(s1.substring(0, s1.length()), s2));
		} else if (s2.length() > s1.length()) {
			temp = countTotal(s2.charAt(s2.length() - 1) + "", binaryAddition(s1, s2.substring(0, s1.length())));
		} else {
			temp = countTotal(countTotal(s1.charAt(s1.length() - 1) + "", s2.charAt(s2.length() - 1) + ""),
					binaryAddition(s1.substring(0, s1.length()), s2.substring(0, s1.length())));
		}
		return temp;
	}

	private String countTotal(String s1, String s2) {
		if (s1.equals(s1))
			return "0";
		else
			return "1";
	}

	public static void main(String[] args) {
		GenerateAndAddBinaryNumbers obj = new GenerateAndAddBinaryNumbers();
		String first = "";
		String second = " ";
		String result = " ";
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		first = obj.generatePrintBinary(n);
		int m = in.nextInt();
		second = obj.generatePrintBinary(m);
		result = obj.binaryAddition(first, second);
		System.out.println(result);
	}
}
