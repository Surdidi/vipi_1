package inputs;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener{

	private static boolean[] keys = new boolean[128];

	public static boolean isPressed(int key) {
		return keys[key];
	}


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code < keys.length) {
			keys[code] = true;
		}
		this.process();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code < keys.length) {
			keys[code] = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}


	public void process()
	{

		if(keys[KeyEvent.VK_LEFT])
		{
			if(Controlleur.Controlleur.player.motionX> -10)
				Controlleur.Controlleur.player.motionX-=1;
		}
		if(keys[KeyEvent.VK_RIGHT])
		{
			if(Controlleur.Controlleur.player.motionX< 10)
				Controlleur.Controlleur.player.motionX+=1;
		}
		if(keys[KeyEvent.VK_SPACE])
		{
			if(Controlleur.Controlleur.player.motionY< 25)
				Controlleur.Controlleur.player.motionY+=25;
		}

	}
}
