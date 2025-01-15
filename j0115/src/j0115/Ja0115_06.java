package j0115;

public class Ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개
		
		
		// 1-45 번호저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1; // 이렇게 하면 중복된 숫자 들어갈 수 있음
		}
		
		
		// 랜덤숫자, 배열 섞기
//		int ranNum = (int)(Math.random()*45)+1;
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45); // 0-44
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
			
		}
		
		// 섞인 배열 출력
				for(int i=0;i<ball.length;i++) {
					System.out.println(ball[i]+" ");
				}
				System.out.println();
		
	}

}
