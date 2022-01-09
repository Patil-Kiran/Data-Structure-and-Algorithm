

public class RatInMaze {

	public static boolean findMazePath(int[][] maze, int[][] path, int xDirection, int yDirection, int mazeLength) {
		// Base Condition for Recursion !!
		if ((maze[xDirection][yDirection] == 1) && (xDirection == mazeLength) && (yDirection == mazeLength)) {
			// Mark Traversed Path as 1
			path[xDirection][yDirection] = 1;
			return true;
		}

		// Base Condition for checking array length for columns
		if (xDirection == mazeLength && yDirection < mazeLength) {
			if (findMazePath(maze, path, xDirection, yDirection + 1, mazeLength)) {
				path[xDirection][yDirection] = 1;
				return true;
			}
		}
		// Base Condition for checking array length for rows
		if (yDirection == mazeLength && xDirection < mazeLength) {
			if (findMazePath(maze, path, xDirection + 1, yDirection, mazeLength)) {
				path[xDirection][yDirection] = 1;
				return true;
			}
		}

		if (isMovementSafe(maze, xDirection, yDirection, mazeLength)) {

			// if Valid then include it and keep track of movement on path
			path[xDirection][yDirection] = 1;
			// if movement exist in x
			if (findMazePath(maze, path, xDirection + 1, yDirection, mazeLength)) {
				return true;
			}
			// if movement exist in y
			if (findMazePath(maze, path, xDirection, yDirection + 1, mazeLength)) {
				return true;
			}
			// BackTracking i.e.
			// If movement is wrong then change it to 1 in / wrong in original array
			maze[xDirection][yDirection] = 0;
			return false;

		}

		return false;
	}

	public static boolean isMovementSafe(int[][] path, int xDirection, int yDirection, int pathLength) {
		return (xDirection >= 0 && xDirection <= pathLength && yDirection >= 0 && yDirection <= pathLength
				&& path[xDirection][yDirection] == 1);
	}

	public static void main(String[] args) {
		int[][] maze = { { 1, 0, 1 }, { 1, 0, 0 }, { 1, 1, 1 } };
		int n = maze.length - 1;
		int path[][] = new int[n + 1][n + 1];
		if (findMazePath(maze, path, 0, 0, n)) {
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze.length; j++) {
					System.out.print(path[i][j] + " ,");
				}
				System.out.println();
			}
			System.out.println("Path Found");
		} else {
			System.out.println("Path Not Found !!");
		}
	}

}
