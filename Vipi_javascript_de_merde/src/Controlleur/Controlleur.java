package Controlleur;

import java.io.IOException;

import Class.Composant;
import Class.Vipi;
import IHM.Frame;

public class Controlleur {
	public static Composant[] terrain = new Composant[10]; 
	private static long timer = System.currentTimeMillis();
	public static Vipi player;
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
