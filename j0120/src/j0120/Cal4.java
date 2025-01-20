package j0120;

import java.util.Scanner;

public class Cal4 {
	void input(String[] name,int[] kor) {
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("%d번째 학생의 이름을 입력하세요.",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 학생의 국어 점수를 입력하세요.",i+1);
			kor[i] = scan.nextInt();
		}
	}
}
 