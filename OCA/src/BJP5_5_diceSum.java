/*
https://practiceit.cs.washington.edu/problem/view/bjp5/chapter5/e7-diceSum

Write a method named diceSum that prompts the user for a desired sum, 
then repeatedly rolls two six-sided dice until their sum is the desired sum. 
Here is the expected dialogue with the user:

Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
 */
import java.util.Scanner;
import java.util.Random;

public class BJP5_5_diceSum {

	public static void main(String[] args) {
		
		diceSum();

	}
	
	public static void diceSum() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Desired dice sum: ");
		int result = sc.nextInt();
		
		Random rnd = new Random(); //random.nextInt(max - min + 1) + min
		int sum = 0;
		int min = 1, max = 6;
		int die1 = 0, die2 = 0;
		
		while(sum != result) {
			
			die1 = rnd.nextInt(max - min + 1) + min;
			die2 = rnd.nextInt(max - min + 1) + min;
			sum = die1 + die2;
			
			System.out.println(die1 + " and " + die2 + " = " + sum);
		}
	}

}
