public class HiddenWord {
	private String answer;
	
	public HiddenWord(String userAnswer) {
		answer = userAnswer;
	}
	
	public String getHint(String guess) {
		String hint = "";
		for(int i = 0; i < guess.length(); i++) {
			if(answer.indexOf(guess.charAt(i)) == i) {
				hint += guess.charAt(i);
			} else if (answer.indexOf(guess.charAt(i)) >= 0) {
				hint += "+";
			} else {
				hint += "*";
			}
		}
		return hint;
	}
}