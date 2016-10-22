package hacktx16;
// The GameStateManager does exactly what its
// name says. It contains a list of GameStates.
// It decides which GameState to update() and
// draw() and handles switching between different
// GameStates.


import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;


public class GameStateManager {
	
	private boolean paused;
	private boolean inInventory;
	private PauseState pauseState;
	
	private GameState[] gameStates;
	private int currentState;
	private int previousState;
	
	public static final int NUM_STATES = 7;
	public static final int INTRO = 0;
	public static final int MENU = 1;
	public static final int PLAY = 2;
	public static final int GAMEOVER = 3;
	public static final int CONTROLS = 4;
	public static final int BOSS = 5;
	public static final int DIFFICULTY = 6;
	
	private JPanel _parent;
	
	private Dimension dimension;
	private Player  player;
	int difficulty;
	
	public GameStateManager(Dimension d, JPanel _parent) {
		
		dimension = d;
		paused = false;
		inInventory = false;
		pauseState = new PauseState(this, dimension);
		
		gameStates = new GameState[NUM_STATES];
		setState(MENU);
	}
		
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setState(int i) {
		previousState = currentState;
		unloadState(previousState);
		currentState = i;
		/*if(i == INTRO) {
			gameStates[i] = new IntroState(this);
			gameStates[i].init();
		}*/
		if(i == MENU) {
			gameStates[i] = new MenuState(this, dimension);
			gameStates[i].init();
		}
		else if(i == PLAY) {
			gameStates[i] = new PlayState(this, dimension, difficulty);
			gameStates[i].init();
		}
		/*else if(i == GAMEOVER) {
			gameStates[i] = new GameOverState(this, dimension);
			gameStates[i].init();
		}
		else if(i == CONTROLS) {
			gameStates[i] = new ControlState(this, dimension);
			gameStates[i].init();
		}
		else if(i == BOSS) {
			gameStates[i] = new BossState(this, dimension, difficulty, player);
			gameStates[i].init();
		}
		else if (i == DIFFICULTY) {
			gameStates[i] = new DifficultyState(this, dimension);
			gameStates[i].init();
		}*/
	}
	
	public void unloadState(int i) {
		gameStates[i] = null;
	}
	
	public void setPaused(boolean b) {
		paused = b;
	}
	
	public void update() {
		if(paused) {
			pauseState.update();
		}
		else if(gameStates[currentState] != null) {
			gameStates[currentState].update();
		}
	}
	
	public void draw(Graphics2D g) {
		if(paused) {
			pauseState.draw(g);
		}
		else if(gameStates[currentState] != null) {
			gameStates[currentState].draw(g);
		}
	}
	
}
