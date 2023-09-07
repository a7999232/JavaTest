package xxx;

public class HomeWork4_1_3 {

	public static void main(String[] args) {

//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)

		int vowelcount = 0;
		String[] star = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length(); j++) {

				switch (star[i].charAt(j)) {
				case 'a':

				case 'e':

				case 'i':

				case 'o':

				case 'u':
					vowelcount++;
					break;

//				if (star[i].charAt(j) == 'a' || star[i].charAt(j) == 'e' || star[i].charAt(j) == 'i'
//						|| star[i].charAt(j) == 'o' || star[i].charAt(j) == 'u') {
					
				}
	
			}

		}
		System.out.println(vowelcount + "個母音");
	}

}
