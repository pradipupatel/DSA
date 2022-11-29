package com.genz.tree.problems;

class Tree {
	Node root;

	Tree() {
		root = null;
	}

	// Method to construct a binary tree from the given array (Do not edit the code
	// given below)
	public Node insertNode(int[] elementsArr, Node node, int i) {
		if (i < elementsArr.length) {
			node = new Node(elementsArr[i]);
			node.left = insertNode(elementsArr, node.left, 2 * i + 1);
			node.right = insertNode(elementsArr, node.right, 2 * i + 2);
		}
		return node;
	}

	// Method to print nodes that are multiple of root node
	public void printNodes(Node node) {
		// Write your code here
		if (node == null)
			return;
		if (node.data == 0) {
			System.out.println("Division by zero is undefined");
			return;
		}
		printNodes(node.left);
		if (node.data % root.data == 0) {
			System.out.print(node.data + " ");
		}
		printNodes(node.right);

	}

	public int findHeight(Node node) {

		if (node == null) {
			return 0;
		}
		int leftSubtreeHeight = findHeight(node.left);
		int rightSubtreeHeight = findHeight(node.left);

		return leftSubtreeHeight > rightSubtreeHeight ? leftSubtreeHeight + 1 : rightSubtreeHeight + 1;

	}

	public void mirror(Node node) {
		// Write your code here
		if (node == null) {
			return;
		}
		mirror(node.left);
		mirror(node.right);
		swap(node);
		
	}

	private void swap(Node node) {
		Node tempNode = node.left;
		node.left = node.right;
		node.right = tempNode;
	}

	public void preOrderDFS(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preOrderDFS(root.left);
		preOrderDFS(root.right);
	}

	public void spiralOrder(Node node) {
		int height = findHeight(node);
		
		for(int i=1; i<=height; i++) {
			printNodes(root, i, 1, true);
		}
	}

	private void printNodes(Node node, int i, int currentLevel, boolean b) {
		// TODO Auto-generated method stub
		
		if(node == null)
			return;
		if(i == currentLevel)
			System.out.print(node.data+ " ");
		if(i%2 == 0) {
			printNodes(node.left, i, currentLevel+1, b);
			printNodes(node.right,i, currentLevel+1, b);
		} else {
			printNodes(node.right, i, currentLevel+1, b);
			printNodes(node.left, i, currentLevel+1, b);
		}
	}
}
