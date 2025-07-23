package com.aurionpro.model;

class Board {
	private char[][] grid;

	public Board() {
		grid = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = '_';
			}
		}
	}

	public void displayBoard() {
		System.out.println("  0 1 2");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean isCellEmpty(int row, int col) {
		return grid[row][col] == '_';
	}

	public void placeSymbol(int row, int col, ISymbol symbol) {
		grid[row][col] = symbol.toString().charAt(0);
	}

	public boolean isFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == '_')
					return false;
			}
		}
		return true;
	}

	public char[][] getGrid() {
		return grid;
	}
}
