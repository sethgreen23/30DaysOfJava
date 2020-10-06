import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//use linkeList as stack
		LinkedList<String> names = new LinkedList<String>();
		names.push("Chaith");
		names.push("Habiba");
		names.push("Maria");
		Iterator<String> ei = names.iterator();
		while(ei.hasNext()) {
			System.out.println(names.remove());
		}
		/*
		 * remove take an argument but removeFirst dont take
		 * for remove it take the position that we want to remove it is found of course
		 * */
		
		System.out.println("--------------------");
		//use LinkedList as queue
		LinkedList<String> lastNames = new LinkedList<String>();
		lastNames.add("Dridi");
		lastNames.add("Hosni");
		lastNames.add("Zselinszky");
		Iterator<String> e = lastNames.iterator();
		while(e.hasNext()) {
			System.out.println(lastNames.remove());
		}
	}
}
