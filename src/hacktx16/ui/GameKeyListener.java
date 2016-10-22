package hacktx16.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public abstract class GameKeyListener extends JFrame implements KeyListener{
	
	public void keyTyped(KeyEvent e){
		
	}
	public void keyPressed(KeyEvent e){
		int keypress = e.getKeyCode();
		if(keypress == KeyEvent.VK_RIGHT){
			//go forward method.
		}
		if(keypress == KeyEvent.VK_UP){
			//jump method.
		}
		if(keypress == KeyEvent.VK_LEFT){
			//go left method.
		}
		if(keypress == KeyEvent.VK_DOWN){
			//crouch method.
		}
		if(keypress == KeyEvent.VK_SPACE){
			//fire gun method.
		}
		if(keypress == KeyEvent.VK_P){
			//pause game method
		}
	}
	
	public void keyReleased(KeyEvent txt){
		
	}
}
