/*
https://practiceit.cs.washington.edu/problem/view/bjp5/chapter5/e1-showTwos
Write a method named showTwos that shows the factors of 2 in a given integer. For example, the following calls:

showTwos(7);
showTwos(18);
showTwos(68);
showTwos(120);
should produce this output:

7 = 7
18 = 2 * 9
68 = 2 * 2 * 17
120 = 2 * 2 * 2 * 15
 */


public class BJHP5_5_showTwos {

	public static void main(String[] args) {
		showTwos(68);
	}
	
	public static void showTwos(int num) {
	
		StringBuffer output = new StringBuffer(num + " = ");
		
		while(num % 2 == 0) {
			num = num / 2; 
			output.append("2 * ");
		} 
		
		output.append(num);
		
		System.out.println(output);
		
	}

}
