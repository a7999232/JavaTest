package xxx;


import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork10_3 {
//	• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)
//	年/月/日(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日,例如:20110131):");

		String num = sc.next();
		String regex = "^[0-9]{8}$";

		while (!num.matches(regex)) {

			System.out.println("數字格式不正確，請再次輸入一次!");
			System.out.println("請輸入日期(年月日,例如:20110131):");
			num = sc.next();
		}

		System.out.println("欲格式化成\n(1)年/月/日\n(2)月/日/年\n(3)日/月/年");

		String type = sc.next();
		String regex2 = "^[1-3]$";

		while (!type.matches(regex2)) {

			System.out.println("請輸入1 or 2 or 3");
			type = sc.next();
		}
		
		
		Date d1 = new SimpleDateFormat("yyyyMMdd").parse(num);
		
		switch (type) {
			case "1": {
	
				Format sfm1 = new SimpleDateFormat("yyyy/MM/dd");
				System.out.println(sfm1.format(d1));
				break;
			}
			case "2": {
	
				Format sfm2 = new SimpleDateFormat("/MM/dd/yyyy");
				System.out.println(sfm2.format(d1));
				break;
			}
			case "3": {
	
				Format sfm3 = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println(sfm3.format(d1));
				break;
			}

		}
	}
}
