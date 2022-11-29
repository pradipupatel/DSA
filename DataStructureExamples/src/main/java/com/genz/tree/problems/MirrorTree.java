package com.genz.tree.problems;

import java.util.Scanner;

/*
Mirror a Tree
Description
Consider the binary tree given below. You are required to convert it into its mirror image. 
﻿The mirror image of this binary tree will be:﻿
﻿Input:
The input will be in the following format:
The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
The second line contains space-separated ‘n’ values. No value should be equal to -1. This is the level-order traversal of the tree. The code for inserting the values in the tree for the given level order traversal has been addressed in the code.
Output:
The output should be the pre-order traversal of the mirror tree with the nodes separated by spaces. The code for pre-order traversal of a tree has been provided to you in the stub code. You only need to complete the code for mirroring a tree.
Sample Input:
5
1 2 3 4 5
Sample Output:
1 3 2 5 4
Sample Input:
6
6 9 8 7 4 5
Sample Output:
6 8 5 9 4 7
Execution Time Limit
*/
public class MirrorTree {
	public static void main(String[] x) {
		Tree tree = new Tree();
		
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		if(size <= 0){
		    System.out.println("Size should be a positive integer");
		}
		
		else{
    		int[] elementsArr = new int[size];
    		for(int i = 0; i < size; i++) {
    			elementsArr[i] = sc.nextInt();
    		}
    		
    		tree.root = tree.insertNode(elementsArr, tree.root, 0);
    		
    		tree.mirror(tree.root);
    		
    		tree.preOrderDFS(tree.root);
		}
	}
}
