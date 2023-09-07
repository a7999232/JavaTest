package xxx;




public class PI {
	public static void main(String[] args) {
		final double  PI = 3.1415;
		double circumFerence = PI *5*2;
		double circleArea = Math.pow(5, 2)*PI;
		
		System.out.printf("圓周長 %.2f:",circumFerence);
		System.out.printf(", 圓面積 %.2f:",circleArea);
	}
}
