package j0115;

public class Ja0115_01 {

	public static void main(String[] args) {
//		int[] num = new int[10]; // 주소값 출력
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//		}
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
//		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		
		
//		int[] score;  // 배열 선언
//		score = new int[5]; // 배열 생성, 다섯개의 int 값을 저장할 수 있는 공간 생성
		
		
		// 배열에 데이터 넣기(배열은 한번 크기가 정해지면 더이상 값을 추가할 수 없음)
		// 값을 추가하려면 새로 선언해서 복사해야함
		// 1. 
//		int[] score = new int[10];
//		
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		
//		// 2.
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		// 3.
//		int[] score3 = new int[10];
//		for(int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
		
		
		// score 배열 100개를 만들어서, 1-100 까지 숫자를 입력해서 출력
		// 배열에 들어가 있는 숫자 합계 출력
		int[] score = new int[100];
		int sum = 0;
		// 1-10까지의 랜덤숫자를 입력해서 합계를 출력
		for(int i=0; i<100;i++) {
			score[i] = (int)(Math.random()*10)+1;
			System.out.println("랜덤숫자 : "+score[i]);
			sum += score[i];
			
		}
		System.out.println("합계:"+sum);
		
		
		
	}

}
