package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
//		int[] num = {1,9,13,28,5,20,7};
//		Integer[] num2 = {11,9,13,28,5,20,7};
//		System.out.println(Arrays.toString(num));
//		// 순차정렬
//		Arrays.sort(num); // 알아두기
//		System.out.println(Arrays.toString(num));
//		// 역순정렬
//		Arrays.sort(num2,Collections.reverseOrder()); // 안씀
//		System.out.println(Arrays.toString(num2));
		
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		String[] balls = new String[45];  // 번호 45개
		// 1-45 번호 저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+""; // +"" 붙여서 문자열(str)로 바꿔주기
		}
		
		int i=0;
		while(i<6) {
			System.out.println("        [로또 맞추기]");
			for(int j=0; j<balls.length; j++) {
				if(j%5==0) { // 5열로 만들기
					System.out.println();
				}
				System.out.print(balls[j]+"\t");
			}
			
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요. (입력: %d 번째) >> \n",i+1);
			input[i] = scan.nextInt(); 
			balls[input[i]-1] = "X";
		
			// e.g
			// 입력한 번호 5 -> 5번 자리 X를 입력
			// ball[input-1] = "X";
			
			i++;
		
		}
		
		// 입력한 번호 모두 출력
		System.out.println("입력한 번호"+Arrays.toString(input));
		
		
	}

}
