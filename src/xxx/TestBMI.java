package xxx;

public class TestBMI {

	public static void main(String[] args) {

		double m = 1.75;
		double kg = 60.0;

		double bmi = kg / (m * m);

		System.out.println(bmi);
		System.out.printf("bmi=%.3f%n", bmi);

		if (bmi < 18.5) {
			System.out.println("過瘦");
		}

		else if (bmi >= 24) {
			System.out.println("過胖");
		} else {
			System.out.println("正常");
		}

	}

}
