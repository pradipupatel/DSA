package com.genz.linear.search;

import java.util.Scanner;

public class ReverseElementSearch {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int array[] = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = input.nextInt();
		}
		int key = input.nextInt();
		input.close();
		for (int j=0,i = array.length-1; i >= 0 ; i--,++j) {
			if(array[i]==key) {
				System.out.println(j);
				break;
			}
		}
	}
}