package Controlleur;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Class.Joueur;

public class InitialisationJoueurs {
	
	static ArrayList<Joueur> initialisationJoueurs() {
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		try {
			InputStream f = new FileInputStream("Joueurs.txt");
			InputStreamReader fr = new InputStreamReader(f);
		    BufferedReader br = new BufferedReader(fr);
		    
		    try {
	        	String login = null;
	        	Integer score = null;
		        
		        while((login = br.readLine()) != null) {
		        	score = Integer.parseInt(br.readLine());
		        	joueurs.add(new Joueur(login, score));
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
