package com.genz.map.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Anagram of key value pairs of a HashMap
Description
You are given a HashMap with n number of keys and values. You need to print key-value pairs that are an anagrams of each other in the dictionary order of keys (alphabetical order based on the first letter of the word). An anagram is a word, phrase or name that is formed by rearranging the letters of another. 
Example:
Map = {rasp spar, dog cat}
Output: 
rasp : spar
Here spar is formed from rasp.
Input: The input will be in the following format:
The first line should be the number of elements present in the map.
Next, n lines contain the key-value pairs.
Output:
All the key-value pairs that are an anagram of each other should be printed in the following format:
Key1: Value1
Key2: Value2
Note: If there is no such key-value pair anagram of each other, then the output should be false.
Sample Case-1:
Input:
3
BAT TAB
CAT DOG
EAT TEA
Output:
BAT:TAB
EAT:TEA
Here, 3 represents the number of key-value pairs present in the map. The next three lines in the input represent the key-value pairs. The output is those key-value pairs that are anagrams.
Sample Case-2:
Input:
2
A B
C D
Output:
false
Here, 2 represents the number of key-value pairs present in the map. The next two lines in the input represent the key-value pairs. The output is false, which represents that no anagrams are present in the input.
*/
public class HashmapAnagramCheck {
	// Method to check if two strings are anagram of each other or not
	public static boolean check(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		arrange(ch1);
		arrange(ch2);
		return new String(ch1).equalsIgnoreCase(new String(ch2));
	}

	// Method to sort the character array
	public static void arrange(char[] ch) {
		char temp;
        int i = 0;
        while (i < ch.length) {
            int j = i + 1;
            while (j < ch.length) {
                if (ch[j] < ch[i]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
	}

	public static void main(String[] x) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String key = "";
		String value ="";
		boolean isAnagramExist = false;
		for (int i = 1; i <= num; i++) {
			key = sc.next();
			value = sc.next();
			map.put(key, value);
		}
		for(String k: map.keySet()) {
			if(check(k,map.get(k))) {
				isAnagramExist = true;
				System.out.println(k+":"+map.get(k));
			}
		}
		if(!isAnagramExist) {
			System.out.println(false);
		}
	}
}
