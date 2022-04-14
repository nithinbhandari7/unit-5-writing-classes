public class Weapon implements Comparable<Weapon>{
	private String weapon;
	public Weapon() {
		int num = ((int)(3*Math.random())) + 1;
		if(num == 3) {
			weapon = "Rock";
		} else if (num == 2) {
			weapon = "Paper";
		} else if (num == 1) {
			weapon = "Scissors";
		}
	}
	
	public Weapon(String weapon) {
		if (!(weapon.equals("Rock") || weapon.equals("Paper") || weapon.contentEquals("Scissors"))) {
			throw new IllegalArgumentException();
		} else {
			this.weapon = weapon;
		}
	}
	
	public String toString() {
		return weapon;
	}
	
	public int compareTo(Weapon other) {
		if(this.weapon.equals("Rock") && other.weapon.equals("Scissors")) {
			return 1;
		} else if (this.weapon.equals("Scissors") && other.weapon.equals("Rock")) {
			return -1;
		} else if (this.weapon.equals("Scissors") && other.weapon.equals("Paper")) {
			return 1;
		} else if (this.weapon.equals("Paper") && other.weapon.equals("Scissors")) {
			return -1;
		} else if (this.weapon.equals("Paper") && other.weapon.equals("Rock")) {
			return 1;
		} else if (this.weapon.equals("Rock") && other.weapon.equals("Paper")) {
			return -1;
		} else if (this.weapon.equals(other.weapon)) {
			return 0;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void setWeapon() {
		int num = ((int)(3*Math.random())) + 1;
		if(num == 3) {
			weapon = "Rock";
		} else if (num == 2) {
			weapon = "Paper";
		} else if (num == 1) {
			weapon = "Scissors";
		}
	}
	
	public void setWeapon(String weapon) {
		if (!(weapon.equals("Rock") || weapon.equals("Paper") || weapon.contentEquals("Scissors"))) {
			throw new IllegalArgumentException();
		} else {
			this.weapon = weapon;
		}
	}

}
