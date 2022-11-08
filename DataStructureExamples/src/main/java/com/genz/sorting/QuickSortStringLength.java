package com.genz.sorting;

import java.util.Scanner;

public class QuickSortStringLength {

	static void swap(String[] names, int i, int j) {
		String temp = names[i];
		names[i] = names[j];
		names[j] = temp;
	}

	static int partition(String[] names, int low, int high) {
		int pivot = names[high].length();
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {

			if (names[j].length() < pivot) {
				i++;
				swap(names, i, j);
			}
		}
		swap(names, i + 1, high);
		return (i + 1);
	}

	static void quickSort(String[] names, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(names, low, high);
			quickSort(names, low, partitionIndex - 1);
			quickSort(names, partitionIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNames = sc.nextInt();
		String[] names = new String[totalNames];
		for (int i = 0; i < totalNames; i++) {
			names[i] = sc.next();
		}
		quickSort(names, 0, names.length - 1);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
