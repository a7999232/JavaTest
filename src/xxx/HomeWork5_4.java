package xxx;

public class HomeWork5_4 {

	public static void main(String[] args) {
//		身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//		genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		與數字的亂數組合,如圖:
		
		
		
		HomeWork5_4 myHomeWork = new HomeWork5_4();
		System.out.println("本次隨機產生驗證碼為:");
		System.out.print(myHomeWork.genAuthCode());

	}

	
	
	
	public String genAuthCode() {

		String string = new String("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890");
		String codeString = new String();
		for (int i = 0; i < 8; i++) {

			codeString += string.charAt((int) (Math.random() * string.length()));

		}

		return codeString;

	}

}
