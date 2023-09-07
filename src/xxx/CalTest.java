package xxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {

		while (true) {
			
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("請輸入x的值");
				int x = sc.nextInt();
				System.out.println("請輸入y的值");
				int y = sc.nextInt();

				Calculator ca = new Calculator();
				System.out.println(x + "的" + y + "次方等於" + ca.powerXY(x, y));
				break;

			} catch (CalException ce) {
				System.out.println(ce.getMessage());
				//小手套
			} catch (Exception ime) {
				System.out.println("輸入格式不正確");
				//大手套    
			}

		}

	}
}
