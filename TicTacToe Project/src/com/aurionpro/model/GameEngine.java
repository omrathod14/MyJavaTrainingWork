package com.aurionpro.model;

class GameEngine {
	private Player currentPlayer;

	public void switchPlayer(Player p1, Player p2) {
		currentPlayer = (currentPlayer == p1) ? p2 : p1;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setStartingPlayer(Player player) {
		this.currentPlayer = player;
	}

	public boolean isWinningMove(Board board, ISymbol symbol) {
		char[][] g = board.getGrid();
		char s = symbol.toString().charAt(0);

		// Rows, Columns, and Diagonals
		for (int i = 0; i < 3; i++) {
			if (g[i][0] == s && g[i][1] == s && g[i][2] == s)
				return true;
			if (g[0][i] == s && g[1][i] == s && g[2][i] == s)
				return true;
		}
		if (g[0][0] == s && g[1][1] == s && g[2][2] == s)
			return true;
		if (g[0][2] == s && g[1][1] == s && g[2][0] == s)
			return true;

		return false;
	}
}