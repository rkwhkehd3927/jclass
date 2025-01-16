package j0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 1. 변수 선언
		// 2. 화면 구현
		// 3. 메뉴(번호) 선택 - switch
		// 4. 학생 성적 입력
		// 5. 학생 성적 출력
		// 6. 학생 성적 수정
		// 7. 등수처리
		// 8. 종료
		
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 선언
		int count = 0; // 학생 수
		int[] no = new int[10]; // 학생 번호 - count 를 넣어줄거임
		String[] name = new String[10]; // 이름
		int[][] score = new int[10][4]; // 국어, 영어, 수학
		double[] avg = new double[10]; // 평균
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] rank = new int[10]; // 등수 
		
		int choice = 0, temp = 0, rankC = 0;
		
		// 무한반복
		
		loop:while(true) {
			
			// 2. 화면 구현
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수");
			System.out.println("0. 종료");
			System.out.println("---------------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			// 3. 메뉴(번호) 선택 - switch
			switch (choice) { // 메뉴 선택
			
			// 4. 학생 성적 입력
			case 1: // 성적입력 선택 시,
				System.out.println("[ 학생 성적 입력 ]");
				// 입력
				int i = count;
				while(i<10) { // 학생 10명
					
					// 번호
					no[i] = count+1; // 학생 번호 넣어주기
					
					// 이름
					System.out.printf("[%d 번째] 학생의 이름을 입력하세요. (0. 이전페이지 이동) ",no[i]);
					name[i] = scan.next(); // 이름 입력
					
					// "0" 인지 확인하기 - 이전페이지로 이동용
					if(name[i].equals("0")) {
						break;
					}
					
					// 국어, 영어, 수학
					int total = 0;
					for(int j=0; j<3; j++) {
						System.out.printf("%s 점수를 입력하세요. \n",title[j+2]);
						score[i][j] = scan.nextInt();
						total += score[i][j]; // 점수 3개 합쳐주기
					}
					// 합계, 평균
					score[i][3] = total; // score 행의 각 마지막 방에 합계 넣어주기
					avg[i] = total/3.0;
					
					System.out.printf("%d 번 학생이 저장되었습니다.",count+1);
					
					i++;
					count++;
				} // while 학생 10명
				break;
			
			// 5. 학생 성적 출력
			case 2: // 출력 선택
				// 출력
				System.out.println("            [ 학생 성적 ]");
				System.out.println("------------------------------------------------");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s \t",title[j]);
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				for(int j=0;j<count;j++) { // 10명의 학생
					System.out.printf("%s \t",no[j]); // 번호
					System.out.printf("%s \t",name[j]); // 이름
					for(int k=0; k<4;k++) {
						System.out.printf("%s\t",score[j][k]); // 국어,영어,수학
					}
					System.out.printf("%.2f\n",avg[j]); // 평균
				}
				System.out.println();
				break;
				
			// 6. 학생 성적 수정
			case 3: // 수정 선택
				System.out.println("[ 학생 성적 수정 ]");
				System.out.println("------------------------------------------------");
				// 수정할 학생 이름 입력
				System.out.println("수정할 학생 이름 입력 >> ");
				String search = scan.next(); // 입력한 학생 이름
				
				// name 배열
				temp = 0;
				int searchNo = 0; // 학생 번호 찾기
				for(int j=0;j<name.length;j++) {
					if(search.equals(name[j])) { // 내가 입력한 이름이랑 등록되어 있는 이름이랑 같은거 있는지 비교
						searchNo = j; // 배열 속 방 위치값
						temp = 1; // 값 검색 완료 = 찾았으면 이거 값 +1 해주기
						
					}
				}
				
				if(temp == 0) { // 못찾았으면
					System.out.println("검색한 학생을 찾지 못했습니다.");
				} else {
					System.out.printf(" [ %s 학생 성적 수정 ] \n",search); // 입력한 이름
					System.out.println("1. 국어 점수 수정");
					System.out.println("2. 영어 점수 수정");
					System.out.println("3. 수학 점수 수정");
					System.out.println("------------------------------------------------");
					System.out.println("원하는 번호를 입력하세요. >> ");
					choice = scan.nextInt();
					switch (choice) { // 수정 과목 선택
					case 1:
						System.out.println("[국어 점수 수정]");
						System.out.printf("현재 점수 : %d \n",score[searchNo][0]);
						System.out.println("수정할 점수를 입력하세요. >> ");
						score[searchNo][0] = scan.nextInt();
						break;
					case 2:
						System.out.println("[영어 점수 수정]");
						System.out.printf("현재 점수 : %d \n",score[searchNo][1]);
						System.out.println("수정할 점수를 입력하세요. >> ");
						score[searchNo][1] = scan.nextInt();
						break;
					case 3:
						System.out.println("[수학 점수 수정]");
						System.out.printf("현재 점수 : %d \n",score[searchNo][2]);
						System.out.println("수정할 점수를 입력하세요. >> ");
						score[searchNo][2] = scan.nextInt();
						break;
					
					} // switch 과목 선택
					
					// 합계 다시 더해주기
					score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
					// 평균 다시 구해주기
					avg[searchNo] = score[searchNo][3]/3.0;
				}
				break;
			case 4: // 등수처리
				System.out.println("[ 등수 처리 ]");
				for(int j=0;j<count;j++) { // count -> 학생수
					rankC = 1; // 돌 때마다 리셋되어야 해서 1
					for(int k=0;k<count;k++) {
						if(score[j][3]<score[k][3]) { // 학생들 평균 끼리 비교
							rankC += 1;
						}
					}
					rank[j] = rankC; // 랭크에다가 등수 넣어주기
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			} // switch
		
		
		} // while 무한반복
		
		

	

	}

}
