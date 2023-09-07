package xxx;

public class HomeWork10_1 {
//	請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否
//	為質數 (提示:Math類別)

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int r = (int) (Math.random() * 100) + 1;
			
			if(isPrime(r)) {
				System.out.println(r+"是質數");
			}else {
				System.out.println(r+"不是質數");
			}
			
		}

	}

	public static boolean isPrime(int r) {
		if (r <= 1) {
			return false;
		}
		for (int k = 2; k <= Math.sqrt(r); k++) {
			if (r % k == 0) {
				return false;
			}
		}
		return true;
	}
}
