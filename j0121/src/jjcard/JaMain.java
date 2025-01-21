package jjcard;

//import java.util.*;
import java.util.Scanner;

public class JaMain extends Object {
	JaMain(){}

	public static void main(String[] args) {
		
//		Card c = new Card();
//		System.out.println(c);
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); // 카드 52장 생성
		Card[] my_card = new Card[5];
		int choice = 0;
		while(true) {
			System.out.println("[ 카드게임 ]");
			System.out.println("-------------");
			System.out.println("1. 카드 생성-번호부여");
			System.out.println("2. 카드 전체 출력");
			System.out.println("3. 카드 섞기");
			System.out.println("4. 카드 5장 받기");
			System.out.println("5. 내 카드 보기");
			System.out.println("6. 특정 위치 카드 출력");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			// 1. 카드 생성-번호부여
			case 1:
				d.input(); // 카드 번호 부여
				break;
			// 2. 카드 전체 출력
			case 2:
				System.out.println("[ 카드 52장 출력 ]");
				System.out.println("--------------------------");
//				int num = scan.nextInt();
				d.print(52); // 
				break;
			// 3. 카드 섞기
			case 3:
				d.shuffle();
				System.out.println("카드 섞기 완료!");
				break;
			// 4. 카드 5장 받기
			case 4: 
				for(int i=0;i<5;i++) {
					my_card[i] = d.pick(i);
				}
				System.out.println("카드 5개 받기 완료!");
				break;
			// 5. 내 카드 보기
			case 5:
				System.out.println("[ 내 카드 출력 ]");
				System.out.println("------------------------");
				for(int i=0;i<5;i++) {
					System.out.println(my_card[i]);
				}
				break;
			case 6:
				System.out.println("몇번째 카드를 가져오시겠습니까? >> ");
				int no = scan.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				break;
			}
		} // while
	}

}
