import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BJP5_11_mapMystery2 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("lab", "ipl");
		map.put("lion", "cat");
		map.put("terrier",  "dog");
		map.put("cat",  "cat");
		map.put("platypus", "animal");
		map.put("nyan", "cat");
		
		//map sorts alphabetically by key value
		System.out.println(map);
		mapMystery2(map);
	}

	public static void mapMystery2(Map<String, String> m) {
		Set<String> s = new TreeSet<String>();
		for(String key : m.keySet())
			System.out.println(key);
		
		for(String key : m.keySet()) {
			//If value.equals(key), add value else remove value
			if(!m.get(key).equals(key)) {
				System.out.println("Adding: " + m.get(key));
				s.add(m.get(key));
			} else {
				System.out.println("Removing: " + m.get(key));
				s.remove(m.get(key));
			}
		}
		System.out.println(s);
	}
}
