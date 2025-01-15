package j0115;

import java.util.Scanner;

public class Ja0115_09 {

	public static void main(String[] args) {
		
		//~~~~~~~~~ 내가한거(망햇네ㅋㅎㅋ)
		// 로또 번호 6개와 입력한 숫자 6개를 비교해서 맞춘 개수와 번호 출력 
		// 로또 번호 범위 1-45
		
		// e.g.
		// [로또 확인]
		// 로또 번호: 1 4 10 26 45 34
		// 입력 번호: 5 7 10 9 34 44
		// 맞춘 개수: 2
		// 맞춘 번호: 10 34
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int[] lotto = new int[6]; // 랜덤 로또 번호 배열
		int[] myNum = new int[6]; // 내가 입력한 번호
		int count = 0; // 맞춘 번호 개수
		
		loop:while(i<6) {
			int ranNum = (int)(Math.random()*45)+1; // 1-45 중 랜덤 숫자
			for(int j=0;j<i;j++) {
				if(lotto[j]==ranNum) {
					System.out.println("동일한 숫자가 있음."+ranNum);
					continue loop;
				}
				
			}
			lotto[i] = ranNum;
			i++;
		}
		
		for(int j=0;j<6;j++) {
			System.out.println("예측 숫자 6개를 입력하세요.");
			int input = scan.nextInt();
			myNum[j] = input;
		}
		System.out.println("내가 예측한 번호는: "+myNum);
		
		
		for(int j=0;j<lotto.length;j++) {
			for(int e=0;e<lotto.length;e++) {
				if(lotto[e]==myNum[j]) {
					System.out.println("번호 있음.");
					count += 1; 
				} else {
					System.out.println("번호 없음.");
					continue;
				}
			}
		}
		
		System.out.println("로또 번호 : "+lotto);
		System.out.println("맞는 번호 개수 : "+count);

	}

}
