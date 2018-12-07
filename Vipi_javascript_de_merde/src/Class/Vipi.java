package Class;

import java.io.IOException;

public class Vipi extends Composant {
	private Integer vie = 121;
	private Integer hydratation = 121;
	private Integer energie = 121;
	private boolean ch2019 = true;
	
	public Vipi() throws IOException {
		super(0, 0, 200, 200, "../images/totem.png");
	}
	
	public Integer getVie() {
		return vie;
	}
	
	public void setVie(Integer vie) {
		this.vie = vie;
	}
	
	public Integer getHydratation() {
		return hydratation;
	}
	
	public void setHydratation(Integer hydratation) {
		this.hydratation = hydratation;
	}
	
	public Integer getEnergie() {
		return energie;
	}
	
	public void setEnergie(Integer energie) {
		this.energie = energie;
	}
	
	public boolean isCh2019() {
		return ch2019;
	}
	
	public void changeCh2019() {
		if(this.ch2019 == true) {
			this.ch2019 = false;
		} else {
			this.ch2019 = true;
		}
	}
}
