package com.training.game.hunt.the.wumpus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	private Game game;
	@Before
	public void setUp(){
		game = new MockGame();
		game.start();
	}
	
	@Test
	public void testGameStart_playerNotNull(){
		assertNotNull(game.getPlayer());
	}
	
	@Test
	public void testGameStart_caveNotNull(){
		assertNotNull(game.getStartCave());
	}
	
	@Test
	public void testGameStart_currentCaveNotNull(){
		assertNotNull(game.getPlayer().getCurrentCave());
	}
	
	@Test
	public void testGameStart_currentCaveNameCorrect(){
		assertEquals("Cave 1", game.getStartCave().getName());
	}
	
	@Test
	public void testGameStart_playerNameNotNull(){
		assertNotNull(game.getPlayer().getPlayerName());
	}
	
	@Test
	public void testGameStart_playerNameCorrect(){
		assertEquals("Player 1", game.getPlayer().getPlayerName());
	}

}
