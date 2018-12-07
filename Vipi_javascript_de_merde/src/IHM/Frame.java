package IHM;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame()
	{
		this.setTitle("Divalto");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setContentPane(new GamePanel());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
