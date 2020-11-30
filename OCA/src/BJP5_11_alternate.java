/*
 * Write a method called alternate that accepts two Lists 
 * of integers as its parameters and returns a new List 
 * containing alternating elements from the two lists.
 * 
 * If the lists do not contain the same number of elements, 
 * the remaining elements from the longer list should be 
 * placed consecutively at the end.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJP5_11_alternate {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(new Integer[] {1, 2, 3, 4});
		List<Integer> l2 = Arrays.asList(new Integer[] {5, 6, 7, 8});
		
		List<Integer> result = alternate(l1, l2);
		System.out.println(result);
	}
	
	public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
		
		List<Integer> result = new ArrayList<Integer>();
		int len1 = l1.size(), len2 = l2.size(), max=0;
		
		//use ternary op?
		if(len1 > len2) {
			max = len1;
		} else {
			max = len2; //len2 is > or = to len1
		}
		
		for(int i=0; i<max; i++) {
			
			if(i < l1.size()) {
				result.add(l1.get(i));
			}
			if(i < l2.size()) {	
				result.add(l2.get(i));
			}
		}
		return result;
	}
}
