package xxx;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HomeWork10_2 {
//	• 請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號,而輸入非任意數會顯示提示訊息如圖 (提示: TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)
//	• 補充 (依此類推):
//	輸入12345,千分位為12,345,輸入123,千分位為123
//	輸入0.75,百分比為75%,輸入1,結果為100%
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字:");
		String num = sc.next();
		String regex = "^[-]?[0-9]*(.)?[0-9]*$";

		while (!num.matches(regex)) {
			System.out.println("數字格式不正確，請再次輸入一次!");
			System.out.println("請輸入數字:");
			num = sc.next();
		}
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		
		String type = sc.next();
		String regex2 = "^[1-3]";
		while (!type.matches(regex2)) {
			System.out.println("數字格式不正確，請再次輸入一次!");
			System.out.println("請輸入數字1 or 2 or 3:");
			type = sc.next();
		}
		
		
		BigDecimal bd = new BigDecimal(String.valueOf(num));
		
		switch (type) {
		case "1":
			Format dfm1 = new DecimalFormat("#,###.##");
			System.out.println(dfm1.format(bd));
			break;
		case "2":
			Format dfm2 = new DecimalFormat("#.##%");
			System.out.println(dfm2.format(bd));
			break;
		case "3":
			Format dfm3 = new DecimalFormat("#.###E0");
			System.out.println(dfm3.format(bd));
			break;
		}
	}
}
