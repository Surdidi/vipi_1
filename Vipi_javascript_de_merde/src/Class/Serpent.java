package Class;

public class Serpent extends Mob {

	private int positionInit ;
	
	public Serpent(Integer positionX, Integer positionY, int positionInit) {
		super(positionX,positionY);
		this.positionInit = positionInit;
	}
	
	public void déplacement() {
		if(positionX < positionInit) {
			while(positionX != positionInit + 100) {
				positionX += 3 ;
				// a repaint
			}
		}
		else {
			while(positionX != positionInit - 100) {
				positionX = positionX - 3 ;
				// a repaint
			}
		}
	}
	
}
