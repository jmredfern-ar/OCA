/*
 * Write a method stutter that takes an ArrayList of Strings and an integer k as parameters 
 * and that replaces every string with k copies of that string. For example, if the list 
 * stores the values ["how", "are", "you?"] before the method is called and k is 4, 
 * it should store the values ["how", "how", "how", "how", "are", "are", "are", "are", "you?", 
 * "you?", "you?", "you?"] after the method finishes executing. 
 * 
 * If k is 0 or negative, the list should be empty after the call.
 */

import java.util.ArrayList;
import java.util.List;

public class BJHP_10_stutter {

	public static void main(String[] args) {
		
		final int NUM = 4;

		List<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you?");
		
		System.out.println(list);
		stutter(list, NUM);
		System.out.println(list);
	}
	
	public static void stutter(List<String> list, int k) {
		
		List<String> result = new ArrayList<String>();
		for(String element : list) {
			for(int i = 0; i < k; i++) {
				result.add(element);
			}
		}
		
		list.clear();
		list.addAll(result);
	}

}
