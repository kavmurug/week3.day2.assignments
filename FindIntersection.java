package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		// 1.Declare two arrays
		Integer[] array1 = { 3, 2, 11, 4, 6, 7 };
		Integer[] array2 = { 1, 2, 8, 4, 9, 7 };
		
		// 2.Store the value of arrays into lists
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2));
		
		// 3.Compare both the lists and Print the similar numbers in both lists 
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					System.out.print(list1.get(i) + ",");
				}
			}
		}

	}
}
