import java.util.LinkedList;

public class Main {
	public static Maze m = new Maze();
		//create maze

	
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
		if(solveMaze(m.start)) {
			System.out.println("You Won!");
		}else {
			 System.out.println("No Path.");
		}
		

		

	}
	private static boolean solveMaze(Position p) {
		m.path.push(p);
		
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
			
			if(isValid(y+1,x)) {
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
			if(isValid(y-1,x)) {
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
			if(isValid(y,x-1)) {
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
			if(isValid(y,x+1)) {
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

	public static boolean isValid(int y,int x) {
		
		/*
		 * Evaluate the border if we touch one
		 * of them then we return false otherwise we return true
		 * 
		 */
		
		if(y>=m.maze.length || y<0 || x>=m.maze[y].length || x<0 )
			return false;
		return true;
	}
	
	
	public static void parseMaze() {
		//go throw the maze
		for(int i=0;i<m.maze.length;i++) {
			for(int j=0;j<m.maze[i].length;j++) {
				System.out.print(m.maze[i][j]+" ");
			}
			System.out.println();
		}
	}

}


