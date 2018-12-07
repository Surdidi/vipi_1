package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Keys implements KeyListener{

	public List<Integer> keys = new ArrayList<Integer>();
	@Override
	public void keyPressed(KeyEvent arg0) {
		keys.add(arg0.getKeyCode());
		this.process();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		keys.remove((Object) arg0.getKeyCode());
		this.process();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}


	public void process()
	{
		if(keys.contains(KeyEvent.VK_LEFT))
			if(Controlleur.Controlleur.player.motionX> -10)
				Controlleur.Controlleur.player.motionX-=1;
		if(keys.contains(KeyEvent.VK_RIGHT))
			if(Controlleur.Controlleur.player.motionX< 10)
				Controlleur.Controlleur.player.motionX+=1;
		if(keys.contains(KeyEvent.VK_SPACE))
			if(Controlleur.Controlleur.player.motionY< 25)
				Controlleur.Controlleur.player.motionY+=25;

	}
}
