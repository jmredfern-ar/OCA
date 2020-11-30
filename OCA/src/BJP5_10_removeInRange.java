/*
 * Write a method called removeInRange that accepts four parameters: an ArrayList of integers, 
 * an element value, a starting index, and an ending index. The method's behavior is to remove all 
 * occurrences of the given element that appear in the list between the starting index (inclusive) 
 * and the ending index (exclusive). Other values and occurrences of the given value that appear 
 * outside the given index range are not affected.
 *
 * For example, for the list [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16], a call of 
 * removeInRange(list, 0, 5, 13); should produce the list [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16]. 
 * Notice that the zeros located at indices between 5 inclusive and 13 exclusive in the original list 
 * (before any modifications were made) have been removed.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BJP5_10_removeInRange {

	public static void main(String[] args) {
		
		final Integer VALUE = 0;
		final int START = 5;
		final int END = 13;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(2);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(6);
		list.add(0);
		list.add(8);
		list.add(0);
		list.add(10);
		list.add(0);
		list.add(12);
		list.add(0);
		list.add(14);
		list.add(0);
		list.add(16);
		
		System.out.println(list);
		removeInRange(list, VALUE, START, END);
		System.out.println(list);
	}

	public static void removeInRange(List<Integer> list, Integer value, int start, int end) {
		List<Integer> result = new ArrayList<Integer>();
			for(int i=0; i<list.size(); i++) {
				if(i < start || i >= end) {
				 //add "element"
					System.out.println("Adding #1: " + i + " " + list.get(i));
					result.add(list.get(i));
				} else {
					if(list.get(i) != value) {
						System.out.println("Adding #2: " + i + " " + list.get(i));
						result.add(list.get(i));
					}
				}
			}
			list.clear();
			list.addAll(result);
	}
}
