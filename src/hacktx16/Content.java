package hacktx16;
// Loads and splits all sprites on start up.
// The sprites can easily be accessed as they
// are public and static.



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Content {
	
/*	public static BufferedImage[][] ANESTHESIA = load("Resources/Sprites/Items/anesthesia.png", 126, 126);
	public static BufferedImage[][] BANDAGE = load("Resources/Sprites/Items/bandage.png", 126, 126);
	public static BufferedImage[][] CLOAK = load("Resources/Sprites/Items/cloak.png", 64, 64);
	public static BufferedImage[][] FOUR_LEAF_CLOVER = load("Resources/Sprites/Items/fourleafclover.png", 33, 36);
	public static BufferedImage[][] HEATED_RUBBER = load("Resources/Sprites/Items/heatedrubberstrip.png", 150, 150);
	public static BufferedImage[][] MARTYRDOM_DEATH_CHARM = load("Resources/Sprites/Items/martyrdomdeathcharm.png", 150, 150);
	public static BufferedImage[][] METAL_DETECTOR = load("Resources/Sprites/Items/metal_detector.png", 28, 28);
	public static BufferedImage[][] NICE_SNEAKERS = load("Resources/Sprites/Items/nicesneakers.png", 126, 126); 
	public static BufferedImage[][] RUBBER_STRIP = load("Resources/Sprites/Items/rubberstrip.png", 150, 150);
	public static BufferedImage[][] RECHARGING_SHIELD = load("Resources/Sprites/Items/rechargingshield.png", 57, 57);
	public static BufferedImage[][] SPIDER_LEG = load("Resources/Sprites/Items/spiderleg.png", 126, 126);
	public static BufferedImage[][] STRENGTH_ENHANCER = load("Resources/Sprites/Items/strengthenhancer.png", 126, 126);
	public static BufferedImage[][] WHEEL_OF_TIME = load("Resources/Sprites/Items/wheeloftime.png", 126, 113);
	
	public static BufferedImage[][] CHEST = load("Resources/Tilesets/chests.png", 32, 32);
	public static BufferedImage[][] BIG_CHEST = load("Resources/Tilesets/BigChest.png", 64, 32);
	public static BufferedImage[][] MENUBG = load("Resources/HUD/menuscreen.gif", 128, 144);
	public static BufferedImage[][] BAR = load("Resources/HUD/TobyPortrait1.png", 500, 250);
	public static BufferedImage[][] FULL_HEART = load("Resources/HUD/fullshell.png", 64, 64);
	public static BufferedImage[][] HALF_HEART = load("Resources/HUD/halfshell.png", 64, 64);
	public static BufferedImage[][] EMPTY_HEART = load("Resources/HUD/emptyshell.png", 64, 64);*/
	public static BufferedImage[][] BLUE_FONT = load("Resources/HUD/font.gif", 8, 8);
	public static BufferedImage[][] RED_FONT = load("Resources/HUD/redtext.png", 8, 8);
	public static BufferedImage[][] WHITE_FONT = load("Resources/HUD/whitetext.png", 8, 8);
	/*public static BufferedImage[][] TITLE = load("Resources/HUD/titlescreen.png", 512, 512);
	
	public static BufferedImage[][] POOF = load("Resources/Tilesets/poof.gif", 128, 128);
	
	public static BufferedImage[][] SLIMEBALL = load("Resources/Sprites/slimeball.gif", 16, 16);
	public static BufferedImage[][] FIREBALL = load("Resources/Sprites/slimeball.gif", 16, 16);
	public static BufferedImage[][] STRAW = load("Resources/Sprites/straw.png", 31, 929);
	public static BufferedImage[][] PLAYER = load("Resources/Sprites/new_sprite_turtle.png", 300, 400);	
	public static BufferedImage[][] BOSS = load("Resources/Sprites/boss.png", 64, 64);
	public static BufferedImage[][] SPIDER = load("Resources/Sprites/Spider Sprite/SpiderSpriteSheet.png", 32, 32);
	public static BufferedImage[][] SPARKLE = load("Resources/Sprites/sparkle.gif", 16, 16);
	*/
	public static String root = "Resources";
	
	public static BufferedImage[][] load(String s, int w, int h) {
		BufferedImage[][] ret;
		try {
			BufferedImage spritesheet = ImageIO.read(new File(s));
			int width = spritesheet.getWidth() / w;
			int height = spritesheet.getHeight() / h;
			ret = new BufferedImage[height][width];
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < width; j++) {
					ret[i][j] = spritesheet.getSubimage(j * w, i * h, w, h);
				}
			}
			return ret;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error loading graphics.");
			System.exit(0);
		}
		return null;
	}
	
	public static void drawString(Graphics2D g, String s, int x, int y) {
		s = s.toUpperCase();
		int width = s.length()*16;
		int height = 16;
		//g.setColor(Color.WHITE.darker());
		//g.fillRect(x, y, width+1, height+1);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 47) c = 36; // slash
			if(c == 58) c = 37; // colon
			if(c == 32) c = 38; // space
			if(c >= 65 && c <= 90) c -= 65; // letters
			if(c >= 48 && c <= 57) c -= 22; // numbers
			int row = c / BLUE_FONT[0].length;
			int col = c % BLUE_FONT[0].length;
			g.drawImage(BLUE_FONT[row][col].getScaledInstance(16, 16, Image.SCALE_SMOOTH), x + 16 * i, y, null);
		}
	}
	
	public static void drawWhiteString(Graphics2D g, String s, int x, int y) {
		s = s.toUpperCase();
		int width = s.length()*16;
		int height = 16;
		//g.setColor(Color.WHITE.darker());
		//g.fillRect(x, y, width+1, height+1);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 47) c = 36; // slash
			if(c == 58) c = 37; // colon
			if(c == 32) c = 38; // space
			if(c >= 65 && c <= 90) c -= 65; // letters
			if(c >= 48 && c <= 57) c -= 22; // numbers
			int row = c / WHITE_FONT[0].length;
			int col = c % WHITE_FONT[0].length;
			g.drawImage(WHITE_FONT[row][col].getScaledInstance(16, 16, Image.SCALE_SMOOTH), x + 16 * i, y, null);
		}
	}
	
	public static void drawWhiteString1(Graphics2D g, String s, int x, int y) {
		s = s.toUpperCase();
		int width = s.length()*16;
		int height = 16;
		//g.setColor(Color.WHITE.darker());
		//g.fillRect(x, y, width+1, height+1);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 47) c = 36; // slash
			if(c == 58) c = 37; // colon
			if(c == 32) c = 38; // space
			if(c >= 65 && c <= 90) c -= 65; // letters
			if(c >= 48 && c <= 57) c -= 22; // numbers
			int row = c / WHITE_FONT[0].length;
			int col = c % WHITE_FONT[0].length;
			g.drawImage(WHITE_FONT[row][col].getScaledInstance(16, 16, Image.SCALE_SMOOTH), x + 12 * i, y, null);
		}
	}
	
	public static int drawSmallBlueString(Graphics2D g, String s, int x, int y) {
		s = s.toUpperCase();
		int width = s.length()*6;
		int height = 16;
		//g.setColor(Color.WHITE.darker());
		//g.fillRect(x, y, width+1, height+1);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 47) c = 36; // slash
			if(c == 58) c = 37; // colon
			if(c == 32) c = 38; // space
			if(c >= 65 && c <= 90) c -= 65; // letters
			if(c >= 48 && c <= 57) c -= 22; // numbers
			int row = c / BLUE_FONT[0].length;
			int col = c % BLUE_FONT[0].length;
			g.drawImage(BLUE_FONT[row][col].getScaledInstance(8, 8, Image.SCALE_SMOOTH), x + 6 * i, y, null);
		}
		return width;
	}
	public static void drawSmallRedString(Graphics2D g, String s, int x, int y) {
		s = s.toUpperCase();
		int width = s.length()*16;
		int height = 16;
		//g.setColor(Color.WHITE.darker());
		//g.fillRect(x, y, width+1, height+1);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 47) c = 36; // slash
			if(c == 58) c = 37; // colon
			if(c == 32) c = 38; // space
			if(c >= 65 && c <= 90) c -= 65; // letters
			if(c >= 48 && c <= 57) c -= 22; // numbers
			int row = c / RED_FONT[0].length;
			int col = c % RED_FONT[0].length;
			g.drawImage(RED_FONT[row][col].getScaledInstance(8, 8, Image.SCALE_SMOOTH), x + 8 * i, y, null);
		}
	}
}
