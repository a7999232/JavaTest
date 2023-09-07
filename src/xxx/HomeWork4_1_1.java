package xxx;

import java.util.Arrays;

public class HomeWork4_1_1 {

	public static void main(String[] args) {

//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)

		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < intArray.length; i++) {

			sum += intArray[i];

		}

		avg = sum / intArray.length;
		System.out.println("平均值為" + avg);
		Arrays.sort(intArray);
		System.out.println("大於平均值的元素為");
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] > avg) {

				System.out.print(intArray[i] + " ");

			}
		}

	}

}
