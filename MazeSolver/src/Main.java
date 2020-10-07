import java.util.LinkedList;

public class Main {
		//create maze
	public static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	public static void main(String[] args) {
		//create the path LinkedList
		LinkedList<Position> path = new LinkedList<Position>();
		//create a position
		Position p = new Position(3,0);
		//add the position to the path
		path.push(p);
		//take a peek to the first element in the stack
		maze[path.peek().y][path.peek().x]=0;
		parseMaze();
		

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


