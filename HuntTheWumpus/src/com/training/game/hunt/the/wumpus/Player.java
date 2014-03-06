package com.training.game.hunt.the.wumpus;

public class Player {
	
	private String playerName = "Player 1";
	private Cave currentCave;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Cave getCurrentCave() {
		return currentCave;
	}
	public void setCurrentCave(Cave currentCave) {
		this.currentCave = currentCave;
	}
	
	// current location method for testing

}
