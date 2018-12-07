package IHM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Class.Composant;
import Controlleur.Controlleur;
import inputs.Keys;

public class GamePanel extends JPanel{
	Image bg;
	BufferedImage temp;
	BufferedImage heart;
	public GamePanel()
	{
		this.addKeyListener(new Keys());
			try {
				if(bg == null)
				bg = ImageIO.read(GamePanel.class.getResource("../images/background.jpg"));
				if(temp == null)
				temp = ImageIO.read(GamePanel.class.getResource("../images/temp.png"));
				if(heart == null)
					heart = ImageIO.read(GamePanel.class.getResource("../images/heart.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Override
	public void paint(Graphics g)
	{
		g.drawImage(bg,0, 0, this.getWidth(), this.getHeight(),this);
		g.drawImage(Controlleur.player.getImage(), this.getWidth()/2, this.getHeight()-Controlleur.player.getHauteur()-Controlleur.player.getPositionY(), Controlleur.player.getLargeur(),Controlleur.player.getHauteur(),this);
		for(Composant o: Controlleur.terrain )
		{
			
		}
		this.paintUI(g);
	}
	
	
	private void paintUI(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(this.getWidth()-44, this.getHeight()-43-Controlleur.player.getHydratation()*50/121, 20,Controlleur.player.getHydratation()*50/121);
		g.drawImage(temp, this.getWidth()-60, this.getHeight()-100,60,60, this);
		for(int i = 0; i< Controlleur.player.getVie();i++)
		{
			g.drawImage(heart, this.getWidth()-70, this.getHeight()-200-(i*80),60,60, this);
		}
		
	}
}
