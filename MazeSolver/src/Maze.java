import java.util.LinkedList;

public class Maze {
	public int[][] maze;
	public LinkedList<Position> path= new LinkedList<Position>();
	public Position start;
	//created a path that will hold the steps that it took to reach the wining position
	public LinkedList<String> realPath = new LinkedList<String>();
}
