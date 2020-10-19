
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generic allow us to have compilation errors with type issues where without generic it is 
		 * runtime issues which will be more issues where we run the code . generic add values
		 * Example : ArrayList messages = new ArrayList();
		 * 			message.add(3);
		 * 			message.add("Hello");
		 * 			System.out.println((String)message.get(0));
		 * --> here we are expecting a string but when we run the code we get a run time error because
		 * the element stored there is an Integer not a string and thats where we where talking about above
		 * 
		 */
		
		//using generic with String
		Item<String> message = new Item<String>();
		message.setX("Hello");
		System.out.println(message.getX());
		System.out.println("-".repeat(49));
		//using generic with custom class
		Person p = new Person("Dridi","Chaith");
		Item<Person> person = new Item<Person>();
		person.setX(p);
		Person p1 = person.getX();
		System.out.println(p1.getFullName());
	}

}
