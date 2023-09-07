package xxx;

public class day {

	public static void main(String[] args) {
		int sec = 256559;
		int day = sec / 86400;
		int hr = (sec % 86400) / 3600;
		int m = ((sec % 86400) % 3600) / 60;
		int s = ((sec % 86400) % 3600) % 60;

		System.out.println(day + "天" + hr + "小時" + m + "分鐘" + s + "秒");

	}
}