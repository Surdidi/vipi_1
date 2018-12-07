package Controlleur;

import java.io.IOException;

import Class.Composant;
import Class.Vipi;
import IHM.Frame;

public class Controlleur {
	public static Composant[] terrain = new Composant[10]; 
	private static long timer = System.currentTimeMillis();
	public static Vipi player;
	public static Frame frame;
	public Controlleur() {

	}

	public static void main(String[] args){
		try {
			player = new Vipi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Runnable(){

			@Override
			public void run() {
				frame = new Frame();

			}}).start();
		while(true)
		{
			if( System.currentTimeMillis() > timer+20)
			{
				timer = System.currentTimeMillis();
				if(player.motionX > 0)
				{
					player.setPositionX(player.getPositionX()+1);
					player.motionX-=1;
				}
				if(player.motionX < 0)
				{
					player.setPositionX(player.getPositionX()-1);
					player.motionX+=1;
				}
				if(player.motionY > 0)
				{
					player.setPositionY(player.getPositionY()+1);
					player.motionY-=1;
				}
				if(player.motionY == 0)
				{
					player.setPositionY(player.getPositionY()-1);
					
				}
				if(frame != null)
					frame.repaint();

			}
		}
	}
}
