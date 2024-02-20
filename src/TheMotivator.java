
public class TheMotivator {
	public void scoreFeedback(int score) {
		if (score == 100)
			System.out.println("You're super awesome!");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void passFail(int score) {
		System.out.println("Did you pass or fail?");
		if (score >= 60) {
			System.out.println("You passed!");
		} else {
			System.out.println("You failed :(");
		}
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.scoreFeedback(100);
		tm.scoreFeedback(60);
		tm.passFail(60);
	}
}
