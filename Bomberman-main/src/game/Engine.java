package game;

import javax.swing.*;
// create windows, buttons and timers
import java.awt.event.ActionEvent;
// button click refers to action

public final class Engine
{
    private static final int TIME_STEP = 30;
	// the time of step
    private static int width = 10;
	// row 10 times 10
    private static int height = 10;
	//row by row 10 times 10
    private static int nrOfEnemies = 5;
	//  number of enemies
    private static Timer clockTimer = null;
	// update at regular intervals

    private Engine() {}
	// class to prevent object creation

    public static void main(String[] args) {
	startGame();
    }
	// main method of the engine class and start the game

    public static void startGame() {
		// this is to start the game
	Floor floor = new Floor(width, height, nrOfEnemies);
	 // object with width, height, and number of enemies
	BombermanFrame frame = new BombermanFrame("Bomberman", floor);
	// passing the title bomberman
	frame.setLocationRelativeTo(null);
	// is set to the center location of the screen
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// is set default to close the screen
	floor.addFloorListener(frame.getBombermanComponent());
	// allowing player to interact with the game world

	Action doOneStep = new AbstractAction()
		// subclass of abstract action
	{
	    public void actionPerformed(ActionEvent e) {
			// defines the action to be performed at each time step of the game.
		tick(frame, floor);
	    }
	};
	clockTimer = new Timer(TIME_STEP, doOneStep);
	clockTimer.setCoalesce(true);
	// avoiding unnecessary processing.
	clockTimer.start();
    }

    private static void gameOver(BombermanFrame frame, Floor floor) {
	clockTimer.stop();
	// halting the game's time progression.
	frame.dispose();
	// effectively closing the game window.
	startGame();
	// method to restart the game.


	}

    private static void tick(BombermanFrame frame, Floor floor) {
	if (floor.getIsGameOver()) {
		// This line checks if the game is over by calling the getIsGameOver() method on the floor object.
		// If the game is over, the following block of code is executed.
	    gameOver(frame, floor);
		// handles the necessary actions when the game is over,
		// such as stopping the timer, disposing of the frame, and restarting the game.
	} else {
		// If the game is not over
	    floor.moveEnemies();
		// updates the positions and behaviors of the enemies in the game.
	    floor.bombCountdown();
		// the countdown of bombs, reducing their timers until they explode.
	    floor.explosionHandler();
		// caused by bombs
	    floor.characterInExplosion();
		// player character (Bomberman) is in the vicinity of an explosion
		// handles the appropriate actions if there is a collision.
	    floor.notifyListeners();
		// notifies the registered listeners  about the changes in the game state.
		// update display
	}
    }
}
