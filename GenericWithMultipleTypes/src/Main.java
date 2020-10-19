import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *-associate two pieces of data similar to how hashmaps works we dont 
		 *have the hole collection,we dont have the hashing going on. it is a 
		 *little but simpler then hashmap Pair<Intger,String>,Pair<Person,Person>
		 *-one it is one item not collection and two it is not like <key,value> neither of these is designated like key 
		 */
		//we can opt to not mention the type in the second part of declaration
		//because we mentioned it in the first part
		//here we put the Pair as collection using ArrayList
		ArrayList<Pair<Integer,String>> pairs = new ArrayList<>();
		Pair<Integer,String> pair = new Pair<>();
		pair.setX(13);
		pair.setY("My Lucky Number:");
		Pair<Integer,String> pair1 = new Pair<>();
		pair1.setX(1986);
		pair1.setY("My year of birth:");
		pairs.add(pair); pairs.add(pair1);
		for(Pair<Integer,String> pa : pairs) {
			System.out.println(pa.getY()+" "+pa.getX());
		}
		System.out.println("-".repeat(49));
		ArrayList<Pair<Person,Person>> persons = new ArrayList<>();
		Pair<Person,Person> person = new Pair<>();
		person.setX(new Person("Dridi","Chaith"));
		person.setY(new Person("Dridi","Maria"));
		Pair<Person,Person> person1 = new Pair<>();
		person1.setX(new Person("Saada","Mohamed"));
		person1.setY(new Person("Hosni","Naima"));
		persons.add(person);persons.add(person1);
		for(Pair<Person,Person> per : persons) {
			System.out.println(per.getX().getFullName()+" is maried to "+per.getY().getFullName());
		}
		System.out.println("-".repeat(49));
		/*
		 *Although there is inheritance from Person to Admin but there is not concept of inheritance from 
		 *list of People to a list of Admins.if you try polymorphism that take a list of Parent Class 
		 *you are not able to pass a list that its typed to derived class alternatively you need to convert 
		 *that list to the appropriate type 
		 */
		ArrayList<Admin> admins = new ArrayList<>();
		Admin admin = new Admin("Boukarma","Nawfel");
		Admin admin1 = new Admin("Nolan","Chirstopher");
		admins.add(admin);admins.add(admin1);
		ArrayList<Person> peoples = new ArrayList<Person>();
		for(Admin a : admins)
			peoples.add((Person)a);
		doSomething(peoples);
		
		/*
		 * we cant do this:
		 *	 ArrayList<Admins> admins = new ArraList<Admins>();
		 * 	 Admin admin = new Admin("Boukarma","Nawfel");
		 *	 Admin admin1 = new Admin("Nolan","Chirstopher");
		 * 	 admins.add(admin);admins.add(admin1);
		 * 	 doSomething(admins)
		 * --> this we cant do it
		 */
	}
	
	public static void doSomething(ArrayList<Person> persons) {
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}
