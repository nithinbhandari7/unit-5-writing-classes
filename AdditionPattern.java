public class AdditionPattern {
	private int originalNumber;
	private int currentNumber;
	private int increase;

	public AdditionPattern(int userNum, int userIncrease) {
		originalNumber = userNum;
		currentNumber = userNum;
		increase = userIncrease;
	}
	
	public int currentNumber() {
		return currentNumber;
	}
	
	public void next() {
		currentNumber += increase;
	}
	
	public void prev() {
		if(currentNumber > originalNumber) {
			currentNumber -= increase;
		}
	}
}
