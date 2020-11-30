import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Write a method named boyGirl that accepts a Scanner as a parameter. 
 * The Scanner is reading its input from a file containing a series of 
 * names followed by integers. The names alternate between boys' names 
 * and girls' names. Your method should compute the absolute difference 
 * between the sum of the boys' integers and the sum of the girls' integers. 
 * The input could end with either a boy or girl; you may not assume that 
 * it contains an even number of names.
 * 
 * "Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6"
 */
public class BJP5_6_boyGirl {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("names.txt"));
			boyGirl(sc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void boyGirl(Scanner sc) {
		
		String line = null;
		String[] strings = null;
		int boyCount = 0, boySum = 0;
		int girlCount = 0, girlSum = 0;
		boolean isBoy = true;
		
		while(sc.hasNext()) {
			
			line = sc.nextLine();
			strings = line.split(" ");
			
			for(int i=0; i<strings.length; i = i + 2) {
				
				if(isBoy) {
					
					boySum += Integer.parseInt(strings[i + 1]);
					boyCount++;
					isBoy = false;
				
				} else { //isGirl

					girlSum += Integer.parseInt(strings[i + 1]);
					girlCount++;
					isBoy = true;
						
				} 
			} // END for loop
		} // END while loop
		
		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
		
	} // END boyGirl()
}
