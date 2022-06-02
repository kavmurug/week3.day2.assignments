package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// 1.Declare an Array
		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// 2.Store the value of array into list
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));

		// 3.Sort the List
		Collections.sort(arrayList);

		// 4.Iterate and Print the missing number in the list
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) != (i + 1)) {
				System.out.println("Missing Number is " + (i + 1));
				break;
			}
		}

	}

}
