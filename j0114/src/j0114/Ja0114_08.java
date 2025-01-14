package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {
		
		
		// 반복문을 사용하여 000~999 까지 출력
		// 000,001,002, ... 010,011, ... 999
		
		
//		for(int i=0;i<=1000;i++) { // 1000까지 출력
//			System.out.printf("%03d \n",i);
//			
//		}
		
		
//		for(int i=0;i<=9;i++) {
//			for(int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++) {
//					System.out.printf("%d%d%d \n",i,j,k);
//				}
//			}
//		}
		
		// 0.000000000 <= x < 1.0000000
//		double num = Math.random();
//		System.out.println(num);
		
		
		// 1-100 랜덤 숫자
//		for(int i=0;i<5;i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);
//		}
		
		
		
		
		
		// 1-100 까지 랜덤숫자를 입력받아, 10번을 입력하여 숫자 맞추기 게임 구현
		// 10번 이후에는 정답 공개
		
		Scanner scan = new Scanner(System.in);
		
//		int ran = (int)(Math.random()*100)+1;
//		for(int i=0;i<=10;i++) {
//			System.out.printf("숫자를 입력하세요.");
//			int num = scan.nextInt(); 
//			if(ran == num) {
//				System.out.printf("정답입니다.");
//				break;
//			} else {
//				System.out.printf("오답입니다. 다시 입력하세요.");
//				
//			}
//			
//		}
//		System.out.printf("정답은 :"+ran);
		
		
		// 강사님이 한거
//		int ran = (int)(Math.random()*100)+1;
//		int i = 0;
//		while(i<10) {
//			System.out.println("1-100 중 숫자를 입력하세요.");
//			int input = scan.nextInt();
//			if(ran>input) {
//				System.out.println("입력한 숫자가 더 작습니다. 큰수를 입력하세요.");
//			} else if(ran<input) {
//				System.out.println("입력한 숫자가 더 큽니다. 작은 수를 입력하세요.");
//			} else {
//				System.out.println("정답입니다.");
//				break;
//			}
//			i++;
//		}
//		System.out.printf("정답은 :"+ran);
		
		
		// 조건문: if,switch
		// 반복문: for,while
		// boolean, char, byte, short, int, long, float, double 기본형 타입
		// == 등가비교 가능
		
	
		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num == num2) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
		
		
//		String str = "안녕하세요.";
//		String str2 = "안녕.";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);

//		// 8가지 기본형 타입 이외의 비교는 .equals() 로 해줘야함. 
//		if(str==str4) { // 다릅니다. 로 나옴
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}	// 이렇게 하면안됨
		
		
//		if(str.equals(str4)) { // 같습니다.
//			System.out.println("equals 로 비교, 같습니다.");
//		}else {
//			System.out.println("equals 로 비교, 다릅니다.");
//		}
		
		
		// 파이썬에서는 list 주소값으로 비교
		// String 은 2개 이상의 값을 저장하기 때문에 비교가 안됨
		
		
//		if(str==str2) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------");
//		if(str==str3) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}	
		
		
		
//		String str = "홍길동";
//		String str2 = "홍길동";
//		System.out.println("이름을 입력하세요. >> ");
//		String input = scan.next();
		
////		if(str==input) {
//		if(str.equals(input)) {
//			System.out.println("홍길동이 맞습니다.");
//		} else {
//			System.out.println("홍길동이 아닙니다.");
//		}
//	
		
		
		// break: 반복문 중지
		// continue: 1번만 중지
		
		for(int i=2;i<=9;i++) {
			if(i==3) {
//					break; // 반복문 중지
				continue;
			}
			for(int j=1;j<=9;j++) {
//				if(j==3) {
////					break; // 반복문 중지
//					continue;
//				}
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}
		

	}

}
