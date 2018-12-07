package Class;

public class Joueurs {
	private String login;
	private Integer score;
	
	public Joueurs(String login, Integer score) {
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
