package xxx;

public class TestNineNine {

	public static void main(String[] args) {

//		======使用for迴圈+while迴圈=======
		
		for (int i = 1; i <= 9; i++) {
			int j = 1;

			while (j < 9) {
				j++;

				System.out.print(i + "*" + j + "=" + i * j + "\t");

			}
			System.out.println();

		}
		System.out.println("==========================");
//		======使用for迴圈+do while迴圈=======
		

		for (int i = 1; i <= 9; i++) {

			int j = 1;

			do {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			} while (j < 9);

			System.out.println();
		}
		System.out.println("==========================");

//		======使用while迴圈+do while迴圈=======
		int i = 0;
		while (i < 9) {

			i++;

			int j = 1;
			do {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			} while (j < 9);
			System.out.println();
		}

	}
}
