package Controlleur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Class.Joueur;

public class InitialisationJoueurs {
	
	static ArrayList<Joueur> initialisationJoueurs() {
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		try {
		    File f = new File("textfile");
		    FileReader fr = new FileReader(f);
		    BufferedReader br = new BufferedReader(fr);
		    
		    try {
		        String line = br.readLine();
		        
		        for(int i=0; line != null; i++) {
		        	String login = null;
		        	Integer score = null;
		        	
		            if(i%2!=0) {
		            	login = br.readLine();
		            } else {
		            	score = Integer.parseInt(br.readLine());
		            	joueurs.add(new Joueur(login, score));
		            }
		        }
		        
		        br.close();
		        fr.close();
		    }
		    catch (IOException exception) {
		        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		    }
		}
		catch (FileNotFoundException exception) {
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		return joueurs;
	}
}
