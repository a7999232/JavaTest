package xxx;

public class Student2 {

	int score;

	public void play(int hours) {

//		score = score - hours;
		score -= hours;
	}

	public void study(int hours) {
//		score = score + hours;
		score += hours;
	}

	public void showInfo() {
		System.out.println("成績為：" + score);

	}
}
