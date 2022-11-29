package com.genz.stack;

import java.util.Scanner;
import java.util.Stack;

/*Input:
4
4
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1
3
3

Output:
path found*/

public class PathBetweenPixel {

	/*
	 * Basic structure of a node of a stack. 'move' will keep track of the direction
	 * in which you can move next.
	 */
	class Node {
		int x, y;
		int move;

		Node(int i, int j) {
			x = i;
			y = j;
			move = 0;
		}
	}

	public boolean findPath(int n, int m, int[][] pixel, boolean[][] visited, int px, int py) {

		if (m == 0 || n == 0) {
			System.out.println("invalid input");
			System.exit(0); 	
		}
		int i=0,j=0;
		Stack<Node> stack = new Stack<Node>();
		Node temp = new Node(i,j);
		stack.push(temp);
		
		while(!stack.isEmpty()) {
			int d = stack.peek().move;
			i = stack.peek().x;
			j = stack.peek().y;
			
			stack.peek().move++;
			if(i==px && j==py) {
				return true;
			}
			
			if(d == 0){
				if(pixel[i-1][j] == 0) {
					
				}
			} else if (d==1){
				
			}else if(d ==2 ){
				
			} else if(d==3) {
				
			} else {
				
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		PathBetweenPixel obj = new PathBetweenPixel();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean[][] visited = new boolean[n][m];

		int[][] pixel = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = true;
				pixel[i][j] = in.nextInt();
			}
		}

		int px = in.nextInt();
		int py = in.nextInt();
		if (obj.findPath(n, m, pixel, visited, px, py)) {
			System.out.println("path found");
		} else {
			System.out.println("path not found");
		}

	}
}
