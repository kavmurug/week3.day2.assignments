package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {

		// 1.Declare an Array
		Integer[] data = { 3, 2, 11, 4, 6, 7 };

		// 2. Store the value of array into list
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(data));

		// 3.Sort the List
		Collections.sort(arrayList);

		// 4.Get the Size of the list
		int size = arrayList.size();

		// 5.Iterate and Print all the numbers in the list
		for (int i = 0; i < size; i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		// 6.Print the Second Largest number in the list
		System.out.println('\n' + "Second Largest number: " + arrayList.get(size - 2));
	}
}
