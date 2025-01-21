package jcard;

public class Deck {
	// 카드에 사용되는 메소드
	
	// 기본 생성자
	Deck(){
		// 입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
		
		
	}
	
	// 변수 선언
	Card[] c = new Card[52]; // 카드 배열
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	// 카드 전체 출력 메소드
	void print_all(int no) {
		System.out.printf("[%d 개 출력]\n",no);
	}

	
	
}
