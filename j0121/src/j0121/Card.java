package j0121;

//public class Card {
class Card {
	
	// card
	Card(){}
	Card(String shape,int number){
		this.number=number;
		this.shape=shape;
	}
	
	
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"","Spade","Diamond","Heart","Clover"};
	int number;
	String shape;
	
	@Override
	public String toString() {
//		return super.toString();
		return "["+shape+","+n[number]+"]";
	}

}
