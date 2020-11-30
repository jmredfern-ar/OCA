/*
 * Write a method isUnique that accepts a Map from strings to strings as a parameter and 
 * returns true if no two keys map to the same value (and false if any two or more keys 
 * do map to the same value). For example, calling your method on the following map would return true:
 *
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 * 
 * Calling it on the following map would return false, because of two mappings for Perkins and Reges:
 *
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 * The empty map is considered to be unique, so your method should return true if passed an empty map.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BJP5_11_isUnique {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<String, String>();
		map.put("Kendrick", "Perkins");
		map.put("Stuart", "Reges");
		map.put("Jessica", "Miller");
		map.put("Bruce", "Reges");
		map.put("Hal",  "Perkins");
	
		System.out.println(isUnique(map));
	}
	
	public static boolean isUnique(Map<String, String> map) {
		
		if(map.isEmpty()) return true;
		
		Set<String> set = new TreeSet<String>(map.values());
		
		if(map.size() != set.size()) 
			return false; 
		else
			return true;
	}

}
