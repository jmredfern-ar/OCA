/*
 * Write a method contains3 that accepts a List of strings as a parameter and 
 * returns true if any single string occurs at least 3 times in the list, 
 * and false otherwise. Use a map as auxiliary storage.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BJP5_11_contains3 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>(Arrays.asList("this", "is", "this", "a", "this", "test"));
		
		System.out.println(words);
		System.out.println(contains3(words));
	}
	
	public static boolean contains3(List<String> words) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(String word : words) {
			
			if(!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				int count = map.get(word);
				count++;
				map.replace(word, count);
				if(count >= 3) return true;
			}
		}
				
		return false;
	}
}
