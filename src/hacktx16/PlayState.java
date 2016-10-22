package hacktx16;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

import hacktx16.entity.Player;
import hacktx16.map.Map;
import hacktx16.map.Platform;

public class PlayState extends GameState {
	
	Dimension dimension;
	Player player;
	Map map;
	
	public PlayState(GameStateManager gameStateManager, Dimension dimension) {
		// TODO Auto-generated constructor stub
		super(gameStateManager);
		this.dimension = dimension;
	}

	@Override
	public void init() {
		//player = new Player();
		map = new Map(dimension.getWidth() * 3, dimension.getHeight());
		map.addPlatform(new Platform (0,
				(int)dimension.getHeight(),
				(int)dimension.getWidth(),
				(int)dimension.getHeight()));
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, (int)dimension.getWidth(), (int)dimension.getHeight());
		g.setColor(Color.BLACK);
		map.draw(g);
		player.draw(g);
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		if(Keys.isPressed(Keys.ESCAPE)) {
			gsm.setPaused(true);
		}
	}

}
