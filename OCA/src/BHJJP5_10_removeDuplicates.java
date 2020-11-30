/*
 * Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings 
 * and that eliminates any duplicates from the list. For example, suppose that a variable called 
 * list contains the following values: {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 
 * After calling removeDuplicates(list); the list should store the following values: 
 * {"be", "is", "not", "or", "question", "that", "the", "to"}
 *
 * Because the values will be sorted, all of the duplicates will be grouped together.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BHJJP5_10_removeDuplicates {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("be");
		list.add("be");
		list.add("is");
		list.add("not");
		list.add("or");
		list.add("question");
		list.add("that");
		list.add("the");
		list.add("to");
		list.add("to");
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		
	
		removeDuplicates(list);
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);

	}
	
	public static void removeDuplicates(List<String> list) {
		
		List<String> result = new ArrayList<String>();
		for(String element : list) {
			if(!result.contains(element)) {
				result.add(element);
			}
		}
		
		list.clear();
		list.addAll(result);
	}

}
