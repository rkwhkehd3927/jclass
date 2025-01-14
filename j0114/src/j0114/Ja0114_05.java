package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 3개의 숫자를 입력받아, 가장 큰 수를 출력
		
		System.out.println("숫자1을 입력하세요.>> ");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력하세요.>> ");
		int num2 = scan.nextInt();
		System.out.println("숫자3을 입력하세요.>> ");
		int num3 = scan.nextInt();
		
		//
		int maxNum = num1>num2?((num1>num3)?num1:num3):(num2>num3?num2:num3);
		System.out.println("최대값 :"+maxNum);
		
		
		int minNum = (num1>num2)?(num2>num3?num3:num2):(num1>num3?num3:num1);
		System.out.println("최소값 :"+minNum);
		
		
		
		// 양수 0까지 포함, 음수
//		System.out.println("점수를 입력하세요.>> ");
//		int score = scan.nextInt();
//		String result = (score>=0)?"양수":"음수";
//		String result = (score>0)?"양수":(score==0)?"0":"음수";
//		System.out.println("결과: "+result);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("점수를 입력하세요.>> ");
//		int score = scan.nextInt();
//		String result = (score>=60)?"합격":"불합격";
//		System.out.println("결과: "+result);
//		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if((input>='a' && input <= 'z') || (input>='A' && input <= 'Z')){
//			System.out.println("영문자입니다.");
//		} else {
//			System.out.println("영문자가 아닙니다. 다시 입력해주세요.");
//		}
		
		
		
//		if(5>3) {
//			System.out.println("정답");
//		} else {
//			System.out.println("오답");
//		}
		
		
		
		// 올림-ceil, 버림-floor, 반올림-round
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//		
		// 3번째 자리에서 반올림하여 값 출력
//		System.out.println(Math.round(input*100/100.0));
		
		
//		System.out.println(Math.ceil(102.1120)); // 103.0
//		System.out.println(Math.floor(102.1120)); // 102.0
//		System.out.println(Math.round(102.1120)); // 102
		
		
		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
//		System.out.println(pi2); // 3.142
		 
		
		// 버림
//		float pi = 3.141592f;
//		float pi2 = (int)(pi*10)/10F;
//		System.out.println(pi2); // 3.1

	}

}
