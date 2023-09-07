package xxx;

import java.util.Scanner;

public class HomeWork4_3 {

	public static void main(String[] args) {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

//	公元年份為4的倍數但非100的倍數，為366天閏年。
//	公元年份為400的倍數，為閏年。

		Scanner sc = new Scanner(System.in);

		int[] dayArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daysum = 0;
		System.out.println("請輸入西元 年 月 日");

		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
			dayArray[1] = 29;
		}

		if (day > dayArray[month - 1]) {
			System.out.println("日期不能超過" + dayArray[month - 1]);
		} else {
			for (int i = 0; i < month - 1; i++) {

				daysum += dayArray[i];

			}
			daysum+=day;
		}
		System.out.println("為" + year + "年的第" + daysum + "天");
	}

}
