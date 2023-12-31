package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork7_3 {
//	• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile(File f1, File f2) throws IOException {

		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int c;
		while ((c = bis.read()) != -1) {

			fos.write(c);
			fos.flush();

		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();

	}

	public static void main(String[] args) throws IOException {
		File f1 = new File("Data.txt");
		File f2 = new File("Datacopy.txt");
		copyFile(f1, f2);

	}
}
