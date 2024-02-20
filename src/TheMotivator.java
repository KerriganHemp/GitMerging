import java.util.ArrayList;

public class TheMotivator {
	private ArrayList<String> scores = new ArrayList<String>();
	
	public void addScore() {
		scores.add("Sally got a 60");
		scores.add("Steve got a 95");
		
		for (String score : scores) {
			System.out.println(score);
		}
	}
	
	public void scoreFeedback(int score) {
		System.out.println("Here's your feedback:");
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
	
	public void averageScore() {
		int[] scoreVals = new int[] {80, 85, 76, 92, 50, 67, 88};
		int averageScore = 0;
		for (int score : scoreVals) {
			averageScore = averageScore + score;
		}
		averageScore = averageScore / scoreVals.length;
		System.out.println(averageScore);
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.addScore();
		tm.scoreFeedback(100);
		tm.scoreFeedback(60);
		tm.passFail(60);
		System.out.println("Average score:");
		tm.averageScore();
	}
}
