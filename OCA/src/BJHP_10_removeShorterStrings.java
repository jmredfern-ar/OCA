/*
 * Write a method removeShorterStrings that takes an ArrayList of Strings as a 
 * parameter and that removes from each successive pair of values the shorter string 
 * in the pair. For example, suppose that an ArrayList called list contains the 
 *                       0       1       2       3       4        5
 * following values: {"four", "score", "and", "seven", "years", "ago"} 
 * In the first pair, "four" and "score", the shorter string is "four". 
 * In the second pair, "and" and "seven", the shorter string is "and". 
 * In the third pair, "years" and "ago", the shorter string is "ago". 
 * Therefore, the call: removeShorterStrings(list); should remove these shorter strings, 
 * leaving the list as follows: "score", "seven", "years". If there is a tie 
 * (both strings have the same length), your method should remove the first string in the pair.
 * If there is an odd number of strings in the list, the final value should be kept in the list.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJHP_10_removeShorterStrings {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("four");
		list.add("score");
		list.add("and");
		list.add("seven");
		list.add("years");
		list.add("ago");
		list.add("test");

		System.out.println(list);
		removeShorterStrings(list);
		System.out.println(list);

		
	}

	public static void removeShorterStrings(List<String> list) {
		
		List<String> result = new ArrayList<String>();
		String s1="", s2="";
		int length = list.size();
		boolean hasOdd = length % 2 != 0; 
		
		for(int i=0; i<length-1; i = i + 2) {
			s1 = list.get(i);
			s2 = list.get(i+1);
			if(s1.length() > s2.length()) {
				result.add(s1);
			} else if(s1.length() == s2.length()) {
				result.add(s1);
			}else {			
				result.add(s2);
			}
		}
		if(hasOdd) {
			result.add(list.get(length-1));
		}
		
		list.clear();
		list.addAll(result);
	}
}
