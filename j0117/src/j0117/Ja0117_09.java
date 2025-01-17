package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
	// 메소드
	int add(int a, int b) {
		int result = a+b;
		return result; // 타입이 꼭 같아야 합니댜!
	}
	
	boolean power; // 인스턴스 변수 - 객체 선언 후, 참조변수명.변수명
	void power() {
		power = !power;
	}
	
	// 메소드
	public static void main(String[] args) { // main(): 이름 뒤에 괄호가 있다? method
//		int a = 0; // 지역변수
//		Ja0117_09 j = new Ja0117_09(); // boolean power 사용하기 위해서 객체 선언
//		j.power = true;
//		System.out.println("j.power: "+j.power);
		
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		Cal c = new Cal(); // 객체선언
		
		//
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기: "+result); // 120
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기: "+result2); // 80
//		
//		c.mult(num, num2); // 2000
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2개의 값을 넘겨주면 메소드 3개
		// a,b -> a,b 에 각각 10을 더한 후, 두 수를 더하여 리턴
		// a,b -> a,b 에 각각 10을 곱한 후, 두 수를 더하여 리턴
		// a,b -> a,b 를 곱하여 리턴
		
		Scanner scan = new Scanner(System.in);
		
		Cal2 c = new Cal2(); // 객체 선언
		
		while(true) {
			
			System.out.println("숫자1을 입력하세요. >>");
			int a = scan.nextInt();
			System.out.println("숫자2를 입력하세요. >>");
			int b = scan.nextInt();
			
			// 입력이 -1이 들어오면 프로그램 종료
			
			if(a==-1 || b==-1) {
				System.out.println("-1 입력금지! 종료됩니다.");
				break;
			}
			
			int result = c.add1(a,b);
			System.out.println("add1: "+result);
			int result2 = c.mult(a,b);
			System.out.println("mult: "+result2);
			int result3 = c.add2(a,b);
			System.out.println("add2: "+result3);
			
				
			
		}
	
	}
	

}
