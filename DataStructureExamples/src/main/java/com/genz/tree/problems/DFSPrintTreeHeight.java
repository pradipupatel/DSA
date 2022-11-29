package com.genz.tree.problems;

import java.util.Scanner;

/*
Find Height of Binary Tree
Description
You are given a binary tree. You need to print the maximum height of the binary tree. If the tree is NULL (empty tree), print the height of the tree as 0.﻿
Image 5-01.jpg 97.24 KB
Output: 3
Here, in the given tree, the maximum height of the binary tree is 3.
Input: 
The input will be in the following format:
The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. The code for inserting the values in the tree has been addressed in the code.
Output:
The output should be the height of the tree keeping in mind that the root node is at level 1.
Sample Input:
5
1 2 3 4 5
Sample Output:
3
Sample Input:
0
Sample Output:
0
Execution Time Limit
*/
public class DFSPrintTreeHeight {
	public static void main(String[] x) {
		Tree tree = new Tree();

		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		if (size < 0) {
			System.out.println("Size should be a positive integer");
		}

		else {
			int[] elementsArr = new int[size];
			for (int i = 0; i < size; i++) {
				elementsArr[i] = sc.nextInt();
			}

			tree.root = tree.insertNode(elementsArr, tree.root, 0);

			System.out.println(tree.findHeight(tree.root));
		}
	}
}
