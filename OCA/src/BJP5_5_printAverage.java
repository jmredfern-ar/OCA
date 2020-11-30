/*
 * Write a method named printAverage that accepts a Scanner for the console 
 * as a parameter and repeatedly prompts the user for numbers. Once any number 
 * less than zero is typed, the average of all non-negative numbers typed is displayed. 
 * Display the average as a double, and do not round it.
 */

import java.util.Scanner;

public class BJP5_5_printAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		printAverage(sc);

	}

	public static void printAverage(Scanner sc) {
		
		int sum = 0, nums = 0;
		double average = 0.0;
		boolean running = true;
		while(running) {
			
			System.out.print("Type a number: ");
			int result = sc.nextInt();
			if(result >= 0) {
				sum += result;
				nums++;
				
			} else {
				running = false;
			}
		}

		average = (double) sum / nums;
		System.out.println(average);
	}
}
