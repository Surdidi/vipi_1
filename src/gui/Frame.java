package gui;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame()
	{
		this.setTitle("Divalto");
		this.setSize(800,400);
		this.setLocationRelativeTo(null);
		this.setContentPane(new GamePanel());
		this.setVisible(true);
	}

}
