import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 * Write a method hasOdd that takes a Set of integers as a parameter 
 * and that returns true if the set contains at least one odd integer, 
 * and false otherwise. If passed the empty set, your method should return false.
 */

public class BJP5_11_hasOdd {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new TreeSet<Integer>(Arrays.asList(1, 2, 2));
		System.out.println(hasOdd(numbers));

	}
	
	public static boolean hasOdd(Set<Integer> numbers) {
		for(Integer number : numbers) {
			if(number % 2 != 0) {
				return true;
			}
		}
		return false;
	}
}
