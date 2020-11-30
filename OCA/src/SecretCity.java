import java.util.TreeMap;

public class SecretCity {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(99999, "Fayetteville");
		tm.put(88888, "Springdale");
		tm.put(77777, "Rogers");
		tm.put(66666, "Bentonville");
		
		System.out.println(tm.get(55555));
	}

}
