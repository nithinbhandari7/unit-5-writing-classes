import java.util.*;

public class RPSGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		String wantToPlay = "Y";
		String userWeapon;
		int compare;
		int bet;
		System.out.print("Please enter your first name: ");
		firstName = sc.next();
		System.out.print("Please enter your last name: ");
		lastName = sc.next();
		Player user = new Player(firstName, lastName);
		Player computer = new Player();
		System.out.print("Amount of money that you and the computer will start with: $");
		user.setCash(sc.nextInt());
		computer.setCash(user.getCash());
		
		while(user.getCash() > 0 && computer.getCash() > 0 && wantToPlay.equals("Y")) {
			System.out.println("You have: $" + user.getCash());
			System.out.println("The computer has: $" + computer.getCash());
			System.out.print("How much money do you want to bet: $");
			bet = sc.nextInt();
			while(bet > computer.getCash() || bet > user.getCash()) {
				System.out.print("Please re-enter a bet amount that is not greated than your cash or the computer's cash: ");
				bet = sc.nextInt();
			}
			user.bet(bet);
			computer.bet(bet);
			
			System.out.print("Choose Rock, Paper, or Scissors: ");
			userWeapon = sc.next();
			while(!(userWeapon.equals("Rock") || userWeapon.equals("Paper") || userWeapon.equals("Scissors"))) {
				System.out.print("Please choose either Rock, Paper, or Scissors only: ");
				userWeapon = sc.next();
			}
			user.setWeapon(userWeapon);
			computer.setWeapon();
			System.out.println("The computer chooses " + computer.getWeapon());
			
			compare = user.getWeapon().compareTo(computer.getWeapon());
			if(compare == 1) {
				user.win();
				computer.lose();
				System.out.println("You won the round!");
			} else if(compare == -1) {
				user.lose();
				computer.win();
				System.out.println("You lost the round!");
			} else {
				System.out.println("The round was a tie!");
			}
			if(user.getCash() > 0 && computer.getCash() > 0) {
				System.out.print("Do you want to continue to play? (Please answer with Y or N): ");
				wantToPlay = sc.next();
			}
		}
		System.out.println("");
		System.out.println(user.toString());
		System.out.println("");
		System.out.println(computer.toString());
	}
}
