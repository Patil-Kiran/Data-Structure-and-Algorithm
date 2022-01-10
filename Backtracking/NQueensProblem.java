package com.app.Backtracking;

public class NQueensProblem {

	public static boolean placeQueenSafely(int[][] chess, int column) {

		// Base Condition while performing recursion when will be at last column i.e.
		// queen added successfully last column !!
		if (column >= chess.length) {
			return true;
		}

		// Iterate over entire chess rows
		for (int row = 0; row < chess.length; row++) {
			// Checking constraint for spacing queen
			if (isSafePlaceAvailable(chess, row, column)) {
				// add queen to board
				chess[row][column] = 1;
				// Apply Recursion to check next possible queen by incrementing column
				if (placeQueenSafely(chess, column + 1)) {
					return true;
				}
				// BackTracking Return false
				chess[row][column] = 0;
			}
		}
		return false;
	}

	// Defining Constraint for Queen Safety
	private static boolean isSafePlaceAvailable(int[][] chess, int row, int column) {
		// Checking in Horizonatl and vertical is there any queen present
		int i, j;
		for (i =0; i<column; i++) {
			if (chess[row][i] == 1) {
				return false;
			}
		}
		// Checking diagonal starting upper
		for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		// Checking lower diagonal
		for (i = row, j = column; i < chess.length && j >= 0; i++, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] chessBoard = new int[5][6];
		if (placeQueenSafely(chessBoard,1)) {
			for (int i = 0; i < chessBoard.length; i++) {
				for (int j = 0; j < chessBoard.length; j++) {
					System.out.print(" " + chessBoard[i][j]);
				}
				System.out.println();
			}
		}else {
			System.out.println("Queen's position not possible");
		}

	}

}

