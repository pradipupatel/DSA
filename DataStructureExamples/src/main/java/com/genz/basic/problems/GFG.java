package com.genz.basic.problems;

import java.util.LinkedList;
import java.util.Queue;

//java program to add
//two binary strings

public class GFG {

	// This function adds two
	// binary strings and return
	// result as a third string
	static Queue<Character> queue = new LinkedList<Character>();

	static String binaryAddition(String s1, String s2)
	{	
		if(s1.charAt(0) == '0' && s2.charAt(0) == '0'){
			return "0";
		}
		int s = 0;		
		int i = s1.length() - 1, j = s2.length() - 1;
		while (i >= 0 || j >= 0 || s == 1)
		{
			s += ((i >= 0)? s1.charAt(i) - '0': 0);
			s += ((j >= 0)? s2.charAt(j) - '0': 0);
			queue.add((char)(s % 2 + '0'));
			s /= 2;
			i--; j--;
		}
		System.out.println(queue);
		String addition = "";
		while(!queue.isEmpty()) {
			addition = queue.remove() + addition;
		}
		return addition;
	}

	//Driver code
	public static void main(String args[])
	{
		String a = "111", b="11";
		
		System.out.print(binaryAddition(a, b));
	}
}

//This code is contributed by Sam007.
