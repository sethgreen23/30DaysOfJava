import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		//use linkeList as stack
		LinkedList<String> names = new LinkedList<String>();
		names.push("Chaith");
		names.push("Habiba");
		names.push("Maria");
		//use iterator to go throw the elements of the collection
		Iterator<String> ei = names.iterator();
		while(ei.hasNext()) {
			//this remove the current element and return it
			//System.out.println(names.next());
			System.out.println(ei.next());
		}
		/*
		 * remove take an argument but removeFirst dont take
		 * for remove it take the position that we want to remove it is found of course
		 * */
		
		System.out.println("--------------------");
		
		//use foreach to go throw the elements of the collection
		for(String s : names) {
			System.out.println(s);
		}
		
		System.out.println("--------------------");
		
		//use LinkedList as queue
		LinkedList<String> lastNames = new LinkedList<String>();
		lastNames.add("Dridi");
		lastNames.add("Hosni");
		lastNames.add("Zselinszky");
		//use iterator to go throw the elements of the collection
		Iterator<String> e = lastNames.iterator();
		while(e.hasNext()) {
			//this remove the current element and return it
			//System.out.println(names.next());
			System.out.println(e.next());
		}
		
		System.out.println("--------------------");
		
		//use foreach to go throw the elements of the collection
		for(String ss : lastNames) {
			System.out.println(ss);
		}
		
		System.out.println("--------------------");
		
		//use of listIterator
		LinkedList<String> jobs = new LinkedList<String>();
		jobs.push("Teacher");
		jobs.push("Engineer");
		jobs.push("Pilote");
		jobs.add(2,"Blacksmith");
		ListIterator<String> ls = jobs.listIterator();
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
	}
}
