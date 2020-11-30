/*
 * Write a method called stripComments that accepts a Scanner 
 * representing an input file containing a Java program as its parameter, 
 * reads that file, and then prints the file's text with all comments 
 * removed. A comment is any text on a line from // to the end of 
 * the line.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJP5_6_stripComments {
	
	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(new File("comments.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		stripComments(input);

	}
	
	public static void stripComments(Scanner input) {
			
		while(input.hasNextLine()) {
			
			String line = input.nextLine();
			
			if(line.contains("/*") || line.contains("*/")) {
				line = processMultiLineComment(line);
			}
			if(line.contains("//")) {
				line = processSingleLineComment(line);
				
			}
			System.out.println(line); //carriage return at end of each line
		}
	}

	private static String processSingleLineComment(String line) {
		return line.substring(0, line.indexOf("//"));
	}

	private static String processMultiLineComment(String line) {
		
		boolean hasStart = line.contains("/*");
		boolean hasEnd = line.contains("*/");
		
		if(hasStart & hasEnd) { //line contains or is entirely a multi-line comment
		
			int start = line.indexOf("/*");
			int end = line.indexOf("*/");
			
			return line.substring(0, start) + line.substring(end+2);
		
		} else if(hasStart){ //line contains /* but no terminating */ therefore it is all comment
			return ""; 
		} else if(hasEnd) { //line contains */ but no starting /* therefore it is all comment
			return "";
		} else {
			return ""; //this should never be reached
		}
	}
}
