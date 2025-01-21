package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// Card 52장을 생성한 후 1-13, Spade,Diamond,Heart,Clover 출력
		Deck d = new Deck();
//		System.out.printf("[%s,%s] \n",d.c[0].shape,d.c[0].number);
		
		// 전체출력
		d.print_all(52);
		
		// 섞기 실행
		d.shuffle();
		System.out.println("---------------------------------");
		
		
		// 10번째 카드를 선택
		Card c = d.pick(10);
		d.print_all(c);
		
		// 전체출력
		d.print_all(5);
//		d.print_all(1);
		
		
		
//		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		Card[] c = new Card[52]; // 카드 생성
//		String[] shape = {"Spade","Diamond","Heart","Clover"};
		
		// 입력 
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				// c[0] = new Card(); <- 지금 요 모양
//				c[i*13+j] = new Card(shape[i],j+1);
//			}
//		}
		
		
		// 출력
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				System.out.printf("[%s,%s] \n",c[i*13+j].shape,n[c[i*13+j].number]);
//			}
//		}
		
		
		// 카드를 섞어서 5장만 출력
//		c[0],c[1],c[2],c[3], ..., c[50],c[51]
//		Card temp = null;
//		int ranNum = 0;
//		for(int i=0;i<300;i++) {
//			int ran = (int)(Math.random()*52);
//			temp=c[0];
//			c[0]=c[ranNum];
//			c[ranNum]=temp;
//		}
//		
//		System.out.println("-----------------------------------");
//		System.out.println("[ 랜덤 섞기 후 출력");
//		for(int i=0;i<5;i++) {
//			System.out.printf("[%s,%s] \n",c[i].shape,n[c[i].number]);
//		}
		
		

	}

}
