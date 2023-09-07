package xxx;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HomeWork3_3_Set {
	public static void main(String[] args) {
//		• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		//
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		Scanner sc2 = new Scanner(System.in);
		Set set = new HashSet();
		System.out.print("阿文...請輸入你討厭哪個數字?");

		while (true) {
			int count = 0;

			int num = sc2.nextInt();
			if (num / 10 != 0) {
				System.out.println("請重新輸入數字1~9");
				continue;
			}

			for (int i = 1; i <= 49; i++) {

				if (i % 10 != num && i / 10 != num) {
					set.add(i);
					count++;

					System.out.print(i + "\t");

					if (count % 7 == 0) {
						System.out.println();
					}
				}

			}

			System.out.println("總共有 " + count + " 個數字可選擇");
			System.out.println("======================================");
			System.out.println("幫你選6個");

		

				
			
			Iterator it = set.iterator();
			
			while (it.hasNext())

				System.out.print(it.next()+"\t");
		}

	}
}
