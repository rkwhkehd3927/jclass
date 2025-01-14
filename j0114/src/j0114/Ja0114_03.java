package j0114;

import java.util.Scanner;

public class Ja0114_03 {

	public static void main(String[] args) {
		
		// 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		
		System.out.printf("이름 : %s, 국어: %d \n", name, kor);
		
		// 영어, 수학, 합계(더하기), 평균까지 출력
		
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
		
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f \n",name,kor,eng,math,kor+eng+math,(kor+eng+eng)/3.0);
	
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f \n",name,kor,eng,math,total,avg);
		
	}

}
