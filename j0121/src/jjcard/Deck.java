package jjcard;

//public class Deck {
class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	
//	Card[] c = new Card[52];
	
	
	// 번호 부여 메소드
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}// input
	
	
	// 매수 정해서 출력 메소드 - 전체: 52, cnt-> 출력 매수
	void print(int cnt) {
		for(int i=0;i<52;i++) {
			System.out.println(c[i]); // 객체 출력
		}
	}
	
	// 해당 번호 출력
	void print(Card c) {
		System.out.println(c);
	}
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*52);
			temp = c[0];
			c[0]=c[ranNum];
			c[ranNum] = temp;
		}
	}
	
	// 카드 뽑기
	Card pick(int no) {
		return c[no];
	}
} // class
