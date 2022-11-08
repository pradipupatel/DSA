package com.genz.recursion;

import java.util.Iterator;
import java.util.Scanner;

public class PrintPrimeTillN {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		primesLessThanOrEqualTon(n);
	}

	// Method to print all primes less than or equal to n in ascending order
	static void primesLessThanOrEqualTon(int n) {
		// Write your code here
		if (n <= 1) {
			System.out.println("There are no prime numbers less than or equal to "+n);
		} else {
			for (int i = 2; i < n; i++) {

				boolean isPrime = checkIfPrime(i);
				if (isPrime) {
					System.out.print(i + " ");
				}

			}

		}
	}

	private static boolean checkIfPrime(int number) {
		// TODO Auto-generated method stub
	
		if (number == 2 || number == 3 || number == 5)
			return true;
		if (number % 2 == 0 || number % 3 == 0)
			return false;
		boolean isPrime = true;
		int loopSize = (int) Math.sqrt(number);
		for (int i = 5; i <= loopSize; i+=6) {
			if(number%i == 0 || number%(i+2) == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
