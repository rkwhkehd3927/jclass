package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// for : 반복횟수가 있는 경우
		// while : 조건식이 있을 경우 e.g. 100보다 작을때까지는 계속 도는데 5일때는 잠깐 멈춰... 뭐 이런....?
		
//		while 구구단 출력
		int i = 2;  // 초기값
		while(i<=9) { // 조건식
			System.out.printf("[ %d 단 ] \n",i);
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
				j++;
			}
			System.out.println(); // 줄단락
			i++; // 증감식
		}
		
		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n",i,j,i*j);
//			}
//		}
//		
		
		
		
		
//		int i = 1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
		
		
		// 입력받은 숫자부터 9단까지 구구단이 시작되도록 출력
		// 3,5 까지 5,3 3단~5단
		
//		System.out.println("숫자1을 입력하세요. ");
//		int num1 = scan.nextInt(); 
//		System.out.println("숫자2를 입력하세요. ");
//		int num2 = scan.nextInt(); 
//		
//		int max,min;
//		if(num1>num2) {
//			max = num1;
//			min = num2;
//		} else {
//			max = num2;
//			min = num1;
//		}
//		
//		max = Math.max(num1, num2); // max 함수, 둘중 큰수를 return 함
//		min = Math.min(num1, num2); // max 함수, 둘중 작은수를 return 함
//		
//		for(int i=min;i<=max;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.println("%d * %d = %d \n",i,j,i*j);
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		// for 조건식 없으면 무한 반복
//		for(;;) { // 무한반복
//		for(int i=0;;) { // 무한반복
//			
//			System.out.println("안녕"+i);
//		}
		
		
				
		// 입력받은 글자를 1개씩 출력하는 프로그램 구현
		
		// 모두 영문자일때만 1개씩 출력
		// e.g. aa1bb -> 출력 되면 안됨
				
		// 내가 한거

//		System.out.println("영문자를 입력하세요. >> ");
//		String str = scan.next(); 
//		char ch = str.charAt(0);
//		for(int i=0;i<str.length();i++) {
////			System.out.println(str.charAt(i));
//			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//				System.out.println(str.charAt(i));
//				
//			}
//			break;
//		}
//		
		
		//
//		int a = 3;
//		if(!(a>5)) {
//			
//		}
//		
////		1. 영문자인지 확인 -- abcde // 쌤이 하신거 
//		int temp = 0;
//		for(int i=0;i<str.length();i++) {
//			if (!(str.charAt(i)<'a' && str.charAt(i)>'z' || str.charAt(i)<'A' && str.charAt(i)>'Z')) {
//				temp = 1;
//				break;
//			}
//		} 
//		
//		2. 영문자이면 출력, 그렇지 않으면 다시 입력 후 출력
//		if(temp == 0) {
//			for(int i=0;i<str.length();i++) {
//				System.out.println(str.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자 중에 영문자가 아닌 것이 있습니다. 다시 입력하세요.");
//		}
//		
//		
		
		
//		단어를 1개씩 출력
//		String input = "abcdefghijk";
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
		
//		System.out.println("글자를 입력하세요. (영문자만 입력가능) :");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 :"+ch);
//		} else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.");
//		}
		
		
		// 반복문
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//			sum = sum + i;
//			sum += i;
//		}
//		System.out.println(sum); // 10100

	}

}
