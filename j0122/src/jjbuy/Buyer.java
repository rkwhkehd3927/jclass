package jjbuy;

public class Buyer {
	
	int money = 10000000; // 보유 금액
	int bonusPoint = 0; // 보유 포인트
	int wholePrice = 0; // 전체 구매 금액
	int count = 0; // 구매 개수
	Product[] cart = new Product[10]; // 장바구니 배열
	
	// 기본 생성자
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 나의 정보 메소드
	void myInfo() {
		System.out.printf("[ 보유금액: %d ]\n",money);
		System.out.printf("[ 보유포인트: %,d ]\n",bonusPoint);
	}
	
	
	// 구매 메소드
	void buy(Product p) {
		System.out.printf("%s를 구매했습니다.",p.name);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		count++; // 구매 상품 개수 +1
		wholePrice += p.price; // 총 구매 금액
	
	}
	
	// 카트 보기 메소드
	void cartInfo() {
		System.out.println("[ 구매목록 ]");
		for(int i=0;i<count;i++) {
			if(i<0){
				System.out.printf("%s, ",cart[i].name);
			} else {
				System.out.println("카트 정보가 더이상 없습니다.");
				break;
			}
		}
	}
}
