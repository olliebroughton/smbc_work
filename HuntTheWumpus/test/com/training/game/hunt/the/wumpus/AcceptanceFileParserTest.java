package com.training.game.hunt.the.wumpus;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.junit.Test;

import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;

public class AcceptanceFileParserTest {
	
	@Test
	public void testFileRead() throws Throwable{
		
		Reader reader = new FileReader("acceptance_test.csv");
		CSVReader<String[]> csvPersonReader = CSVReaderBuilder.newDefaultReader(reader);
		List<String[]> persons = csvPersonReader.readAll();
		for(String[] s: persons)
			for(String s1 : s)
				System.out.println(s1);
	}

}
