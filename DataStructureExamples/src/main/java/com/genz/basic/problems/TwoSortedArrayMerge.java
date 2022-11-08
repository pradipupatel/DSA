package com.genz.basic.problems;

import java.util.Scanner;

/*Sample Input 1:
3  
1 2 3 
4
4 5 6 7
Sample Output 1:
7
6
5
4
3
2
1*/
public class TwoSortedArrayMerge {
	public static void main(String ss[]) {
		Scanner scanner = new Scanner(System.in);
		int sizeArray1 = scanner.nextInt();
		int sortedArray1[] = getArrayInput(sizeArray1, scanner);
		int sizeArray2 = scanner.nextInt();
		int sortedArray2[] = getArrayInput(sizeArray2, scanner);

		int descendingMerge[] = mergeBothInDescendingOrder(sortedArray1, sortedArray2);
		for (int i = 0; i < descendingMerge.length; i++) {
			System.out.println(descendingMerge[i]);
		}
	}

	private static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2) {
		int[] outputArray = new int[sortedArray1.length + sortedArray2.length];
		int i = sortedArray1.length - 1, j = sortedArray2.length - 1, k = 0;
		while (i >= 0 && j >= 0) {
			if (sortedArray1[i] < sortedArray2[j]) {
				outputArray[k] = sortedArray2[j];
				++k;
				--j;
			} else {
				outputArray[k] = sortedArray1[i];
				++k;
				--i;
			}
		}
		while (i >= 0) {
			outputArray[k] = sortedArray1[i];
			++k;
			--i;
		}
		while (j >= 0) {
			outputArray[k] = sortedArray2[j];
			++k;
			--j;
		}
		return outputArray;
	}

	public static int[] getArrayInput(int sizeArray, Scanner scanner) {

		int[] array = new int[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			array[i] = scanner.nextInt();
		}

		return array;
	}
}
