/*
 * Write a method named flipLines that accepts as its parameter a Scanner 
 * for an input file and that writes to the console the same file's 
 * contents with successive pairs of lines reversed in order.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJP5_6_flipLines {

	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("lines.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		flipLines(sc);
	}
	
	public static void flipLines(Scanner sc) {
		
		List<String> lines = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		
		while(sc.hasNext()) {
			lines.add(sc.nextLine());
		}
		
		for(int i=1; i<lines.size(); i = i + 2) {
			result.add(lines.get(i));
			result.add(lines.get(i-1));
		}
		
		//picks up odd last line
		if(lines.size() % 2 != 0) {
			result.add(lines.get(lines.size()-1));
		}
		
		StringBuilder sb = new StringBuilder();
		for(String line : result) {
			sb.append(line + "\n");
		}
		
		System.out.println(sb);
	}
}


