package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ~~~ 로또 번호 입력 3개 받아 출력
//		int[] lotto = new int[3]; // 로또 번호
//		int[] input = new int[3]; // 입력 번호
		
//		for(int i=0;i<3;i++) {
	//		System.out.printf("%d번째 랜덤번호 입력.>> ",i+1);
	//		input[i] = scan.nextInt();
	//	}
	//	System.out.println(Arrays.toString(input));
		
		
		
		// ~~~~~~ 국어, 영어, 수학, 합계 3명의 학생 성적 입력
		String[] name = new String[3];
		int[][] score = new int[3][4];
		int[] input = new int[3]; // 입력 번호
		String[] title = {"이름","국어","영어","수학","합계","평균"};
//		int[] total = new int[3]; // (내가 total 구할라고 만들었던거...)
		double[] avg = new double[3];
		
		
		// 1. 성적 입력
		for(int i=0;i<score.length;i++) {
			
			// 이름 입력
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			
			int total = 0;
			for(int j=0;j<score[i].length-1;j++) {
//				System.out.printf("[%d][%d] 성적 입력 : ",i,j);
				System.out.printf("[%s] 성적 입력 : ",title[j+1]);
//				System.out.printf("%d번째 학생의 국어,영어,수학 순으로 성적 입력 : ",i+1);
				score[i][j] = scan.nextInt();
				total += score[i][j]; // 국영수 점수 합산
				if(j==2) {
					score[i][j+1] = total; // score 4열(합계)에 점수 입력 
					avg[i] = total/3.0;
				}
			}
		}
		// (내가 만든 합계 출력용ㅋㅎ)
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				total[i] += score[i][j];
//			}
//		}
//		System.out.print("합계 :");
//		System.out.println(Arrays.toString(total));
	
		// 2. 성적 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5]);
		System.out.println("------------------------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				
			}
			System.out.println(avg[i]+"\t");
		}
			
		

	}

}
