import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		/*
		 * -HashMap:
		 * Keys -> run on ->> Hash Function -> gives us ->> position to store the data
		 * if it happens and we have the same hash for two values 
		 * then on that location we will have a linked list of values
		 * one after the other see wikipedia "Collection Frameworks"
		 * 
		 * -every single object have a hash code 
		 * exemple : String s = "Hello"; 
		 * s.hasCode() ->> 457841 (as exemple)
		 * the Hash Function take a big number and a raisonnable operation to make it on 
		 * a raisonnable range to meet the computer capabilities of string data
		 * */
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//enter values
		map.put("Chaith Dridi", 250);
		map.put("Maria Dridi", 1);
		// go throw the HashMap
		
		//using the keyset() -> all the keys
		System.out.println("Getting just the Keys:");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println("-".repeat(25));
		//using values() -> all the values
		System.out.println("Getting just the Values:");
		Collection<Integer> values = map.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		System.out.println("-".repeat(25));
		//using entry set
		System.out.println("Getting Keys and Values:");
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String,Integer> entry : entrys) {
			System.out.println(entry.getKey()+" have an id of "+entry.getValue());
		}
		System.out.println("-".repeat(25));
		//using entry set
		System.out.println("GetOrDefault function:");
		//getOrDefault function return the value of the key if exist or default if not
		System.out.println("Kabil doesnt exist then we put the value \""+map.getOrDefault("Kabil", 100)+"\" as Default.");
	}

}
