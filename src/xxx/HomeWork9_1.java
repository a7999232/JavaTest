package xxx;

public class HomeWork9_1 extends Thread {
//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.java
//	• 需留意主執行緒執行順序

	private String name;

	

	public HomeWork9_1() {

	}

	public HomeWork9_1(String name) {
		this.name = name;
	}

	
	
	public void run() {
		
		int counter = 0;
		
		while (counter < 10) {
			counter++;
			System.out.println(name + "吃了第" + counter + "碗飯");
			if (counter == 10) {
				System.out.println(name + "吃完了");
			}
			try {
				Thread.sleep((int) (Math.random() * 2501) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		HomeWork9_1 t1 = new HomeWork9_1("饅頭人");
		HomeWork9_1 t2 = new HomeWork9_1("詹姆士");

		System.out.println("===大胃王比賽開始===");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("===大胃王比賽結束===");
	}
}
