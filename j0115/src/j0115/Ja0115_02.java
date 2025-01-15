package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아, 5개를 저장하고 5개의 값과 합계 출력
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		int total = 0;
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요. >> \n",i+1);
			score[i] = scan.nextInt();
			System.out.printf("%d번째 숫자: %d \n",i+1,score[i]);
			total += score[i];
			
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 숫자: %d \n",i+1,score[i]);
			
		}
		System.out.println("합계: "+total);
		
		

	}

}
