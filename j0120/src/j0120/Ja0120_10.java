package j0120;

import java.util.Scanner;

public class Ja0120_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		// 학생 성적
		Stuscore[] s = new Stuscore[10]; // 배열 선언
		int no=0,kor=0,eng=0,math=0,total=0,rank=0; // 저장 공간 생성
		int[] score = new int[3];
		String name = ""; // 저장 공간 생성
		double avg = 0; // 저장 공간 생성
		
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0, temp = 0, rankC = 0, count = 0; // 번호선택, 검색확인, 등수, 학생수 확인
		

		
		// 무한 반복
		loop:while(true) {
			// 화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수");
			System.out.println("0. 종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1: // 성적입력선택
				System.out.println("[학생성적입력]");
				// 입력
				while(count<10) { // 학생 10명
					
					// 이름
					System.out.printf("%d번째 학생의 이름을 입력하세요. (0.이전페이지로 이동)",count+1);
					name = scan.next(); // 이름 입력
					// "0" 인지 확인하기 - 이전페이지로 이동용
					if(name.equals("0")) {
						break;
					}
					
					// 국어, 영어, 수학
//					System.out.println("국어점수를 입력하세요.");
//					kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요.");
//					eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요.");
//					math = scan.nextInt();
//					s[count] = new Stuscore(name, kor, eng, math);
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s 점수를 입력하세요.",title[i+2]);
						score[i] = scan.nextInt();
					}
					
					// name,kor,eng,math 입력 시 -> no, total, avg 자동 입력됨
//					s[count] = new Stuscore(name,kor,eng,math);
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
					
					s[count].print();
					System.out.printf("%d번 학생이 저장되었습니다.", count+1);
					
					count++;
					
				} // while
				break;
			
			case 2: // 출력 선택
				// 출력
				System.out.println(" [학생성적] ");
				System.out.println("-------------------------------------");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s \t",title[j]);
				}
				System.out.println();
				System.out.println("-------------------------------------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d \t", s[j].no); // 번호
					System.out.printf("%s \t", s[j].name); // 이름
					System.out.printf("%d \t",s[j].kor); // 국어
					System.out.printf("%d \t",s[j].eng); // 영어
					System.out.printf("%d \t",s[j].math); // 수학
					System.out.printf("%d \t",s[j].total); // 합계
					System.out.printf("%.2f \t", s[j].avg); // 평균
					System.out.printf("%d \n", s[j].rank); // 등수
				}
				System.out.println();
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
				
//			case 3: // 수정 선택
//				System.out.println(" [학생성적수정] ");
//				System.out.println("-------------------------------------");
//				// 수정할 학생 이름 입력
//				System.out.println("수정할 학생 이름 입력 >> ");
//				String search = scan.next(); // 입력한 학생 이름
//				
//				// name 배열
//				temp = 0;
//				int searchNo = 0; // 학생 번호 찾기
//				for(int j=0;j<name.length;j++) {
//					if(search.equals(name[j])) { // 이미 등록된 이름과 입력한 이름을 비교
//						searchNo = j; // 위치값
//						temp = 1; // 값 검색 완료;
//					}
//				}
//				if(temp == 0) {
//					System.out.println("검색한 학생을 찾지 못했습니다.");
//				} else {
//					System.out.println();
//				}
				
				
			} // switch
			
		}
	}

}
