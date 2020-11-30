/*
 *  Write a method named countCoins that accepts as its parameter 
 *  a Scanner for an input file whose data represents a person's 
 *  money grouped into stacks of coins. Your method should add 
 *  up the cash values of all the coins and print the total money 
 *  at the end. 
 *  
 *  3 pennies 2 quarters 1 pennies 3 nickels 4 dimes
 *  
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class BJP5_6_countCoins {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(new File("coins.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
						
		countCoins(sc);
	}
	
	public static void countCoins(Scanner sc) {
		
		Map<String, Integer> coins = new TreeMap<String, Integer>();
		
		String line = sc.nextLine().toLowerCase();
		line = line.replace("\\n", " ");
		line = line.replace("\\t", " ");
		line = line.replaceAll("\\s+", " ");
		line = line.trim();
		String[] strings = line.split(" ");
			
		// 0    1    2    3     4   5     6   7     8  9    10
		// 3 pennies 2 quarters 1 pennies 3 nickels 4 dimes
		for(int i=1; i<strings.length; i = i + 2) {
			int amount = 0;
			if(!coins.containsKey(strings[i])) {
				coins.put(strings[i], Integer.parseInt(strings[i-1]));
			} else {
				amount = coins.get(strings[i]) + Integer.parseInt(strings[i-1]);
				coins.put(strings[i], amount);
			}
		}			
				
		// dimes: 4, nickels : 3, pennies : 4, quarters : 2
		Set<String> keys = coins.keySet();
		double total = 0.0;
		for(String key : keys) {
			switch(key) {
			case "pennies":
				total += coins.get(key);
				break;
			case "nickels":
				total += coins.get(key) * 5;
				break;
			case "dimes":
				total += coins.get(key) * 10;
				break;
			case "quarters":
				total += coins.get(key) * 25;
				break;
			}
		}
		
		NumberFormat nmbr = NumberFormat.getCurrencyInstance(); 
 		System.out.printf("Total money: " + nmbr.format(total / 100));
	}
}
