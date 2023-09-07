package xxx;

public class HomeWork5_1_2 {
	public static void main(String[] args) {

//		• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		randAvg();
	}

	
	
	
	public static void randAvg() {

		double sum = 0;
		double avg = 0;
		System.out.println("本次亂數結果");
		for (int i = 0; i < 10; i++) {
			int randomI = (int) (Math.random() * 101);
			sum += randomI;

			System.out.print(randomI + " ");

		}
		avg = sum / 10;
		System.out.print("\n平均值為:");
		System.out.println(avg);

	}

}
