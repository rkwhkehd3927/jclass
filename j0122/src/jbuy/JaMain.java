package jbuy;

import java.util.Scanner;

//public class JaMain {
class JaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로그인 구현
		// 보유한 금액과 보너스 포인트 설정
		
		Buyer b = new Buyer(); // b 100000000, 0
		
		
		loop:while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. Computer");
			System.out.println("3. Audio");
			System.out.println("9. 구매정보(cart)보기");
			System.out.println("0. 종료");
			System.out.println("구매를 원하는 메뉴의 번호를 입력. >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
//				Tv t = new Tv();
//				b.buy(t); // 구매 방법 1
				b.buy(new Tv()); // 구매 방법 2
//				System.out.printf("현재보유금액: %,d \n",b.money);
//				System.out.printf("현재보유포인트: %,d \n",b.bonusPoint);
				b.myInfo(); // 보유금액, 보유포인트 출력
				break;
			case 2:
				b.buy(new Computer()); // 구매
//				System.out.printf("현재보유금액: %,d \n",b.money);
//				System.out.printf("현재보유포인트: %,d \n",b.bonusPoint);
				b.myInfo(); // 보유금액, 보유포인트 출력
				break;
				
			case 3:
				b.buy(new Audio()); // 구매
//				System.out.printf("현재보유금액: %,d \n",b.money);
//				System.out.printf("현재보유포인트: %,d \n",b.bonusPoint);
				b.myInfo(); // 보유금액, 보유포인트 출력
				break;
				
			case 9:
				b.cartInfo();
				break;
				
			case 0:
				break loop;
			}
			
			
			
		
		
		} // while

	}

}
