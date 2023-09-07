package xxx;

public class HomeWork2 {

	public static void main(String[] args) {

//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

		int sum1 = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 += i;

			}

		}
		System.out.println(sum1);

//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;

		}
		System.out.println(sum2);

//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int sum3 = 1;
		int i = 1;

		while (i <= 10) {
			sum3 *= i;
			i++;

		}
		System.out.println(sum3);

//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100

		for (int i1 = 1; i1 <= 10; i1++) {

			System.out.print(i1 * i1 + " ");

		}
		System.out.println();

//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		for (int i2 = 1; i2 <= 49; i2++) {

			if (i2 % 10 != 4 && i2 / 10 != 4) {

				count++;
				System.out.print(i2 + " ");
			}

		}
		System.out.println();
		System.out.println("總共" + count + "個");

//	• 請設計一隻Java程式,輸出結果為以下:

//	1 2 3 4 5 6 7 8 9 10  
//	1 2 3 4 5 6 7 8 9     
//	1 2 3 4 5 6 7 8      
//	1 2 3 4 5 6 7         
//	1 2 3 4 5 6           
//	1 2 3 4 5             
//	1 2 3 4               
//	1 2 3                 
//	1 2                   
//	1                     
//	
		for (int x = 10; x > 0; x--) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

//	
//	• 請設計一隻Java程式,輸出結果為以下:
//		A            
//		BB           
//		CCC          
//		DDDD         
//		EEEEE        
//		FFFFFF       

		for (char i3 = 'A'; i3 <= 'F'; i3++) {
			for (char j = 'A'; j <= i3; j++) {
				System.out.print(i3);

			}
			System.out.println();
		}

	}

}