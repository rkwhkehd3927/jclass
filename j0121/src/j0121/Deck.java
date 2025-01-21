package j0121;

public class Deck {
	// 카드에 사용되는 메소드
	
	// 생성자
	Deck(){
		// 입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				// c[0] = new Card(); <- 지금 요 모양
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	
	// 변수 선언
	Card[] c = new Card[52]; // 카드 생성
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	
	
	// 카드전체 출력메소드
	void print_all(int no) {
		System.out.printf("[ %d 개 출력 ]\n",no);
		System.out.println("----------------------------");
		for(int i=0;i<4;i++) {
			System.out.printf("[%s,%s] \n",c[i].shape,n[c[i].number]);
			
		}
	}
	
	// 오버로딩
	void print_all(Card c) {
		System.out.println("[ 카드확인 ]\n");
		System.out.println("----------------------------");
		System.out.printf("[%s,%s] \n",c.shape,n[c.number]);
	}
	
	// 카드섞기 메소드
	void shuffle() {
		Card temp = null;
		int ranNum = 0;
		for(int i=0;i<300;i++) {
			ranNum = (int)(Math.random()*52);
			temp=c[0];
			c[0]=c[ranNum];
			c[ranNum]=temp;
		}
	}
	
	// 카드 선택 메소드
	Card pick(int no) {
		if(no>=1 && no<=52) {
			return c[no];
		} else {
			System.out.println("[경고!] 번호를 확인하셔야합니다.");
			return c[0];
		}
	}
	
	
	
//	final int CARD_NUM = 52;
//	Card[] c = new Card[CARD_NUM]; // 52장의 카드 생성, Card 배열
	

}
