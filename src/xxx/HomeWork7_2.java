package xxx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork7_2 {
//	• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("Data.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		for (int i = 0; i < 10; i++) {

			pw.println((int) (Math.random() * 1000) + 1);
			pw.flush();

		}
		pw.close();
		bw.close();
		fw.close();
	}

}
