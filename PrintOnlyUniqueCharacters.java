package week3.day1.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String input = "babu";

		// 1.Convert String to Character Array
		char[] allChar = input.toCharArray();

		// 2.Create new Set
		Set<Character> unique = new HashSet<Character>();

		// 3.Add each Character to the set
		for (int i = 0; i < allChar.length; i++) {
			unique.add(allChar[i]);
		}

		// 4.Print the Set
		System.out.println(unique);

	}
}
