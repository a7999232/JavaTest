package xxx;

import java.io.File;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class HomeWork7_4 {
//	• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	
	
	

	public static void main(String[] args) throws Exception {

		File data = new File("C:\\data");

		if (!data.exists())
			data.mkdirs();

		File obj = new File("C:\\data\\Object.ser");
		if (!obj.exists())
			obj.createNewFile();

		Animal2 a1 = new Dog("1");
		Animal2 a2 = new Dog("2");
		Animal2 a3 = new Cat("3");
		Animal2 a4 = new Cat("4");

		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(a1);
		oos.writeObject(a2);
		oos.writeObject(a3);
		oos.writeObject(a4);

		oos.close();
		fos.close();

	}

}
