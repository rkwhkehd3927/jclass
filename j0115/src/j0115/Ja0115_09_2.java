package j0115;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_09_2 {

	public static void main(String[] args) {
		
		//~~~~~~~ 선생님이 한거
		// 로또 번호 6개와 입력한 숫자 6개를 비교해서 맞춘 개수와 번호 출력 
		// 로또 번호 범위 1-45
		
		// e.g.
		// [로또 확인]
		// 로또 번호: 1 4 10 26 45 34
		// 입력 번호: 5 7 10 9 34 44
		// 맞춘 개수: 2
		// 맞춘 번호: 10 34
		
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];  // 번호 45개
		int[] lotto = new int[6];  // 로또번호 6개
		int[] input = new int[6];  // 입력번호 6개
		int[] answer = new int[6]; // 맞춘번호 6개
		int count = 0;  // 맞춘 개수?
		
		
		// 1-45 번호 저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 배열 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		// 6개 로또 번호
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		System.out.println("로또번호 : "+Arrays.toString(lotto));
		
		// 6개 입력번호
		for(int i=0;i<6;i++) {
			System.out.printf("%d 번째 번호를 입력하세요. >> \n",i+1);
			input[i] = scan.nextInt();
		}
		
		// 맞춘 번호 확인 - input,lotto
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = lotto[j];
					count++;
					break;
					
				}
			}
		}
		
		// 출력
		System.out.println("[로또 번호 확인]");
		System.out.print("로또 번호: ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("입력 번호: ");
		System.out.println(Arrays.toString(input));
		System.out.print("맞춘 개수: ");
		System.out.println(count);
		System.out.print("맞춘 번호: ");
		for(int i=0;i<input.length;i++) {
			
		}
	}

}
