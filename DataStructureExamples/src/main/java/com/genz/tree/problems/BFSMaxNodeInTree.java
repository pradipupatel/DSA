package com.genz.tree.problems;

import java.util.Scanner;

/*
Print Maximum Value
Description
You are given a binary tree. You need to print the node that has the highest value in the binary tree using the BFS (Iterative) approach. If the tree is empty, the output should be -1.
img_4-01.jpg 313.96 KB
Output: 10
Here, in the given tree, the node that has the maximum value is 10. Therefore, the output is 10.
Input: 
The input will be in the following format:
The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. No value should be equal to -1. The code for inserting the values in the tree has already been taken care of in the code.
Output:
The output should be the maximum value among all nodes in the tree.
Sample Input:
5
1 2 3 4 5
Sample Output:
5
Sample Input:
0
Sample Output:
-1
Execution Time Limit
*/
public class BFSMaxNodeInTree {
	public static void main(String[] x) {
		BinaryTree tree = new BinaryTree();

		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		if (size == 0) {
			System.out.println("-1");
		}

		else if (size < 0) {
			System.out.println("Size should be a positive integer");
		}

		else {
			int[] elementsArr = new int[size];
			for (int i = 0; i < size; i++) {
				elementsArr[i] = sc.nextInt();
			}

			tree.root = tree.insertNode(elementsArr, tree.root, 0);

			System.out.println(tree.findMax(tree.root));
		}
	}
}

class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	// Method to construct a binary tree from the given array
	public Node insertNode(int[] elementsArr, Node node, int i) {
		if (i < elementsArr.length) {
			node = new Node(elementsArr[i]);

			node.left = insertNode(elementsArr, node.left, 2 * i + 1);
			node.right = insertNode(elementsArr, node.right, 2 * i + 2);
		}
		return node;
	}

	// Method to find the largest value in the tree
	public int findMax(Node node) {
		int height = height(node);
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= height; i++) {
			int maxOnCurrentLevel = maxAtLevel(root, i, 1);
			if (max < maxOnCurrentLevel) {
				max = maxOnCurrentLevel;
			}
		}
		return max;

	}

	private int maxAtLevel(Node root2, int level, int currentLevel) {
		if (root2 == null)
			return 0;
		if (level == currentLevel)
			return root2.data;
		else {
			int maxAtLeftLevel = maxAtLevel(root2.left, level, currentLevel + 1);
			int maxAtRightLevel = maxAtLevel(root2.right, level, currentLevel + 1);
			return maxAtLeftLevel > maxAtRightLevel ? maxAtLeftLevel : maxAtRightLevel;
		}

	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}
		int leftTreeHeight = height(node.left);
		int rightTreeHeight = height(node.right);
		return leftTreeHeight > rightTreeHeight ? leftTreeHeight + 1 : rightTreeHeight + 1;
	}

}
