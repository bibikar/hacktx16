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
		if(keypress == KeyEvent.VK_D){
			//go forward method.
		}
		if(keypress == KeyEvent.VK_W){
			//jump method.
		}
		if(keypress == KeyEvent.VK_A){
			//go left method.
		}
		if(keypress == KeyEvent.VK_SPACE){
			//fire gun method.
		}
		if(keypress == KeyEvent.VK_P){
			//pause game method
		}
		else{
			//do nothing method. 
		}
	public void keyReleased(KeyEvent txt){
		
	}
}
