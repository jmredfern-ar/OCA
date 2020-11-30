/*
 * Write a method called stripHtmlTags that accepts a Scanner 
 * representing an input file containing an HTML web page as 
 * its parameter, then reads that file and prints the file's 
 * text with all HTML tags removed. A tag is any text between 
 * the characters < and > . 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJP5_6_stripHtmlTags {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = null;
		input = new Scanner(new File("webpage.html"));
		stripHtmlTags(input);
	}
	
	public static void stripHtmlTags(Scanner input) {
		
		StringBuilder sb = new StringBuilder();
		while(input.hasNext()) {
			
			String line = input.nextLine();
			int i = 0;
			while(i < line.length()) {
				if(line.charAt(i) == '<') {
					while(line.charAt(i) != '>') {
						i++;
					}
					i++;
				} else {
					sb.append(line.charAt(i++));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
