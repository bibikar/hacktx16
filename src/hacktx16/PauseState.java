package hacktx16;
// The pause GameState can only be activated
// by calling GameStateManager#setPaused(true).


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class PauseState extends GameState {
	
	Dimension dimension;
	ArrayList<Integer> sizes;
	ArrayList<Point> offset;
	ArrayList<String> words;
	int currentOption = 0;
	private String[] options = {
			"RESUME",
			"RESTART",
			"TITLE MENU"
		};
	int width;
	int height;
	
	public PauseState(GameStateManager gsm, Dimension d) {
		super(gsm);
		dimension = d;
		sizes = new ArrayList<Integer>();
		offset = new ArrayList<Point>();
		words = new ArrayList<String>();
		width = (int) dimension.getWidth();
		height = (int) dimension.getHeight();
		init();
	}
	
	public void init() {
		
		words.add("paused");
		words.add("resume");
		words.add("restart");
		words.add("title menu");
//		words.add("move");
//		words.add("w");
//		words.add("a");
//		words.add("s");
//		words.add("d");
//		words.add("attack");
//		words.add("up");
//		words.add("down");
//		words.add("left");
//		words.add("right");
//		words.add("use item");
//		words.add("space bar");
//		
//		
//		
		sizes.add(words.get(0).length() * 8);
		offset.add(new Point(width / 2 - sizes.get(0), height / 16));
		
		sizes.add(words.get(1).length() * 8);
		offset.add(new Point(width / 2 - sizes.get(1), height / 4 - 8));
		
		sizes.add(words.get(2).length() * 8);
		offset.add(new Point(width / 2 - sizes.get(2), height / 2 - 8));
		
		sizes.add(words.get(3).length() * 8);
		offset.add(new Point(width / 2 - sizes.get(3), 3 * height / 4 - 8));
//		
//		sizes.add("MOVE".length() * 8);
//		offset.add(new Point((int)(dimension.getWidth() - dimension.getWidth() / 4 - sizes.get(1)), (int)dimension.getHeight() / 8 - 20));
//		sizes.add("W".length() * 8);
//		offset.add(new Point((int)(dimension.getWidth() - dimension.getWidth() / 4 - sizes.get(2)), (int)dimension.getHeight() / 8));
//		sizes.add("A".length() * 8);
//		offset.add(new Point((int)(dimension.getWidth() - dimension.getWidth() / 4 - sizes.get(3) - 20), (int)dimension.getHeight() / 8 + 20));
//		sizes.add("S".length() * 8);
//		offset.add(new Point((int)(dimension.getWidth() - dimension.getWidth() / 4 - sizes.get(4)), (int)dimension.getHeight() / 8 + 20));
//		sizes.add("D".length() * 8);
//		offset.add(new Point((int)(dimension.getWidth() - dimension.getWidth() / 4 - sizes.get(5) + 20), (int)dimension.getHeight() / 8 + 20));
//		
//				
//		sizes.add("ATTACK".length() * 8);
//		sizes.add("UP".length() * 8);
//		sizes.add("DOWN".length() * 8);
//		sizes.add("LEFT".length() * 8);
//		sizes.add("RIGHT".length() * 8);
//		
//		sizes.add("USE ITEM".length() * 8);
//		sizes.add("SPACE BAR".length() * 8);
	}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		g.setColor(new Color(0,0,0,126));
		g.fillRect(0, 0, width, height);
		
		g.setColor(Color.GRAY);
		
		g.fillRoundRect(width / 4, 3 * height / 16, width / 2, height / 8, width / 32, width / 32);
		g.fillRoundRect(width / 4, 7 * height / 16, width / 2, height / 8, width / 32, width / 32);
		g.fillRoundRect(width / 4, 11 * height / 16, width / 2, height / 8, width / 32, width / 32);
		
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.GRAY.darker());
		
		g.drawRoundRect(width / 4, 3 * height / 16, width / 2, height / 8, width / 32, width / 32);
		g.drawRoundRect(width / 4, 7 * height / 16, width / 2, height / 8, width / 32, width / 32);
		g.drawRoundRect(width / 4, 11 * height / 16, width / 2, height / 8, width / 32, width / 32);
		
		/*for (int i = 0; i < 4; i ++) {
			Content.drawWhiteString(g, words.get(i), (int)offset.get(i).getX(), (int)offset.get(i).getY());
		}*/
		
		g.setColor(Color.WHITE);
		if (currentOption == 0) {
			g.drawRoundRect(width / 4, 3 * height / 16, width / 2, height / 8, width / 32, width / 32);
		}
		else if (currentOption == 1) {
			g.drawRoundRect(width / 4, 7 * height / 16, width / 2, height / 8, width / 32, width / 32);
		}
		else if (currentOption == 2) {
			g.drawRoundRect(width / 4, 11 * height / 16, width / 2, height / 8, width / 32, width / 32);
		}
//		Content.drawString(g, words.get(0), (int)offset.get(0).getX(), (int)offset.get(0).getY());
//		Content.drawString(g, words.get(1), (int)offset.get(1).getX(), (int)offset.get(1).getY());
//		Content.drawString(g, words.get(2), (int)offset.get(2).getX(), (int)offset.get(2).getY());
//		Content.drawString(g, words.get(3), (int)offset.get(3).getX(), (int)offset.get(3).getY());
	}
	
	public void handleInput() {
		// TODO Auto-generated method stub
		if(Keys.isPressed(Keys.ESCAPE)) {
			gsm.setPaused(false);
			//JukeBox.resumeLoop("music1");
		}
		if(Keys.isPressed(Keys.F1)) {
			gsm.setPaused(false);
			gsm.setState(GameStateManager.MENU);
		}
		if ((Keys.isPressed(Keys.S) || Keys.isPressed(Keys.DOWN)) && currentOption < options.length - 1) {
			currentOption++;
		}
		if ((Keys.isPressed(Keys.W) || Keys.isPressed(Keys.UP)) && currentOption > 0) {
			currentOption--;
		}
		if (Keys.isPressed(Keys.ENTER)) {
			selectOption();
		}
		if (Keys.isPressed(Keys.SPACE)) {
			selectOption();
		}
	}
	
	private void selectOption() {
		if (currentOption == 0) {
			gsm.setPaused(false);
		}
		if (currentOption == 1) {
			gsm.setPaused(false);
			gsm.setState(GameStateManager.PLAY);
		}
		if (currentOption == 2) {
			gsm.setPaused(false);
			gsm.setState(GameStateManager.INTRO);
		}
		
		
	}
}
