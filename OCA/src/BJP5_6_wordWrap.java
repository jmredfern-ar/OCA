/*
 * Write a method called wordWrap that accepts a Scanner representing 
 * an input file as its parameter and outputs each line of the file to 
 * the console, word-wrapping all lines that are longer than 60 characters. 
 * For example, if a line contains 112 characters, the method should 
 * replace it with two lines: one containing the first 60 characters 
 * and another containing the final 52 characters. 
 * A line containing 217 characters should be wrapped into four lines: 
 * three of length 60 and a final line of length 37.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJP5_6_wordWrap {

	public static void main(String[] args) {

		Scanner input = null;
		
		try {
			input = new Scanner(new File("input_text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		wordWrap(input);

	}
	
	public static void wordWrap(Scanner input) {
		
		StringBuilder sb = new StringBuilder();
		
		while(input.hasNext()) {
			String line = input.nextLine();
			for(int i=0; i<line.length(); i++) {
				sb.append(line.charAt(i));
				if( i != 0 && i % 60 == 0) {
					sb.append("\n");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
