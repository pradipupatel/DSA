package com.genz.sorting;

public class Quicksort {

	static void swap(int[] number, int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}

	static int partition(int[] number, int low, int high) {
		int pivot = number[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {

			if (number[j] > pivot) {
				i++;
				swap(number, i, j);
			}
		}
		swap(number, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] number, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(number, low, high);
			quickSort(number, low, partitionIndex - 1);
			quickSort(number, partitionIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] number = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		quickSort(number, 0, number.length - 1);
		for (int num : number) {
			System.out.println(num);
		}
	}
}
