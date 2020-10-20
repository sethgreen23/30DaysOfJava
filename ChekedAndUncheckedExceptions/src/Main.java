import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		/*
		 *- Exception is the technical term  for runtime exception "you are ruining your code and it breaks"
		 *
		 *- int number = Integer.parseInt("pizza"); --> NumberFormatException
		 *
		 *- ArrayList<Integer> x = new ArrayList<>();
		 *	x.get(5) --> IndexOutOfBounceException --> exception that can occur with loops
		 *
		 *- FileInputStream f = new FileInputStream("") --> FileInputException --> 
		 *		- Special type exception (we caught compile type error)
		 *			-This class accept a file or a string parameter
		 *				- We got a FileNotFoundException there is two way to handle it
		 *					- we deal with it directly by surrounding it with try and catch
		 *					- or we pass it to someone else to deal with it
		 *		- In order to the class to compile we have to do one of the two things 	
		 *		  "add throw declaration" or "surround it with try and catch"
		 *
		 *- The unchecked exceptions (comes from RunTimeException) like "NumberFormatException" or "IndexOutOfBounceException"
		 *	not required to be listed in any throws or to caught with try catch because it is a programming error it is and issue
		 *	on your part it your fault where for checked Exception (comes from Throwable) like "FileNotFoundException" is depending
		 *	on the environment which the application is executed.
		 *- I think of unchecked Exception (comes from RunTimeException) as exception that are 100% your fault those can 
		 *	be prevented if you program correctly and you don't have to list them in the throws section , and any of those 
		 *	that are out of your control such FileNotFoundException those need to be listed in the throws section or surrounded
		 *	by try and catch
		 * 
		 * 
		 */
		
		//here the calling method "main method" handled the throws exception 
		//we can throw it further if it wasn't the main method that the new calling method well handle it 
		//but in this case if we don't handle it it will throws an exception in the runtime
		try {
			getFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	//This is an example where we use the throws exception for a checked Exception to the main method "Example 1"
	public static void getFile() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("");
	}
	//This is an example where we surrounded by try and catch the checked exception
	public static void getFile1() {
		try {
			FileInputStream f = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
