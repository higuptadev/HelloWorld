package com.in30min.learnspringframework;

import com.in30min.learnspringframework.game.GameRunner;
import com.in30min.learnspringframework.game.MarioGame;
import com.in30min.learnspringframework.game.PacmanGame;
import com.in30min.learnspringframework.game.SuperContraGame;

public class App01BasicGaming {

	public static void main(String[] args) {
	//	var game = new MarioGame();
	//	var game = new SuperContraGame();
		
		var game = new PacmanGame();
var gameRunner = new GameRunner(game);
gameRunner.run();
	}

}
