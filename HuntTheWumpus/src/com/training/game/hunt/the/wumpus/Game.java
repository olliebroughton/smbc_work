package com.training.game.hunt.the.wumpus;

public abstract class Game {
	
	private Player player;
	private Cave startCave;
	
	public void start(){
		startCave = new Cave();
		player = new Player();
		player.setCurrentCave(startCave);
		System.out.println("You are " + player.getPlayerName() + " in " + startCave.getName());
		getUserInput();
	}

	public Player getPlayer() {
		return player;
	}

	public Cave getStartCave() {
		return startCave;
	}
	
	public abstract String getUserInput();
}
