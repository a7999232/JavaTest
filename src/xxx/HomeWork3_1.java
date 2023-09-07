package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {

	public static void main(String[] args) {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)

		System.out.print("輸入三個數字");
		Scanner sc = new Scanner(System.in);

		double[] Array1 = { sc.nextFloat(), sc.nextFloat(), sc.nextFloat() };
		Arrays.sort(Array1);

		double a = Array1[0];
		double b = Array1[1];
		double c = Array1[2];

		if (a + b <= c || a * b * c == 0) {
			System.out.print("不是三角形");

		}

		else if (a == b || a == c || b == c) {
			if (a == b && b == c) {
				System.out.print("正三角形");
			} else {
				System.out.print("等腰三角形");
			}

		}

		else if (a * a + b * b == c * c) {

			if (a == b || a == c || b == c) {
				System.out.print("等腰直角三角形");
			} else {
				System.out.print("直角三角形");
			}

		} else {
			System.out.print("其他三角形");
		}

	}

}
