import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
		
		/*
		 * ArrayList implements Collection
		 * ArrayList is among other collections that implements 
		 * Directly or implicitly the Collection interface
		 * there is 3 generic types of Collections: ordered list ,maps/dictionaries,sets
		 * */
		
		ArrayList<String> names = new ArrayList<String>();
		//add names
		names.add("Chaith");
		names.add("Maria");
		names.add("Habiba");
		//loop throw the collection
		for(String name : names) {
			System.out.println(name);
		}
	}
}
