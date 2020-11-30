import java.util.Map;
import java.util.TreeMap;

public class BJP5_11_mapMystery3 {

	public static void main(String[] args) {

	}
	
	public static Map<String, String> mystery(Map<String, Integer> map1, Map<Integer, String> map2) {
		Map<String, String> result = new TreeMap<String, String>();
		for(String s1 : map1.keySet()) {
			if(map2.containsKey(map1.get(s1))) {
				result.put(s1, map2.get(map1.get(s1)));
			}
		}
		return result;
	}

}
