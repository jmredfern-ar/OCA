/*
 * Write a method named printDuplicates that accepts as its parameter a 
 * Scanner for an input file containing a series of lines. Your method 
 * should examine each line looking for consecutive occurrences of the 
 * same token on the same line and print each duplicated token along 
 * how many times it appears consecutively. Non-repeated tokens are 
 * not printed. Repetition across multiple lines (such as if a line 
 * ends with a given token and the next line starts with the same token) 
 * is not considered in this problem.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class BJP5_6_printDuplicates {

	public static void main(String[] args) {
		
		Scanner input = null;
		try {
			input = new Scanner(new File("duplicates.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		printDuplicates(input);
	}
	
	public static void printDuplicates(Scanner input) {
		
		//hello how how are you you you you
		while(input.hasNext()) {
			
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			int count = 0;
			
			String line = input.nextLine();
			String[] strings = line.trim().replaceAll(" +", " ").split(" ");
			
			for(String string : strings) {
				if(!map.containsKey(string)) {
					map.put(string, 1);
				} else {
					count = map.get(string);
					map.put(string, ++count);
				}
			}
			
			Set<String> set = map.keySet();
			for(String string : set) {
				if(map.get(string) > 1)
					System.out.print(string + "*" + map.get(string) + " ");
			}
			System.out.println();
		}
		
	}
}
