package hacktx16;
import javax.swing.*;
public class Main {
	public static void main(String[] args) {
		JFrame window = new JFrame("HACKTX 2016");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new GamePanel());
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}
}
