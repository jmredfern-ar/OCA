import java.util.ArrayList;

public class Static {

	private String name = "Static class";
	public ArrayList<String> words = new ArrayList<>();
	
	public void third() {System.out.println(name);}
	

	
	public static void main(String[] args) {
		
		//third(); // Doesn't compile - static reference to non-static method

		new Static().third();
	}
}
