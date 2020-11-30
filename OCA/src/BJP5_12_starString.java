/*
 * Write a method starString that accepts an integer parameter n and 
 * returns a string of stars (asterisks) 2n long (i.e., 2 to the nth power).
 * You should throw an IllegalArgumentException if passed a value less than 0.
 */
public class BJP5_12_starString {

	public static void main(String[] args) {
		
		System.out.println(starString(2));

	}

	public static String starString(int n) {
		
		if(n < 0) 
			throw new IllegalArgumentException();
		
		if(n == 0) 
			return "*";
		else
			return starString(n-1) + starString(n-1);
	}
}
