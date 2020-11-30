import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Write a method rarest that accepts a map whose keys are strings 
 * and whose values are integers as a parameter and returns the 
 * integer value that occurs the fewest times in the map. 
 * If there is a tie, return the smaller integer value. 
 * If the map is empty, throw an exception.
 */
public class BJP5_11_rarest {

	public static void main(String[] args) {
		
		//{Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22}

	}
	
	public static int rarest(Map<String, Integer> map) {
		
		if(map.isEmpty()) throw new NullPointerException("Map is Empty");
		
		Map<Integer, Integer> counts = new TreeMap<Integer, Integer>();
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry<String, Integer> entry = itr.next();
			int cKey = entry.getValue();
			if(counts.containsKey(cKey)) {
				int cValue = counts.get(cKey);
				counts.put(cKey, ++cValue);
			} else {
				counts.put(cKey, 1);
			}
		}
		
		
		return 0;
		
	}

}
