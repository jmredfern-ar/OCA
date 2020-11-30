/*
 * Write a method maxLength that takes a Set of 
 * strings as a parameter and that returns the 
 * length of the longest string in the set. 
 * If your method is passed an empty set, 
 * it should return 0.
 */

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class BJP5_11_maxLength {

	public static void main(String[] args) {

		Set<String> words = new TreeSet<>(Arrays.asList("this", "is", "a", "test"));
		int max = maxLength(words);
		System.out.println(max);
	}
	
	public static int maxLength(Set<String> words) {
		
		if(words.size() == 0) return 0;
		
		int max = 0;
		for(String word : words) {
			if(word.length() > max) {
				max = word.length();
			}
		}
		
		return max;		
	}

}
