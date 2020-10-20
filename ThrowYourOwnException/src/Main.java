import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - When you should throw exception : it should be an exceptional circumstance very rarely 
		 * 	most of the time you can deal with the problem by using logic, if statement, while loops and 
		 * 	so fourth. Some developers when are new will use exception as if they are flow control and it is not
		 * 	what they are designed for, they are designed for things that are not supposed to happen on the regular
		 *  but if you work around things good you can usually avoid them.for example you are reading from a file 
		 *  it doesn't work instead of having everything exploded you can just try again using a loop or you can output
		 *  and you say "hey we can't read from the file try again in 10 seconds" or what every and ultimately when you
		 *  Can't get hold of the file you can throw an exception.
		 * 
		 * - Any time when you can, prefer use logic rather then exceptions when you throw exception try to be
		 * 	specific as possible and when you catch them you can catch numerous types of exception and do the approprite things
		 * 
		 * - Try to use loops and logic rather then using exception for example when you 	
		 */
		

	}
	public static void doSomething() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println();
			e.printStackTrace();
		}finally{
			
		}
		
		/*
		 * 
		 *-	Finally block is for resource clean up (like closing file ) or any absolute
		 *	things you have to do because this finally execute your program my not continue
		 *	because you can be sure that any final things can be done inside this finally 
		 * 
		 * -You can surround your "throw new Exception();" with try and catch 
		 * 	or you can declare throws line in the method declaration in "doSomthing2()" method
		 * 
		 * 
		 */
		
	}
	public static void doSomething2() throws  Exception {
		throw new Exception();
	}
	
	public static void doSomething3() {
		/*
		 *-	The "Exception()" is very general we can be more specific and throw IOException for example
		 *-	This branching allows you to deal with different types of exceptions based on what happens
		 *	maybe file fun out of information you can say "we run out of data" or you cant access a file
		 *	or the data on the file is not correct or what ever might be we can do different things depending
		 *	on the circumstances.
		 *-	You can catch multiple different types of exception specificaly if you want to do the same thing 
		 *	for more then one the "|" works like the "OR" operator in the if Statement
		 * 
		 */
		try {
			throw new IOException();
		}catch(IOException | IndexOutOfBoundsException e) {//branching 1
			System.out.println("more specific");
			e.printStackTrace();
		}catch(Exception e) {//branching 2
			System.out.println("more general");
			e.printStackTrace();
		}
	}
}
