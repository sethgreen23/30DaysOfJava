
public class Main {

	public static void main(String[] args) {
		//hashCode Method take any object and return an integer
		String s = "Hello";
		//String class override hashCode method
		System.out.println(s.hashCode());
		
		/*
		 * -the hashCode is derived from object
		 * -if we are making out custom class it is more frequent to override hashCode() Method 
		 * -if we override the equal method we have to override the hashCode() Method
		 * -3 things have to be met to tell that this hashCode() Method is a valid hashCode()
		 * ---1 if the we run it on the same object more then once in the same execution context we have to get the same result. 
		 * ---2 the number the number need not remain consistent from one execution of an application to another 
		 * 	    of the same application (it happens we have the same number in each execution but it is not requirement/
		 * 		if we call the hashCode() Method more then once in the same execution context we get the same number
		 * 		Example : String s = "hello";/System.out.println(s.hashCode()) == System.out.println(s.hashCode());
		 * ---3 * if two objects are equal according to the equals() Method the calling hashCode() on each of them
		 * 		must produce the same integer result 
		 * 		Example : String s = "Hello";/String t = "Hello"/System.out.println(s.equals(t));//true -->
		 * 		System.out.println(s.hashCode());==System.out.println(t.hashCode());
		 * 		* if two object not equal these two object do not have to have different hashCode() 
		 * 		it by coincidence that the hashCodes met 
		 * 		Example : String s = "Hello"; String t = "Hello"; --> it can happens that s.hashCode()==t.hashCode()
		 * Visite the video at 
		 * 
		 */
	}

}
