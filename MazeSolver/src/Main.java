import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws FileNotFoundException {
		//create a function that create mazes and return the ArrayList
		ArrayList<Maze> mazes = createMazes();
		
		//loop throw the mazes in the linked list
		int i=0;
		while(i<mazes.size()) {
			//show the maze
			parseMaze(mazes.get(i).maze);
			System.out.println();
			//solve each one by passing the current maze to solve maze
			if(solveMaze(mazes.get(i))) {
				poolLast(mazes.get(i).realPath);
				System.out.println("You Won!");
			}else {
				 System.out.println("No Path.");
			}
			System.out.println("------------------------------------------------------------------");
			i++;
		}

		

		

	}
	private static ArrayList<Maze> createMazes() throws FileNotFoundException {
		ArrayList mazes = new ArrayList<Maze>();
		/*
		 *-create a scanner that read from the file
		 *-each maze contain the number of "rows"
		 *-each row content
		 *-the x, y of the start point in the maze
		 *-separate each maze with "-" and we will consume the "-" at the end of each 
		 *iteration to start a new maze each time
		 *-we need to keep the same pathern to make sure the programme workes correctly 
		 * */
		
		//put the scanner outside of the while loop
		Scanner in = new Scanner(new File("maze.txt"));
		//stop when we finish reading the hole file
		while(in.hasNext()) {
			//create the maze object
			Maze m = new Maze();
			//read the number of rows
			int rows = Integer.parseInt(in.nextLine());
			//create the maze array that will hold the rows of the array 
			int maze [][]=new int[rows][];
			//loop throw the the hole lines of the array
			for(int i=0;i<rows;i++) {
				//create a string that holds the rows of the array
				String line=in.nextLine();
				//transform the rows to a string array and convert every element to integer then put 
				//them in an object array that holds integers
				int[] numbers = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
				//submit every array that we parsed it to its indecated row in the maze array
				maze[i]=numbers;
				
			}
			//get the start postion the y=row and x=columns
			int y = Integer.parseInt(in.nextLine());
			int x = Integer.parseInt(in.nextLine());
			//initialize the maze object with the maze the start 
			//and we already initilized the path in the Maze class
			m.maze = maze;
			m.start= new Position(y,x);
			//add the maze object to the arraylist
			mazes.add(m);
			//read the "-" at the end to start reading a new maze 
			//or to arrive to the end of the file
			in.nextLine();
		}
		//close the scanner to save memory
		in.close();
		return mazes;

	}
	private static boolean solveMaze(Maze m) {
		//we push the start position
		m.path.push(m.start);
		/*
		 * the idea for using realPath linked list
		 * is to push the message describing the path 
		 * the solver took in case this path is 
		 * closed by walls i pop of that message of direction
		 * and we do the same steps till we find a path 
		 * if we didnt find a path then we dont need to show any path
		 * */
		/*
		 * the y coordinate is the rows
		 * the x coordinate is the columns
		 * 
		 * */
		while(true) {
			//take a peek to the first element in the stack
			int y = m.path.peek().y;
			int x = m.path.peek().x;
			//change it to 0 in the maze
			m.maze[y][x]=0;
			
			//doing down
			
			if(isValid(y+1,x,m)) {
				if(m.maze[y+1][x]==2) {
					m.realPath.push("Moved Down.");
					return true;
				}else if(m.maze[y+1][x]==1) {
					m.realPath.push("Moved Down.");
					m.path.push(new Position(y+1,x));
					continue;
				}
			}
			
			
			//up
			if(isValid(y-1,x,m)) {
				if(m.maze[y-1][x]==2) {
					m.realPath.push("Moved Up.");
					return true;
				}else if(m.maze[y-1][x]==1) {
					m.realPath.push("Moved Up.");
					m.path.push(new Position(y-1,x));
					continue;
				}
			}
			
			
			//left
			if(isValid(y,x-1,m)) {
				if(m.maze[y][x-1]==2) {
					m.realPath.push("Moved Left.");
					return true;
				}else if(m.maze[y][x-1]==1) {
					m.realPath.push("Moved Left.");
					m.path.push(new Position(y,x-1));
					continue;
				}
			}
			
			
			//right
			if(isValid(y,x+1,m)) {
				if(m.maze[y][x+1]==2) {
					m.realPath.push("Moved Right.");
					return true;
				}else if(m.maze[y][x+1]==1) {
					m.realPath.push("Moved Right.");
					m.path.push(new Position(y,x+1));
					continue;
				}
			}
			
			/*
			 * if we checked all the direction from the specific position
			 * and we failed to find a path we poop the current position 
			 * from the stack and we backtrack to the previous position to try another 
			 * path
			 * */
			m.path.pop();
			//System.out.println("We went back");
			if(m.realPath.size()>0) {
				m.realPath.pop();	
			}

			if(m.path.size()<=0) {
				return false;
			}
				
		}
		
		//parseMaze();
		
	}

	public static boolean isValid(int y,int x,Maze m) {
		
		/*
		 * Evaluate the border if we touch one
		 * of them then we return false otherwise we return true
		 * 
		 */
		
		if(y>=m.maze.length || y<0 || x>=m.maze[y].length || x<0 )
			return false;
		return true;
	}
	
	
	public static void parseMaze(int[][] m) {
		//go throw the maze
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * this function will delete the last path and will return it 
	 * in the same time till the linked list is empty
	 * */
	public static void poolLast(LinkedList l) {
		while(l.size()>0) {
			System.out.println(l.pollLast());
		}
	}

}


