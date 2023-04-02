package com.in30min.learnspringframework.game;

public class GameRunner {
	private GamingConsole game;
//MarioGame game ;
/*public GameRunner(MarioGame game) {
	this.game=game;
}*/
	public GameRunner(GamingConsole game) {
		this.game=game;
	}

public void run() {
	System.out.println("Running game : " + game);
	game.down();
	game.left();
	game.right();
	game.up();
}
}
