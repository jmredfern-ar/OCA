/*
 * Write a method intersect that takes two Maps of strings to integers 
 * as parameters and that returns a new map whose contents are the 
 * intersection of the two. The intersection of two maps is defined 
 * here as the set of keys and values that exist in both maps. 
 * So if some key K maps to value V in both the first and second map, 
 * include it in your result. If K does not exist as a key in both maps, 
 * or if K does not map to the same value V in both maps, exclude that pair from your result.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BJP5_11_intersect {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("Janet", 87);
		map1.put("Logan", 62);
		map1.put("Whitaker", 46);
		map1.put("Alyssa", 100);
		map1.put("Stefanie", 80);
		map1.put("Jeff", 88);
		map1.put("Kim", 52);
		map1.put("Sylvia", 95);
		
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("Logan", 62);
		map2.put("Whitaker", 52);
		map2.put("Brian", 60);
		map2.put("Stefanie", 80);
		map2.put("Lisa", 83);
		map2.put("Kim", 52);
		map2.put("Sylvia", 87);

		Map<String, Integer> result = intersect(map1, map2);
		System.out.println(result);
		
	}
	
	public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
		
		Map<String, Integer> result = new TreeMap<String, Integer>();
		
		Set<String> keys = map1.keySet();
		for(String key : keys) {
			
			if(map2.containsKey(key)) {
				if(map1.get(key) == map2.get(key)) {
					result.put(key, map1.get(key));
				}					
			}
		}
		return result;
	}
}
