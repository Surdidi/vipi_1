package Controlleur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InitialisationJoueurs {
	
	public InitialisationJoueurs() {
		File f = new File ("../DataBase/Joueurs.txt");
		try {
		    FileReader fr = new FileReader(f);
		}
		catch (FileNotFoundException exception) {
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		
	}
}
