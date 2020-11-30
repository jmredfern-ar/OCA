import java.util.ArrayList;
import java.util.Scanner;

public class ChickenWrap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		loadArrayList(sc, values);
		System.out.print(findLargest(values));
	
	}
	
	public static void loadArrayList(Scanner sc, ArrayList<Integer> values) {
		
		Integer value = new Integer(0);
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter Value #" + i + " >>");
			value = sc.nextInt();
			values.add(value);
		}
	}
	
	public static Integer findLargest(ArrayList<Integer> values) {
		
		Integer largest = Integer.MIN_VALUE;
		
		for(Integer value : values) {
			if(value > largest) {
				largest = value;
			}
		}
		return largest;
	}
}
