import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// Working with files
		//creating a scanner reading from text file
		Scanner in = new Scanner(new File("in.text"));
		//create list to hold the names of students
		List<String> students = new ArrayList<String>();
		//iterate throw the file lines and add each line to the list
		while(in.hasNext()) {
			students.add(in.nextLine());
		}
		//iterate throw the list and output the elements
		int i=0;
		for(String s : students) {
			System.out.println(i+++" : "+s);
		}
	}

}
