import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJP5_6_flipLines2 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("lines.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		flipLines(sc);
	}
	
	public static void flipLines(Scanner sc) {
		
		StringBuilder result = new StringBuilder();
		String line1 = null, line2 = null;
		
		while(sc.hasNext()) {
			
			line1 = sc.nextLine();
			if(sc.hasNext()) {
				line2 = sc.nextLine();
				result.append(line2 + "\n" + line1 + "\n");
			} else {
				result.append(line1 + "\n");
			}
		}
		System.out.println(result);
	}

}
