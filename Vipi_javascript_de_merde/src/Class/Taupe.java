package Class;

public class Taupe extends Mob{
	private int positionInit ;
	
	public Taupe(Integer positionX, Integer positionY, int positionInit) {
		super(positionX,positionY);
		this.positionInit = positionInit ;
	}
	
	public void premier_dep() {
		while( this.getPositionY() < 20) {
			this.setPositionY(this.getPositionY()+1);
		}
	}
}
