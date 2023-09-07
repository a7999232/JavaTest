package xxx;

import java.util.Scanner;

public class RegexTest {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入");
		String tel =sc.next();
		
		String regex = "^[A-Za-z][12][0-9]{8}$";
		
		if(tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("n");
			
		}
		
		
		
		
	}
}
