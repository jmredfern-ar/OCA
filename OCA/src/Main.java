import java.util.Map;
import java.util.TreeMap;

class Main {
  public static void main(String[] args) {
   	Map<String, String> treeMap = new TreeMap<String, String>();
	treeMap.put("siskel", "ebert");
	treeMap.put("girl", "boy");
	treeMap.put("heads", "tails");
	treeMap.put("ready", "begin");
	treeMap.put("first", "last");
	treeMap.put("begin", "end");
	
	mapMystery1(treeMap);
  }

  public static void mapMystery1(Map<String, String> map) {
	  Map<String, String> result = new TreeMap<String, String>();
	  System.out.println(map);
	  for(String key : map.keySet()) {
		  System.out.println("map.ketSet() order: " + key);
		  
		  if(key.compareTo(map.get(key)) < 0) {
			  result.put(key, map.get(key));
			  System.out.println("Putting: " + key + " : " + map.get(key));
		  } else {
			  result.put(map.get(key), key);
			  System.out.println("Putting: " + map.get(key) + " : " + key);
		  }
	  }
	  System.out.println(result);
  }
}