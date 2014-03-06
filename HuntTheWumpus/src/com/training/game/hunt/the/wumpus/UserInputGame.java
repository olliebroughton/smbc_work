package com.training.game.hunt.the.wumpus;

import java.util.Scanner;

public class UserInputGame extends Game {

	@Override
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Read from command line " + s);
		return s;
	}

}
