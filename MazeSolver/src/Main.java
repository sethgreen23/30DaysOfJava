import java.util.LinkedList;

public class Main {
		//create maze
	public static int[][] maze = {
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
	public static void main(String[] args) {
		//create the path LinkedList
		LinkedList<Position> path = new LinkedList<Position>();
		//create a position
		Position p = new Position(0,7);
		//add the position to the path
		path.push(p);
		
		/*
		 * the y coordinate is the rows
		 * the x coordinate is the columns
		 * */
		while(true) {
			//take a peek to the first element in the stack
			int y = path.peek().y;
			int x = path.peek().x;
			//change it to 0 in the maze
			maze[y][x]=0;
			
			//doing down
			if(isValid(y+1,x)) {
				if(maze[y+1][x]==2) {
					System.out.println("Move Down. You Won.");
					return;
				}else if(maze[y+1][x]==1) {
					System.out.println("Move Down.");
					path.push(new Position(y+1,x));
					continue;
				}
			}
			
			//up
			if(isValid(y-1,x)) {
				if(maze[y-1][x]==2) {
					System.out.println("Moved Up. You Won.");
					return;
				}else if(maze[y-1][x]==1) {
					System.out.println("Move Up.");
					path.push(new Position(y-1,x));
					continue;
				}
			}
			
			
			//left
			if(isValid(y,x-1)) {
				if(maze[y][x-1]==2) {
					System.out.println("Move Left. You Won.");
					return;
				}else if(maze[y][x-1]==1) {
					System.out.println("Move Left.");
					path.push(new Position(y,x-1));
					continue;
				}
			}
			
			
			//right
			if(isValid(y,x+1)) {
				if(maze[y][x+1]==2) {
					System.out.println("Move Right. You Won.");
					return;
				}else if(maze[y][x+1]==1) {
					System.out.println("Move Right.");
					path.push(new Position(y,x+1));
					continue;
				}
			}
			
			/*
			 * if we checked all the direction from the specific position
			 * and we failed to find a path we poop the current position 
			 * from the stack and we backtrack to the previous position to try another 
			 * path
			 * */
			path.pop();
			System.out.println("We went back");
			if(path.size()<=0) {
				System.out.println("No Path");
				return;
			}
				
		}
		
		//parseMaze();
		

	}
	public static boolean isValid(int y,int x) {
		/*
		 * evalutate the border if we touch one
		 * of them then we return false otherwise we return true
		 * */
		if(y>=maze.length || y<0 || x>=maze[y].length || x<0 )
			return false;
		return true;
	}
	
	
	public static void parseMaze() {
		//go throw the maze
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}

}


