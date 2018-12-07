package Controlleur;

import Class.Vipi;
import IHM.Frame;

public class Controlleur {
	public static Object[] terrain = new Object[10]; 
	private static long timer = System.currentTimeMillis();
	public static Vipi player;
	public Controlleur() {
		
	}
	
	public static void main(String[] args){
		player = new Vipi();
		new Thread(new Runnable(){

			@Override
			public void run() {
				new Frame();
				
			}}).start();
		while(true)
		{
			if( System.currentTimeMillis() > timer+20)
			{
				timer = System.currentTimeMillis();
				
			}
		}
	}
}
