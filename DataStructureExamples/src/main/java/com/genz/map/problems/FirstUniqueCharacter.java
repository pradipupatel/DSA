package com.genz.map.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
First Unique Character
Description
You will be given a string, and you have to print the first unique character of the string, i.e., the non-repeating character of the string.
Note: 
The string may contain duplicates.
If there is no unique character, then print -1.
Input: The input will be in the following format:
The first line will be a string.
Output: The output should be in the following format:
Print the first unique character of the string or -1 if no unique character is found.
Sample Input-1:
abcdabdef
Sample output-1:
c
The input is a string "abcdabdef". The output is character c from the input string, as c is the only character that is not repeated in the string.
Sample input-2:
aabb
Sample output-2:
-1
The input is a string "aabb". The output is -1, as there is no non-repeating character present in the input string.
*/
public class FirstUniqueCharacter {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();

        //storing the input string to String variable "str"
        String str = in.nextLine();
        for(int i=0;i<str.length();i++) {
        	char atI = str.charAt(i);
        	if(charMap.containsKey(atI)) {
        		int n = charMap.get(atI);
        		charMap.put(atI, ++n);
        	} else {
        		charMap.put(atI, 1);
        	}
        }
        
        boolean isUniqueCharPresent = false;
        for(char ch:charMap.keySet()) {
        	if(charMap.get(ch) == 1) {
        		isUniqueCharPresent = true;
        		System.out.println(ch);
        		break;
        	}
        }
        if(!isUniqueCharPresent) {
        	System.out.println(-1);
        }
    }
}
