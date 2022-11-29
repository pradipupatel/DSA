package com.genz.tree.problems;

import java.util.Scanner;

/*
Spiral Level-Order Traversal
Description
Consider the binary tree given below. You are required to print the spiral level-order traversal for it.
﻿Output:
1 2 3 5 4
Input:
The input will be in the following format:
The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. This is the level-order traversal of the tree. The code for inserting the values in the tree for the given level-order traversal has been addressed in the code.
Output:
The output should be the spiral level-order traversal of the tree with the nodes separated by spaces.
Sample Input:
5
1 2 3 4 5
Sample Output:
1 2 3 5 4
Sample Input:
4
8 2 5 6
Sample Output:
8 2 5 6
*/

public class DFSSpiralOrderTraversal {
	public static void main(String[] x) {
		Tree tree = new Tree();
		
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		if (size < 0){
		    System.out.println("Size should be a positive integer");
		}
		
		else{
    		int[] elementsArr = new int[size];
    		for(int i = 0; i < size; i++) {
    			elementsArr[i] = sc.nextInt();
    		}
    		
    		tree.root = tree.insertNode(elementsArr, tree.root, 0);
    		
    		tree.spiralOrder(tree.root);
		}
	}
}
