package com.genz.sorting;

import java.util.Scanner;

//Select element and comapare with every next element and put first max to last index
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalIterationSize = sc.nextInt();
		int arraySize = sc.nextInt();
		int[] intArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.println(totalBubbleSortSwaps(intArray, totalIterationSize));
	}

	static int totalBubbleSortSwaps(int[] array, int M) {
		int size = array.length;
		int totalSwaps = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < size - i; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					++totalSwaps;
				}
			}
		}
		return totalSwaps;
	}
}
