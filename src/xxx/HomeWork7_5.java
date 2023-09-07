package xxx;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HomeWork7_5 {
//	• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)
	
	
	
	
	public static void main(String[] args) throws Exception {
		File obj = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(obj);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(obj.getName() + "檔案內容如下");

		try {
			while (true) {
				((Animal2) ois.readObject()).speak();

			}
		} catch (Exception e) {
			System.out.println("資料讀取完畢!");
		}
		ois.close();
		fis.close();
	}
}