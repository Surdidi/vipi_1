package Class;

import java.io.IOException;

public class Obstacle extends Composant {
	
	public Obstacle(Integer positionX, Integer positionY, Integer hauteur, Integer largeur,String link) throws IOException {
		/*int alea = (int) (Math.random() * ( 1 - 0 )) ;
		if(alea == 0) {
			String img = 
		}*/
		super(positionX,positionY,hauteur,largeur,link);
	}
}
