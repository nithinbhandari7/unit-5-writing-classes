public class Player {
	private String firstName;
	private String lastName;
	private int wins;
	private int losses;
	private int cashOnHand;
	private int currentBetAmount;
	private Weapon currentChoice;
	
	public Player() {
		firstName = "George";
		lastName = "Devol";
		currentChoice = new Weapon();
		wins = 0;
		losses = 0;
		cashOnHand = 0;
		currentBetAmount = 0;
	}
	
	public Player(String first, String last) {
		firstName = first;
		lastName = last;
		currentChoice = new Weapon();
		wins = 0;
		losses = 0;
		cashOnHand = 0;
		currentBetAmount = 0;
	}
	
	public void win() {
		wins += 1;
		cashOnHand += currentBetAmount;
	}
	
	public void lose() {
		losses += 1;
		cashOnHand -= currentBetAmount;
	}
	
	public void bet(int bet) {
		currentBetAmount = bet;
	}
	
	public void setCash(int cash) {
		cashOnHand = cash;
	}
	
	public String toString() {
		return "Player Name: " + firstName + " " + lastName + "\nCash: $" + cashOnHand + "\nWin/Loss Record: " + wins + "/" + losses;
	}
	
	public void setWeapon() {
		currentChoice.setWeapon();
	}
	
	public void setWeapon(String weapon) {
		currentChoice.setWeapon(weapon);
	}
	
	public int getCash() {
		return cashOnHand;
	}
	
	public Weapon getWeapon() {
		return currentChoice;
	}
}
