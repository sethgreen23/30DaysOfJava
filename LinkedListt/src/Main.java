import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//use linkeList as stack
		LinkedList<String> names = new LinkedList<String>();
		names.add("Chaith");
		names.add("Habiba");
		names.add("Maria");
		Iterator<String> ei = names.iterator();
		while(ei.hasNext()) {
			System.out.println(names.removeLast());
		}
		
		System.out.println("--------------------");
		//use LinkedList as queue
		LinkedList<String> lastNames = new LinkedList<String>();
		lastNames.add("Dridi");
		lastNames.add("Hosni");
		lastNames.add("Zselinszky");
		Iterator<String> e = lastNames.iterator();
		while(e.hasNext()) {
			System.out.println(lastNames.removeFirst());
		}
	}
}
