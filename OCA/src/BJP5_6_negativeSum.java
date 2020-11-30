
/*
 * Write a method named negativeSum that accepts a Scanner as a 
 * parameter reading input from a file containing a series of integers, 
 * and determine whether the sum starting from the first number is ever negative. 
 * The method should print a message indicating whether a negative sum is 
 * possible and should return true if a negative sum can be reached and false if not.
 * 
 * 0  1  2  3   4   5 6 7  8
 * 38 4 19 -27 -15 -3 4 19 38
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BJP5_6_negativeSum {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(new File("numbers.txt"));
			System.out.println(negativeSum(sc));
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		}
	}
	
	public static boolean negativeSum(Scanner sc) {
		
		int sum = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while(sc.hasNext()) {
			
			String[] strings = sc.nextLine().split(" ");
			
			for(String string : strings)
				numbers.add(Integer.parseInt(string));
			
			for(int i=0; i<numbers.size(); i++) {
				sum = 0;
				for(int j=0; j<=i; j++) {
					sum += numbers.get(j);
					if(sum < 0) {
						System.out.println(sum + " after " + (j + 1) + " steps");
						return true;
					}
				}
			}		
		}
		
		System.out.println("no negative sum");
		return false;
	}
}
