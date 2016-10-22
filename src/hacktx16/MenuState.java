package hacktx16;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class MenuState extends GameState {
	
	private BufferedImage bg;
	private BufferedImage turtle;
	
	private Dimension dimension;
	
	private int currentOption = 0;
	private BufferedImage image;
	
	ArrayList<Integer> sizes;
	ArrayList<Point> offset;
	ArrayList<String> words;
	
	int width;
	int height;
	
	private String[] options = {
		"START",
		"CONTROLS",
		"QUIT"
	};

	public MenuState(GameStateManager gsm, Dimension d) {
		super(gsm);
		dimension = d;
		//image = Content.TITLE[0][0];
		width = (int) dimension.getWidth();
		height = (int) dimension.getHeight();
		words = new ArrayList<String>();
		sizes = new ArrayList<Integer>();
		offset = new ArrayList<Point>();
		init();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		words.add("START");
		words.add("CONTROLS");
		words.add("QUIT");
		
		sizes.add(words.get(0).length() * 8);
		sizes.add(words.get(1).length() * 8);
		sizes.add(words.get(2).length() * 8);
		
		offset.add(new Point(width / 2 - sizes.get(0), 9 * height / 16 - 8));
		offset.add(new Point(width / 2 - sizes.get(1), 11 * height / 16 - 8));
		offset.add(new Point(width / 2 - sizes.get(2), 13 * height / 16 - 8));
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		handleInput();
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
		
		g.drawImage(image, 0, 0, null);
		
		g.setColor(Color.GRAY);
		
		g.fillRoundRect(width / 4, 17 * height / 32, width / 2, height / 16, width / 32, width / 32);
		g.fillRoundRect(width / 4, 21 * height / 32, width / 2, height / 16, width / 32, width / 32);
		g.fillRoundRect(width / 4, 25 * height / 32, width / 2, height / 16, width / 32, width / 32);
		
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.BLACK);
		
		g.drawRoundRect(width / 4, 17 * height / 32, width / 2, height / 16, width / 32, width / 32);
		g.drawRoundRect(width / 4, 21 * height / 32, width / 2, height / 16, width / 32, width / 32);
		g.drawRoundRect(width / 4, 25 * height / 32, width / 2, height / 16, width / 32, width / 32);

		for (int i = 0; i < 3; i++) {
			Content.drawString(g, words.get(i), (int)offset.get(i).getX(), (int)offset.get(i).getY());
		}
		
		g.setColor(Color.WHITE);
		
		if (currentOption == 0) {
			g.drawRoundRect(width / 4, 17 * height / 32, width / 2, height / 16, width / 32, width / 32);
		}
		else if (currentOption == 1) {
			g.drawRoundRect(width / 4, 21 * height / 32, width / 2, height / 16, width / 32, width / 32);
		}
		else if (currentOption == 2) {
			g.drawRoundRect(width / 4, 25 * height / 32, width / 2, height / 16, width / 32, width / 32);
		}
		
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
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
			gsm.setState(GameStateManager.PLAY);
		}
		if (currentOption == 1) {
			gsm.setState(GameStateManager.CONTROLS);
		}
		if (currentOption == 2) {
			System.exit(0);
		}
		
		
	}

}
