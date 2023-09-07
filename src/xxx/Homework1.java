package xxx;

public class Homework1 {

	public static void main(String[] args) {

//		• 請設計一隻Java程式,計算12,6這兩個數值的和與積

		int i = 12, j = 6;

		System.out.println("和為" + (i + j) + " 積為" + i * j);

//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

		int egg = 200;

		System.out.println("200顆蛋共是" + egg / 12 + "打" + egg % 12 + "顆");

//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		int sec = 256559;

		System.out.print(sec / 86400 + "天");

		sec = sec % 86400;

		System.out.print(sec / 3600 + "小時");

		sec = sec % 3600;

		System.out.print(sec / 60 + "分");

		sec = sec % 60;

		System.out.println(sec + "秒");

//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

		final double PI = 3.1415;

		double radius = 5.0;

		System.out.printf("圓面積為%.4f,圓周長為%.3f", radius * radius * PI, radius * 2 * PI);
		System.out.println();

//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)

//          本利和＝期初本金×（1＋利率）期數次方。

		double PV = 1500000;

		for (i = 1; i <= 10; i++) {

			PV = (PV * 1.02);

		}
		System.out.println((int) PV + "元");

//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因

		System.out.println(5 + 5);  //兩個5都為整數常數 直接做數值運算 5+5=10
		
		
		
		System.out.println(5 + '5'); //5為整數常數, '5'字元char轉成int為53,5+53=58
		
		
		
		
		System.out.println(5 + "5"); // "5"為字串, 直接串接為55

		


		
		
	}

}
