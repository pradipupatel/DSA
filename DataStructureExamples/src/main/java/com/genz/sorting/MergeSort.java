package com.genz.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*Sample Input-1:
8
9 45 76 23 47 1 5 11

Sample Output-1
[76,47,45,23,11,9,5,1]*/
public class MergeSort {
	public static int[] sort(int[] randomNumbers) {
		return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
	}

	public static int[] mergeSort(int[] numbers, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(numbers, first, mid);
			mergeSort(numbers, mid + 1, last);
			merge(numbers, first, mid, last);
		}
		return numbers;
	}

	private static void merge(int[] numbers, int first, int mid, int last) {
		// TODO Auto-generated method stub
		int lArraySize = mid - first + 1;
		int rArraySize = last - mid;
		int[] lArray = new int[lArraySize];
		int[] rArray = new int[rArraySize];
		int k = first;
		for (int i = 0; i < lArraySize; i++) {
			lArray[i] = numbers[first + i];
		}

		for (int j = 0; j < rArraySize; ++j) {
			rArray[j] = numbers[mid + 1 + j];
		}
		int i = 0, j = 0;
		while (i < lArraySize && j < rArraySize) {
			if (lArray[i] >= rArray[j]) {
				numbers[k] = lArray[i];
				i++;
			} else {
				numbers[k] = rArray[j];
				j++;
			}
			k++;
		}
		while (i < lArraySize) {
			numbers[k] = lArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < rArraySize) {
			numbers[k] = rArray[j];
			j++;
			k++;
		}

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] randomNumbers = new int[size];
		for (int i = 0; i < size; i++) {
			randomNumbers[i] = scanner.nextInt();
		}
		int[] sortedNumbers;
		sortedNumbers = sort(randomNumbers);
		System.out.println(Arrays.toString(sortedNumbers));
	}
}
