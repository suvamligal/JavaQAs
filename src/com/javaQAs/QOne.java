
package com.javaQAs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// Counting duplicate characters: Write a program
// that counts duplicate characters from a given string.
public class QOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a name: ");
		// String name = scan.next();
		String name = scan.nextLine();

		// Map<String, Integer> count = new TreeMap<>(); // sorted alphabetically.

		Map<String, Integer> count = new LinkedHashMap<>(); // ordered in a way as it takes input.

		for (int i = 0; i < name.length(); i++) {

			char offset = name.charAt(i);
			String offsetIndex = String.valueOf(offset);

			if (offsetIndex.contains(" ")) {
				continue;
			}

			if (!count.containsKey(offsetIndex)) {
				count.put(offsetIndex, 1);
			} else {
				Integer value = count.get(offsetIndex);
				count.put(offsetIndex, value + 1);
			}
		}
		System.out.println(count);

		scan.close();

	}

}
