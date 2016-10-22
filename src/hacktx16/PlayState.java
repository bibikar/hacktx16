package hacktx16;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class PlayState extends GameState {

	public PlayState(GameStateManager gameStateManager, Dimension dimension, int difficulty) {
		// TODO Auto-generated constructor stub
		super(gameStateManager);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		if(Keys.isPressed(Keys.ESCAPE)) {
			gsm.setPaused(true);
			//JukeBox.resumeLoop("music1");
		}
	}

}
