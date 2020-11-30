import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * Write a method reverse that accepts a Map from integers to strings as a 
 * parameter and returns a new Map of strings to integers that is the 
 * original's "reverse". The reverse of a map is defined here to be a 
 * new map that uses the values from the original as its keys and the 
 * keys from the original as its values. Since a map's values need 
 * not be unique but its keys must be, it is acceptable to have any 
 * of the original keys as the value in the result. In other words, 
 * if the original map has pairs (k1, v) and (k2, v), the new map 
 * must contain either the pair (v, k1) or (v, k2).
 */
public class BJP5_11_reverse {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(42, "Marty");
		map.put(81, "Sue");
		map.put(17, "Ed");
		map.put(31, "Dave");
		map.put(56, "Ed");
		map.put(3, "Marty");
		map.put(29, "Ed");
		
		Map<String, Integer> result = reverse(map);
		System.out.println(result);

	}
	
	public static Map<String, Integer> reverse(Map<Integer, String> map) {
		
		Map<String, Integer> result = new TreeMap<String, Integer>();
		
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
		
			Map.Entry<Integer, String> entry = itr.next();
			result.put(entry.getValue(), entry.getKey());
		}
		
		return result;
	
	}

}
