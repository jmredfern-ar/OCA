/*
 * Write a complete program called "TheNameGame", where the user inputs a first and last name 
 * and a song in the following format is printed about their first, then last, name. 
 * Use a method to avoid redundancy.
 *
 * What is your name? Fifty Cent
 * 
 * Fifty Fifty, bo-Bifty
 * Banana-fana fo-Fifty
 * Fee-fi-mo-Mifty
 * FIFTY! 
 *
 * Cent Cent, bo-Bent
 * Banana-fana fo-Fent
 * Fee-fi-mo-Ment
 * CENT!
 */

import java.util.Scanner;

public class BJP5_3_NameGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fname, lname, cr;
		StringBuilder result = new StringBuilder();
		
		System.out.print("What's your name? ");
		String[] fullName = sc.nextLine().split(" ");
		
		fname = fullName[0];
		lname = fullName[1];
		cr = "\n";
		
		//Fifty Fifty, bo-Bifty
		result.append(fname + " " + fname + ", bo-B" + fname.substring(1) + cr);
		
		//Banana-fana fo-Fifty
		result.append("Banana-fana fo-F" + fname.substring(1) + cr);
		
		//Fee-fi-mo-Mifty
		result.append("Fee-fi-mo-M" + fname.substring(1) + cr);
		result.append("FIFTY!" + cr);
	
		System.out.println(result);
	}
}
