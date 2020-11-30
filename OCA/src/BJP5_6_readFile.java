import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BJP5_6_readFile {

	public static void main(String[] args) {

		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("coins.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// a = a. replaceAll("\\s","");
		
		String line = sc.nextLine().toLowerCase();
		//line = line.replace("\n", "").replace("\t", "").replaceAll("\\s", " ");
		line = line.replace("\\n", " ");
		line = line.replace("\\t", " ");
		line = line.replaceAll("\\s+", " ");
		line = line.trim();
		System.out.println(line);
		
		String[] strings = line.split(" ");
			
		System.out.println(Arrays.toString(strings));

	}

}
