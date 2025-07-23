package com.aurionpro.model;

class Player {
	private String name;
	private ISymbol symbol;

	public Player(String name, ISymbol symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public ISymbol getSymbol() {
		return symbol;
	}
}
