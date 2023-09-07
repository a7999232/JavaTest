package xxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

	public static void main(String[] args) throws IOException {

		int row = 0;
		File file = new File("src\\xxx\\Sample.txt");
		FileReader f1 = new FileReader(file);
		FileReader f2 = new FileReader(file);
		BufferedReader br = new BufferedReader(f2);

		int c = 0;

		while (f1.read() != -1) {

			c++;
		}

		while (br.readLine() != null) {

			row++;

		}
		System.out.println("檔案共有" + file.length() + "個位元組,"  + c + "個字元,"+ row + "列資料");

		br.close();
		f2.close();
		f1.close();
	}

}
