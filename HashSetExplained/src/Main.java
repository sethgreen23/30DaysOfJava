import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		//create persons
		Position p = new Position(10,10);
		Person per = new Person("dridi.chaith@gmail.com","Chaith",p);
		Position p1 = new Position(100,1);
		Person per1 = new Person("maria.dridi@gmail.com","Maria",p1);
		Position p2 = new Position(200,10);
		Person per2 = new Person("dridi.kabil@gmail.com","Kabil",p);
		Position p3 = new Position(300,500);
		Person per3 = new Person("habiba.hosni@gmail.com","Habiba",p1);
		//use hachSet
		HashSet<Person> humans = new HashSet<Person>();
		humans.add(per);
		humans.add(per1);
		humans.add(per2);
		humans.add(per3);
		//go throw the objects
		//here the data comes not ordered
		for(Person h : humans) {
			System.out.println(h.ln);
		}
		System.out.println("-".repeat(49));
		Position newP = new Position(10,10);
		Person newPer = new Person("dridi.chaith@gmail.com","Chaith",newP);
		/*
		 * even though we don't have the same object 
		 * but when we use the contains function 
		 * we got that HashSet contains that object
		 * here the comparison is made on the fields 
		 * of the two object and here they have the same
		 * elements then the contains function returned true 
		 * 
		 */
		System.out.println(humans.contains(newPer));
		System.out.println("-".repeat(49));
		/*
		 * -the words are not in order because the HashSet use the hashCode() method
		 * on the String to determine where to insert it into the set 
		 * -if you need the words ordered by order of insertion you can use another data structure
		 * like the treeSet or arraylist (you need to be  with arraylist it accept duplicate data i dont know what happens with treeSet)
		 * -System.out.println(words.contains("hello") --> the search is very fast because it take the hello
		 * String and use the hash function on it and return the place where it is stored
		 * */
		System.out.println("-".repeat(49));
		/*
		 *HashMaps accept duplicated data but not duplicated keys
		 * 
		 * 
		 */
		HashSet<String> words = new HashSet<String>();
		/*
		 * hashSets doesn't add duplicate data 
		 * Example : you do words.("hello"); x2 (twice) it just add hello once onto the HashSet
		 * 
		 * */
		words.add("hello");
		words.add("bye");
		words.add("curry");
		words.add("jhon");
		words.add("alice");
		words.add("patric");
		words.add("christopher");
		words.add("mia");
		words.add("susy");
		words.add("frank");
		for(String word : words) {
			System.out.println(word);
		}
		System.out.println("-".repeat(49));
		//create HashMap and add the persons
		HashMap<String,Person> persons = new HashMap<String,Person>();
		persons.put("dridi.chaith@gmail.com",per); persons.put("dridi.maria@gmail.com",per1);
		System.out.println(persons.containsKey("dridi.chaith@gmail.com"));

	}

}
