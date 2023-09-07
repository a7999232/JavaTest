package xxx;

import java.util.Scanner;

public class CubeTest {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入邊長");
				double i = sc.nextFloat();

				Cube c = new Cube();

				c.setLength(i);

				System.out.println("體積為" + c.getVolume());

				break;
			} catch (CubeException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("輸入格式不正確");
			}

		}
	}
}
