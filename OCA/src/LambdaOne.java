interface Plant {
	public abstract void grow();
	
}

interface Bush {
	public abstract int grow(int num);
}

class Shrub {
	
	private String size;
	
	
	
	public Shrub() {
		System.out.println("no args Shrub constructor...");
	}
	
	public Shrub(String size) {
		this();
		this.setSize(size);
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
}

class Tree {
	
	final static String TYPE_OF_TREE = "Oak";
	
	public void grow() {
		System.out.println("growing a tree...");
	}
}
public class LambdaOne {

	public static void main(String[] args) {

		Plant plant = () -> {System.out.println("growing proof... ");
							 System.out.println("... and more proof.");
							};
		
		plant.grow();
		
		Shrub shrub = new Shrub("" + 10);
		
		/*
		Plant plant() {
			return new Plant() {
				@Override
				public void grow() {
					System.out.println("trying this...");
				}
			};
		}*/
		
		
		
		//Ctrl + 1 (Quick Fix) to convert from anonymous inner class to lambda expression		
		Bush bush = (num) -> 2 + num;
		
		int n = 10;
		System.out.println("" + bush.grow(n));
		
		//anonymous inner class
		Tree tree = new Tree() {
			{
				//Instance initializer
				System.out.println(TYPE_OF_TREE);
			}
			
			@Override
			public void grow() {
				System.out.println("growing a TREE...");
			}			
		};
		
		tree.grow();

	}
}