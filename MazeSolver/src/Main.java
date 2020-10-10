import java.util.LinkedList;

public class Main {

	
	public static void main(String[] args) {
		/*
		 * We refactored the main method where we put   
		 * a function that take the hole functionality 
		 * inside of it 
		 * we made the caller of the function(main)
		 * handle the result of the called function (solveMaze)
		 * we made a function that take the functionality of the
		 * treatment of the direction functionality
		 */
		
		//make a linked list that holds the mazes we want to solve
		LinkedList<Maze> mazes = new LinkedList<Maze>();
		//create maze that holds "the maze" ,"the path" and the "start position"
		Maze m = new Maze();
		int[][] maze = {
			{0, 1, 1, 1, 1, 1, 0, 1},
			{1, 1, 0, 1, 0, 1, 1, 1},
			{1, 1, 0, 1, 0, 1, 0, 0},
			{1, 0, 0, 0, 0, 0, 0, 0},
			{1, 1, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0}
		};
		m.maze = maze;
		m.path = new LinkedList<Position>();
		m.start= new Position(0,7);
		
		Maze n = new Maze();
		int[][] n_maze = {
				{0, 1, 1, 1, 1, 1, 0, 1},
				{1, 1, 0, 1, 0, 1, 0, 1},
				{1, 1, 0, 1, 0, 1, 0, 0},
				{1, 0, 0, 0, 0, 0, 0, 0},
				{1, 1, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 0, 0},
				{0, 2, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0}
		};
		n.maze = n_maze;
		n.path = new LinkedList<Position>();
		n.start= new Position(0,7);
		mazes.add(m);
		mazes.add(n);
		//loop throw the mazes in the linked list
		int i=0;
		while(i<mazes.size()) {
			//show the maze
			parseMaze(mazes.get(i).maze);
			System.out.println();
			//solve each one by passing the current maze to solve maze
			if(solveMaze(mazes.get(i))) {
				System.out.println("You Won!");
			}else {
				 System.out.println("No Path.");
			}
			System.out.println("------------------------------------------------------------------");
			i++;
		}

		

		

	}
	private static boolean solveMaze(Maze m) {
		//we push the start position
		m.path.push(m.start);
		
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
					System.out.println("Move Down.");
					return true;
				}else if(m.maze[y+1][x]==1) {
					System.out.println("Move Down.");
					m.path.push(new Position(y+1,x));
					continue;
				}
			}
			
			
			//up
			if(isValid(y-1,x,m)) {
				if(m.maze[y-1][x]==2) {
					System.out.println("Moved Up.");
					return true;
				}else if(m.maze[y-1][x]==1) {
					System.out.println("Move Up.");
					m.path.push(new Position(y-1,x));
					continue;
				}
			}
			
			
			//left
			if(isValid(y,x-1,m)) {
				if(m.maze[y][x-1]==2) {
					System.out.println("Move Left.");
					return true;
				}else if(m.maze[y][x-1]==1) {
					System.out.println("Move Left.");
					m.path.push(new Position(y,x-1));
					continue;
				}
			}
			
			
			//right
			if(isValid(y,x+1,m)) {
				if(m.maze[y][x+1]==2) {
					System.out.println("Move Right.");
					return true;
				}else if(m.maze[y][x+1]==1) {
					System.out.println("Move Right.");
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
			System.out.println("We went back");
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

}


