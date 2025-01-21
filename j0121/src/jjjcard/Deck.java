package jjjcard;

//public class Deck {
class Deck {
	
	Card[] c = new Card[52]; // 배열 선언
	
	// 번호 부여 메소드
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1); 
				
			}
//		System.out.println(c[i]);
		}
	}
	
	// 카드 전체 출력 메소드
	void print(int cnt) {
		for(int i=0;i<52;i++) {
			System.out.println(c[i]); // 객체 출력
		} 
	}

}

