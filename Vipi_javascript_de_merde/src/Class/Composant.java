package Class;

import javax.swing.ImageIcon;

public class Composant {
	private Integer positionX;
	private Integer positionY;
	private Integer hauteur;
	private Integer largeur;
	private ImageIcon image;
	
	public Composant(Integer positionX, Integer positionY, Integer hauteur, Integer largeur, String linkImage) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.image = new ImageIcon(getClass().getResource(linkImage));
	}
	
	public Integer getPositionX() {
		return positionX;
	}
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
	
	public Integer getHauteur() {
		return hauteur;
	}
	
	public Integer getLargeur() {
		return largeur;
	}
	
	public ImageIcon getImage() {
		return image;
	}
	
	public boolean veri_touche (Vipi v) {
		int x = v.getPositionX();
		int y = v.getPositionY();
		if(x+v.getLargeur()> this.positionX && x < this.positionX + this.largeur) {
			if(y+v.getHauteur() < this.positionY) {
				return true ;
			}
		}
		return false ;
	}
	
}
