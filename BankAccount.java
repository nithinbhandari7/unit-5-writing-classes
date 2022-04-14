import java.text.DecimalFormat;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private double interestRate;
	private double recentTransaction;
	
	public static final double MAX_WITHDRAWAL = 600;
	public static final double OVERDRAW_PENALTY = 30;
	private static int numAccounts = 0;
	
	public BankAccount() {
		numAccounts++;
		DecimalFormat acctFormat = new DecimalFormat("0000000000000000");
		accountNumber = acctFormat.format(numAccounts);
		balance = 0;
		interestRate = 0;
		recentTransaction = 0;
	}
	
	public void setInterestRate(double rate) {
		if(rate < 0 || rate > 1) 
			throw new IllegalArgumentException();
		interestRate = rate;
	}
		
	public void deposit(double amount) {
		if(amount <= 0) 
			throw new IllegalArgumentException();
		balance += amount;
		recentTransaction = amount;
	}
	
	public void withdraw(double amount) throws MaxWithdrawalException {
		if(amount <= 0 ) 
			throw new IllegalArgumentException();
		if(amount > MAX_WITHDRAWAL) 
			throw new MaxWithdrawalException();
		if(amount > balance)
			balance -= OVERDRAW_PENALTY;
		balance -= amount;
	}
	
	public void transferTo(BankAccount other, double amount) throws MaxWithdrawalException {
		this.withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		return "Account: " + accountNumber + "\nBalance: $" + balance;
	}
	
	public static void main(String[] args) throws MaxWithdrawalException {
		BankAccount myAcct = new BankAccount();
		myAcct.deposit(1000);
		BankAccount otherAcct = new BankAccount();
		myAcct.transferTo(otherAcct, 400);
		System.out.println(myAcct.toString());
		System.out.println(otherAcct.toString());
	}
}