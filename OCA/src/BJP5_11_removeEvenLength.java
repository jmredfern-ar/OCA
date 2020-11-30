/*
 * Write a method removeEvenLength that takes a Set of strings as a parameter 
 * and that removes all of the strings of even length from the set. 
 * For example, if your method is passed a set containing the following elements:
 *
 * ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
 * 
 * Your method should modify the set to store the following elements (the order of the
 *  elements does not matter):
 * ["foo", "bar", "spoon", "!"]
 */

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class BJP5_11_removeEvenLength {

	public static void main(String[] args) {

		Set<String> words = new TreeSet<String>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
			
		System.out.println(words);
		removeEvenLength(words);
		System.out.println(words);
	}
	
	public static void removeEvenLength(Set<String> words) {
		
		Set<String> result = new TreeSet<String>();
		
		for(String word : words) {
			if(word.length() % 2 != 0) {
				result.add(word);
			}
		}
		
		words.clear();
		words.addAll(result);
	}
}
