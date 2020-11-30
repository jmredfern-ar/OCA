import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{

	private String title;
	private String type;
	private int rating;
	
	public Movie(String title, String type, int rating) {
		super();
		this.title = title;
		this.type = type;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", type=" + type + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie arg0) {
		System.out.println("Comparing " + this.getTitle() + " and " + arg0.getTitle());
		System.out.println(this.getRating() - arg0.getRating());
		return this.getRating() - arg0.getRating();
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Terminator", "Documentary", 10));
		movies.add(new Movie("Frozen", "Horror Comedy", 9));
		movies.add(new Movie("Star Wars: The Phantom Menace", "Rom Com", 1));
		movies.add(new Movie("The Santa Clause", "Thriller", 4));
		
		Collections.sort(movies);
		for(Movie movie : movies)
			System.out.println(movie);
	}
}
