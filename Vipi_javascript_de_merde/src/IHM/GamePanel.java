package IHM;

import Controlleur.Controlleur;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	Image bg;
	public GamePanel()
	{
		if(bg == null)
			try {
				bg = ImageIO.read(GamePanel.class.getResource("../images/background.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Override
	public void paint(Graphics g)
	{
		g.drawImage(bg,0, 0, this.getWidth(), this.getHeight(),this);
		Controlleur.player.getImage().paintIcon(this, g, this.getWidth()/2, this.getHeight()-Controlleur.player.getHauteur()-10);
		for(Object o: Controlleur.terrain )
		{
			
		}
	}

}
