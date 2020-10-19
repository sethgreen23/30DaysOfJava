//https://stackoverflow.com/questions/933447/how-do-you-cast-a-list-of-supertypes-to-a-list-of-subtypes
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 *Saying any ArrayList with type that extends Person is acceptable exemple 
		 *of whildCards after that we dont need to cast element of ArrayList with type admins in 
		 *an ArrayList of type Person to make the function accepting a Person ArrayList works
		 *Case 1
		 *
		 */
		ArrayList<Admin> admins = new ArrayList<>();
		Admin a = new Admin("Dridi","Chaith");
		Admin a1 = new Admin("Boukarma","Nawfel");
		admins.add(a);
		admins.add(a1);
		doSomething(admins);
		System.out.println("-".repeat(49));
		/*
		 * the example of casting a list to different type by casting each element and
		 * add them to a new list of the parent type is ideal if the method you are working with 
		 * is not something you are able to change (maybe youare working with somebody else code
		 * or code thats already done and you cant go back) in this case you dont deen to do it element
		 * by element because casting is changing the way you are treating variables
		 * you do it like :
		 * Case 2 
		 *
		 */
		ArrayList<Admin> admins1 = new ArrayList<Admin>();
		admins1.add(a);
		admins1.add(a1);
		//you can use ArrayList other then list but you need to change it in parameter of doSomething1() too
		List<Person> people = (ArrayList<Person>)(ArrayList<?>)admins;
		doSomething1(people);
	}
	/*
	 * with this function we are using wildcards "?" to accept 
	 * any derived class from Person
	 * Case 1
	 *
	 */
	public static void doSomething(ArrayList<? extends Person> persons) {
		for(Person p : persons) {
			p.getFullName();
		}
	}
	//thisFunction work with normal person list Case 2
	public static void doSomething1(List<Person> persons) {
		for(Person p : persons) {
			p.getFullName();
		}
	}

}
