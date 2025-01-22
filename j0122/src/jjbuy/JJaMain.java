package jjbuy;

import java.util.Scanner;

import jbuy.Audio;
import jbuy.Computer;

public class JJaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로그인 구현
		// 보유한 금액과 보너스 포인트 설정
		
		Buyer b = new Buyer(); // b 10000000, 0
		
		
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
				b.buy(new Tv()); // 구매
				b.myInfo();// 보유금액, 보유포인트 출력
				break;
			case 2:
				b.buy(new Computer()); // 구매
				b.myInfo(); // 보유금액, 보유포인트 출력
				break;
				
			case 3:
				b.buy(new Audio()); // 구매
				b.myInfo(); // 보유금액, 보유포인트 출력
				break;
				
			case 9:
				b.cartInfo();
				break;
				
			case 0:
				break loop;
				
			} // switch
		}
	}

}
