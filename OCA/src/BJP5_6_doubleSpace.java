/*
 * Write a method named doubleSpace that accepts a Scanner 
 * for an input file and a PrintStream for an output file 
 * as its parameters, writing into the output file a 
 * double-spaced version of the text in the input file. 
 * You can achieve this task by inserting a blank line between each line of output.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class BJP5_6_doubleSpace {

	public static void main(String[] args) throws IOException {

		Scanner input = null;
		FileOutputStream fout= null;
		PrintStream output = null; 
		
		input = new Scanner(new File("input_text.txt"));
		fout = new FileOutputStream("output_text.txt");
		output = new PrintStream(fout);
		
		doubleSpace(input, output);
		fout.close();

	}
	
	public static void doubleSpace(Scanner input, PrintStream output) throws IOException {
				
		while(input.hasNext()) {
			String line = input.nextLine();
			output.println(line);
			output.println();
		}
		
		output.flush();
		output.close();
	}
}
