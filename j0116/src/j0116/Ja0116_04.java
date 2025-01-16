package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		// 1. 5,5 배열 생성 - arr
		// 2. 뽑기 글자 입력
		// 3. 5,5 배열 생성 - arr2
		// 4. 25개 1차원 배열 생성
		// 5. 1차원 배열값 넣기 - 1,1,1,1,0,0...
		// 6. 배열 섞기
		// 7. 뽑기 배열 출력
		// 8. 번호 입력
		// 9. 당첨확인
		// 10. 최종결과
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Scanner scan = new Scanner(System.in);
		
		int money = 0; // 상금
		int count = 0; // 맞춘 개수
		int x=0, y=0; // x,y 좌표
		
		// 1. 5,5 배열 생성 - arr
		// 4. 25개 1차원 배열 생성
		// 5. 1차원 배열값 넣기 - 1,1,1,1,0,0...
		String[][] arr = new String[5][5]; 
//		int[] num = new int[25];
		int[] num = {1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1};
		
		
		
		// 3. 5,5 배열 생성 - arr2
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*1+j]+" ";
			}
		}
		
		
		// 6. 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0]=num[ran];
			num[ran]=temp;
		}
		
		System.out.println(Arrays.toString(num));
		
		// 2. 뽑기 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		// 7. 뽑기 출력
		int no = 0;
		while(no<10) {
			System.out.println("              [뽑기게임]");
			System.out.println("------------------------------");
			System.out.printf("좌표 | /t0 /t1/t2/t3/t4/n");
			System.out.println("------------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d     \t",i);
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s/t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			
			while(true) {
				System.out.println("X좌표(행)를 입력하세요. (종료:-1)>> ");
				x = scan.nextInt();
				System.out.println("Y좌표(열)를 입력하세요. >> ");
				y = scan.nextInt();
				
				if(x>=0 && x<=4 || y>=0 && y<=4) {
					break;
				} else {
					System.out.println("좌표를 잘못 입력했습니다. 다시 입력하세요.");
				}
				
			}
			
			// 번호 입력
			
			
		}
				
		
		
	}

}
