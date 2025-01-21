package jjjcard;

//public class Card {
class Card {
	
	// 기본 생성자
	Card(){
		shape = 0;
		number = 1;
	}

	Card(int shape,int number){
		this.shape = shape;
		this.number = number;
	}
	
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	int shape;
	int number;
	
	
	@Override
	public String toString() {
		return String.format("[%s, %s]",s[shape],n[number]); // Card 출력 시, 기본 포맷
	}

}
