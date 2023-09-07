package xxx;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class HomeWork4_4 {

	public static void main(String[] args) {
//	班上有8位同學,他們進行了6次考試結果如下:
//
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)

//		int[][] scores = {
//			{ 1, 10, 37,100, 77, 98, 90 },
//			{ 2, 35, 75, 70, 95, 70, 80 },
//			{ 3, 40, 77, 79, 70, 89,100 },
//			{ 4,100, 89, 90, 89, 90, 75 },
//			{ 5, 90, 64, 75, 60, 75, 50 },
//			{ 6, 85, 75, 70, 75, 90, 20 },
//			{ 7, 75, 70, 79, 85, 89, 99 },
//			{ 8, 70, 95, 90, 89, 90, 75 } };
					    
		int[][] scores = {	
				{ 10, 35, 40,100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100,70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80,100, 75, 50, 20, 99, 75 } };
		
		int studentCode=0;
		int highScore=0;
		int studentCnt[]=new int[8];
		
		for(int i =0;i<scores.length;i++) {
			for(int j =0; j<scores[i].length;j++) {
				
				if(scores[i][j]>highScore) {
					highScore=scores[i][j];
					studentCode=j;		
					
				}
				
			}
			studentCnt[studentCode]++;
			highScore=0;
			studentCode=0;
		}
		
		for(int i =0;i<8;i++) {
			System.out.println(i+1+"號同學最高分的次數為"+studentCnt[i]);
		}
				
	}
}