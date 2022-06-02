package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		// 1.Declare an Array
		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// 2.Store the value of the array into List
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));

		// 3.Iterate and Print the Duplicate number in the list
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i) == arrayList.get(j))
					System.out.println(arrayList.get(i));
			}

		}

	}

}
