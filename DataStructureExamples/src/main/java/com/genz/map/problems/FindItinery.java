package com.genz.map.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Find Itinerary From all Tickets
Description
You will be given the source and destination of all the tickets in the form of a map, and you have to print the itinerary from all those tickets.
Note: 
The path covered by the tickets is not circular. 
Other than the final destination, there is exactly one ticket from every city.
Input: The input will be in the following format:
The first line will be an integer ‘n’ indicating the size of the map containing the source and the destination of all the tickets.
The next ‘n’ lines will be the source and the destination of all the tickets.
Each line represents the source and the destination of each ticket, separated by space.
Output: The output should be in the following format
Print all the names of the cities in the itinerary, separated by a space. 
Note: 
If you cannot get the start of the itinerary, print 'Invalid'.
If multiple itineraries are possible and if they are also valid, then print the itinerary that is the largest in lexicographical order when the complete itinerary is treated as a string. Refer to the ‘Sample Test case 2’ given below.
Sample test case 1:
Input:
4
Mumbai Indore
Hyderabad Warangal
Indore Hyderabad
Delhi Mumbai
Output:
Delhi Mumbai Indore Hyderabad Warangal 
Sample test case 2:
Input:
2
abc def
abc deg
Output:
abc deg
Sample test case 3:
Input:
3
abc def
abc deg
deg fgt
Output:
abc deg fgt
*/
public class FindItinery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// get the no of tickets from input
		int n = in.nextInt();

		// map to store all the tickets
		Map<String, String> tickets = new HashMap<String, String>();
		Map<String, String> reverseEntryTickets = new HashMap<String, String>();

		// Store the source and destination of the tickets to the map "tickets"
		for (int i = 0; i < n; i++) {
			tickets.put(in.next(), in.next());
			in.nextLine();
		}

		String startingCity = null;

		for (Map.Entry<String, String> entry : tickets.entrySet())
			reverseEntryTickets.put(entry.getValue(), entry.getKey());

		for (Map.Entry<String, String> entry : tickets.entrySet()) {
			if (!reverseEntryTickets.containsKey(entry.getKey())) {
				startingCity = entry.getKey();
				break;
			}
		}

		if (startingCity == null) {
			System.out.println("Invalid");
		} else {
			String to = tickets.get(startingCity);
			String path = startingCity;
			while (to != null) {
				path = path + " " + to;
				startingCity = to;
				to = tickets.get(to);
			}
			System.out.println(path);
		}

	}
}
