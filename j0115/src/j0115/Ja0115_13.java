package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞추기
		
		// 1-45 중 로또 번호 6개와 입력한 숫자 6개를 비교하여 맞춘 개수와 번호 출력
		
		// 1. 변수 선언
		// 2. 1-45 번호 저장
		// 3. 배열 섞기
		// 4. 6개 로또 번호
		// 5. 입력창 만들기 6개 입력번호
		// 6. 맞춘 번호 확인 - input,lotto
		// 7. 출력
		
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 선언
		int[] ball = new int[45]; // 1-45번 
		int[] lotto = new int[6]; // 뽑힌 로또 번호
		int[] input = new int[6]; // 내가 고를 번호
		int[] answer = new int[6]; // 로또 번호 = 내 번호 같으면 그 번호 넣을 배열
		int count = 0; // 맞춘 개수
		
		// 2. 공에 1-45 번호 저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}

		// 3. 배열 섞기
		int temp = 0; // 임시 공간 생성
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45); // ?
			temp = ball[0]; // 임시 공간에 숫자 옮기기(?)
//			System.out.println("temp:"+temp);
			ball[0] = ball[ranNum]; // 숫자 뺀 빈공간에 ranNum 번 넣기
//			System.out.println("ball[0]:"+ball[0]);
			ball[ranNum] = temp; // 빈 ranNum 자리에 맨처음 옮긴 숫자 넣기
//			System.out.println("ball[ranNum]:"+ball[ranNum]);
		}
		
		// 4. 6개 로또 번호
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i]; // 뽑힌 볼 lotto 배열에 넣기
		}
		System.out.println("로또번호 :"+Arrays.toString(lotto));
		
		// 5. 입력창 만들기 6개 입력번호
		String[] balls = new String[45]; // 콘솔창 출력용 번호 45개 넣을 배열
		// 1-45 번호 저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+""; // +"" 문자열 타입으로 출력
		}
		
		int k=0;
		while(k<6) {
			System.out.println("            [로또 맞추기]");
			for(int j=0;j<balls.length;j++) {
				if(j%5==0) {
					System.out.println();
				}
				System.out.print(balls[j]+"\t");
			}
			System.out.println();
			System.out.printf("예측 번호를 입력하세요. (입력 %d 번째) >> \n",k+1);
			input[k] = scan.nextInt(); // 입력한 번호 input 배열에 넣기
			balls[input[k]-1] = "X"; // balls 에 있는 번호는 X로 바꾸기
			k++;
		}
		
		// 6 맞춘 번호 확인 - input,lotto
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = lotto[j];
					count += 1;
					break; // j로 도는 for문을 나감
				} 
			}
		}
		
		// 7. 출력
		System.out.println("[로또 번호 확인]");
		System.out.print("로또 번호: ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("예측 번호: ");
		System.out.println(Arrays.toString(input));
		System.out.print("맞춘 개수: ");
		System.out.println(count);
		System.out.print("맞춘 번호: ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
