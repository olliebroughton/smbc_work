package com.training.game.hunt.the.wumpus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;

public class AcceptanceGameTest {
	
	private Game game;
	List<String[]> testDatas;
			
	@Before
	public void setUp() throws Throwable{
		
		Reader reader = new FileReader("acceptance_test.csv");
		CSVReader<String[]> csvPersonReader = CSVReaderBuilder.newDefaultReader(reader);
		testDatas = csvPersonReader.readAll();
		
		game = new MockGame();
		game.start();
	}
	
	public String[] getTestInputData(String currentTestName)
	{
		for (String[] testParams : testDatas){
			for (String testName : testParams){
				if (testName.equals(currentTestName)){
					System.out.println("found params");
				}
			}	
		}
		return null;
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
		assertEquals("Player 1", game.getPlayer().getPlayerName());
	}
	
	@Test
	public void testGameStart(){
		// get name of test in list
		// test param 1 matches to current cave
		// test param 2 matches the current player
		
		getTestInputData("testGameStart");
	}

}
