package jbuy;

import java.util.ArrayList;

//public class Buyer {
class Buyer {
	
	int count = 0; // 구매 개수
	int money = 10000000; // 보유 금액
	int bonusPoint = 0; // 보유 포인트
	int wholePrice = 0;
//	Product[] cart = new Product[10]; // 장바구니 배열
	ArrayList list = new ArrayList(); // 모든 객체를 저장하는 배열
	
	
	// 생성자
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint=  bonusPoint;
	}
	
	
	// 메소드() {} 중괄호의 유무
//	void aaa() {
//		 // 완성된 메소드
//	}
//	void bbb(); // 미완성 메소드
	
	
	// 나의 정보 메소드
	void myInfo() {
		System.out.printf("[ 보유금액: %d ]\n",money);
		System.out.printf("[ 보유포인트: %,d ]\n",bonusPoint);
	}
	
	// 구매 메소드
	void buy(Product p) {
		list.add(p);
//		if(count<10) {
//			cart[count] = p;
//		} else {
//			System.out.println("카트에 정보 저장은 되지 않으나 구매되었습니다ㅋㅎ");
//		}
//		System.out.printf("%s를 구매했습니다. \n",p.name);
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		count++; // 구매 상품 개수 +1
		wholePrice += p.price; // 총 구매 금액
		
	}
	
	// 장바구니 보기 메소드
	void cartInfo() {
		System.out.println("[ 구매목록 ]");
//		for(int i=0;i<count;i++) {
//			if(i<10) {
//				System.out.printf("%s, ",cart[i].name);
//			} else {
//				System.out.println("카트 정보가 더이상 없습니다.");
//				break;
//			}
//		}
		//~~~~ array list 로 할때
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s, ",((Product)list.get(i)).name);
		}
		System.out.println();
		System.out.printf("구매 상품 개수: %d개 \n",count);
		System.out.printf("총 구매 금액 : %,d원 \n",wholePrice);
	}
	
	
	
	
//	void buy(Tv t) {
//		System.out.println("TV를 구매했습니다.");
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		System.out.println("컴퓨터를 구매했습니다.");
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		System.out.println("컴퓨터를 구매했습니다.");
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
}
