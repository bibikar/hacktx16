package hacktx16;
// Contains an array of current key state
// previous key state. A value of true
// means the key is pressed.

// The GamePanel KeyListener will update the array.
// All GameStates now have a handleInput() function
// in order to keep all keyboard input operations
// on the game thread rather than on the EDT to avoid
// problems.



import java.awt.event.KeyEvent;

public class Keys {
	
	public static final int NUM_KEYS = 13;
	
	public static boolean keyState[] = new boolean[NUM_KEYS];
	public static boolean prevKeyState[] = new boolean[NUM_KEYS];
	
	public static int W = 0;
	public static int A = 1;
	public static int S = 2;
	public static int D = 3;
	public static int SPACE = 4;
	public static int ENTER = 5;
	public static int ESCAPE = 6;
	public static int F1 = 7;
	public static int UP = 8;
	public static int DOWN = 9;
	public static int LEFT = 10;
	public static int RIGHT = 11;
	public static int I = 12;
	
	public static void keySet(int i, boolean b) {
		if(i == KeyEvent.VK_W) keyState[W] = b;
		if(i == KeyEvent.VK_A) keyState[A] = b;
		if(i == KeyEvent.VK_S) keyState[S] = b;
		if(i == KeyEvent.VK_D) keyState[D] = b;
		if(i == KeyEvent.VK_SPACE) keyState[SPACE] = b;
		if(i == KeyEvent.VK_ENTER) keyState[ENTER] = b;
		if(i == KeyEvent.VK_ESCAPE) keyState[ESCAPE] = b;
		if(i == KeyEvent.VK_F1) keyState[F1] = b;
		if(i == KeyEvent.VK_UP) keyState[UP] = b;
		if(i == KeyEvent.VK_DOWN) keyState[DOWN] = b;
		if(i == KeyEvent.VK_LEFT) keyState[LEFT] = b;
		if(i == KeyEvent.VK_RIGHT) keyState[RIGHT] = b;
		if(i == KeyEvent.VK_I) keyState[I] = b;
	}
	
	public static void update() {
		for(int i = 0; i < NUM_KEYS; i++) {
			prevKeyState[i] = keyState[i];
		}
	}
	
	public static boolean isPressed(int i) {
		return keyState[i] && !prevKeyState[i];
	}
	
	public static boolean isDown(int i) {
		return keyState[i];
	}
	
	public static boolean anyKeyDown() {
		for(int i = 0; i < NUM_KEYS; i++) {
			if(keyState[i]) return true;
		}
		return false;
	}
	
	public static boolean anyKeyPress() {
		for(int i = 0; i < NUM_KEYS; i++) {
			if(keyState[i] && !prevKeyState[i]) return true;
		}
		return false;
	}
	
}
