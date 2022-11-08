package com.genz.basic.problems;

import java.util.Scanner;

/*Sample Input 00:
5
2 7 8 6 13
4
15 11 9 5

Sample Output 00:
11
Explanation 00:
Element 6 in array1 can be replaced by element 11 (maximum possible) in array2.
Sample Input 01:
5
2 7 8 6 13
4
14 15 16 17*/
public class TwoSortedWithMax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int[] array1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			array1[i] = s.nextInt();
		}

		int n2 = s.nextInt();
		int[] array2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			array2[i] = s.nextInt();
		}
		int max = 0;
		// Write your code here
		for (int i = 1; i < n1 - 1; i++) {
			boolean isReplacementRequired = false;

			if (array1[i - 1] > array1[i]) {
				isReplacementRequired = true;
			}

			if (isReplacementRequired) {
				for (int j = 0; j < n2; j++) {
					if (array2[j] > max && array2[j] >= array1[i - 1] && array2[j] <= array1[i + 1]) {
						max = array2[j];
					}
				}
				break;
			}
			
		}

		if (max == 0) {
			System.out.println("Not Possible");
		} else {
			System.out.println(max);
		}

	}
}
