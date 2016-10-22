package hacktx16.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public abstract class GameKeyListener extends JFrame implements KeyListener{
	
	JTextField x = new JTextField(80);
	
	GameKeyListener(){
	x.addKeyListener(this);
	setSize(500,500);
	setVisible(true);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void keyTyped(KeyEvent e){
		
	}
	public void keyPressed(KeyEvent e){
		
	}
	public void keyReleased(KeyEvent txt){
		
	}
}
