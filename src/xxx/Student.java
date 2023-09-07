package xxx;

public class Student {

	
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
		System.out.println("為：" +score );
	}
	
	public static void main(String[] args) {

		Student a = new Student();

		Student b = new Student();

		a.score = 50;
		b.score = 60;

		a.play(2);
		a.study(3);

		b.study(3);
		b.play(4);

		a.showInfo();
		b.showInfo();
		
		
	}
}
