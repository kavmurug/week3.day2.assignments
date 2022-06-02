package week3.day1.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

		// 1.Declare a String
		String text = "We learn java basics as part of java sessions in java week1";

		// 2.Split the String and Store into the array
		String strArray[] = text.split(" ");

		// 3.Print the Length of the array
		System.out.println(strArray.length);

		// 4.Iterate and Print the values of the array
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}

		// 5.Store the values of the array into Set
		Set<String> removeDuplicates = new LinkedHashSet<String>(Arrays.asList(strArray));

		// 6.Print the values of the Set
		System.out.println('\n');
		System.out.println(removeDuplicates);

	}
}
