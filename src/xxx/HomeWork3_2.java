package xxx;

import java.util.Scanner;

public class HomeWork3_2 {

	public static void main(String[] args) {
//	• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

		int j = (int) (Math.random() * 101);

		Scanner sc = new Scanner(System.in);

		System.out.print("猜一個數字");

		while (true) {
			int i = sc.nextInt();
			if (i == j) {
				System.out.println("答對");
				break;

			} else if (i > j) {
				System.out.println("比" + i + "小");

			} else if (i < j) {
				System.out.println("比" + i + "大");

			}

		}
	}
}
