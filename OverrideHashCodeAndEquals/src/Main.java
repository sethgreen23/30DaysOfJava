
public class Main {

	public static void main(String[] args) {
		/*
		 * in here we override the equals and the hashCode Methods
		 * to make sure that  method equals compare the two objects
		 * depending on there fields values and not depending on
		 * there addresses.
		 * 
		 * and for the hashCode method we make sure to include the
		 * values of fields to make the hashing function take the 
		 * values of fields and not there memories addresses
		 *  
		 *  we need to override the equals and hashCode for every class we use
		 */
		Position p = new Position(100,0);
		Person per = new Person("dridi.chaith@gmail.com","Seth",p);
		Position p1 = new Position(100,0);
		Person per1 = new Person("dridi.chaith@gmail.com","Seth",p1);
		
		//use the equals method
		System.out.println(per.equals(per1));
		System.out.println("-".repeat(25));
		//user the hashCode method
		System.out.println(per.hashCode());
		System.out.println(per1.hashCode());
	}

}
