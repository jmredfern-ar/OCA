import java.util.Scanner;

public class QFC_QuizBowl {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final int NUM_QUESTIONS = 5;
		final int NUM_ANSWERS = 4;
		int score = 0;
		String answer = null;
		
		String[] questions = new String[NUM_QUESTIONS];
		questions[0] = "What is the greatest movie of all time?";
		
		String[] answers_1 = new String[NUM_ANSWERS];
		answers_1[0] = "a. Flash Gordan (1980)";
		answers_1[1] = "b. Star Wars: The Empire Strikes Back";
		answers_1[2] = "c. Big Trouble in Little China";
		answers_1[3] = "d. Alien";
		
		System.out.println("**** QUIZ BOWL *****");
		System.out.println("Enter the letter of your choice.");
		System.out.println(questions[0]);
		for(String s : answers_1) {
			System.out.println(s);
		}
		
		System.out.print(">> ");
		answer = input.nextLine().toLowerCase();

		if(answer.equals("a")) { //answer == "a" didn't work for me
			score++;
			System.out.println("Correct!");
		} else {
			System.out.println("The correct answer is: " + answers_1[0]);
		}
		
		System.out.println("FINAL SCORE: " + score);
		if(score == 0) {
			System.out.println("Try harder next time!");
		} else if(score == 1) {
			System.out.println("Decent...");
		} else {
			System.out.println("Let's get this bread!");
		}
		
		System.out.println();
		
		input.close();
	}

}
