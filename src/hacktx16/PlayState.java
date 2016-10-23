package hacktx16;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

import hacktx16.entity.Player;
import hacktx16.map.Camera;
import hacktx16.map.Map;
import hacktx16.map.Platform;
import hacktx16.map.PlatformLoader;

public class PlayState extends GameState {
	
	Dimension dimension;
	Player player;
	Camera camera;
	Map map;
	
	public PlayState(GameStateManager gameStateManager, Dimension dimension) {
		// TODO Auto-generated constructor stub
		super(gameStateManager);
		this.dimension = dimension;
	}

	@Override
	public void init() {
		camera = new Camera(0, 0, dimension.getWidth(), dimension.getHeight());
		player = new Player(1, "Player", 100, 10, 50, 50, 0, 0);
		map = new Map(dimension.getWidth() * 3, dimension.getHeight());
		map.setCamera(camera);
		camera.setMap(map);
		map.getPlatforms().addAll(PlatformLoader.loadTestPlatforms());
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		handleInput();
		map.tickAll();
		player.tick();
		camera.moveTo(player.getxPos(), player.getyPos());
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, (int)dimension.getWidth(), (int)dimension.getHeight());
		g.setColor(Color.BLACK);
		map.draw(g);
		player.draw(g, camera);
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		if(Keys.isPressed(Keys.ESCAPE)) {
			gsm.setPaused(true);
		}
		if (!Keys.isDown(Keys.A)) {
			player.setxVel(0);
		}
		if (!Keys.isDown(Keys.D)) {
			player.setxVel(0);
		}
		if (Keys.isDown(Keys.A)) {
			player.setxVel(-2);
			System.out.println("test");
		}
		if (Keys.isDown(Keys.D)) {
			player.setxVel(2);
			System.out.println("test2");
		}
	}

}
