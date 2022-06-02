package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {

		Integer[] numbers = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };

		// 1.Removing duplicates using set
		Set<Integer> num = new TreeSet<Integer>(Arrays.asList(numbers));

		// 2.Printing set to make sure it is in ascending order
		System.out.println(num);

		// 3.Passing Set values to List
		List<Integer> missingNumber = new ArrayList<Integer>(num);

		// 4.Iterating from first index to find the missing number
		for (int i = 0; i < missingNumber.size() - 1; i++) {
			if (((missingNumber.get(i)) + 1) != (missingNumber.get(i + 1)))
				System.out.println("Missing number is: " + (missingNumber.get(i) + 1));
		}

	}
}
