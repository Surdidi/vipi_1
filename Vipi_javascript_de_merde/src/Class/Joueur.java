package Class;

public class Joueur {
	private String login;
	private Integer score;
	
	public Joueur(String login, Integer score) {
		this.login = login;
		this.score = score;
	}
	
	public Integer getScore() {
		return score;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public String getLogin() {
		return login;
	}
}
