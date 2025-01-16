package j0116;

import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = 0; // 상금
		int count = 0; // 맞춘 개수
		int x=0,y=0; // x,y 좌표
		
		// 5,5 배열을 생성
		String[][] arr = new String[5][5];
//		int[] num = new int[25];
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		
		// 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp=num[0];
			num[0]=num[ran];
			num[ran]=temp;
		}
		
//		System.out.println(Arrays.toString(num)); // 1차원 번호 배열
		
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*i+j]+" ";
			}
		}
		
		// 뽑기 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
			
		}
		// 뽑기 출력
		int no = 0;
		while(no<10) {
			System.out.println("                     [뽑기게임]");
			System.out.println("----------------------------------------------------");
			System.out.printf("좌표 | \t0 \t1\t2\t3\t4\n");
			System.out.println("----------------------------------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d     \t",i);
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("----------------------------------------------------");
			
			// 좌표 입력 시, 숫자가 0-4 사이가 아니면 다시 입력해달라고 띄우기
			while(true) {
				System.out.println("X좌표(행)를 입력하세요. (종료:-1) >> ");
				x = scan.nextInt();
				
				
				System.out.println("Y좌표(열)를 입력하세요. >> ");
				y = scan.nextInt();
				
				if(x>=0 && x<=4 || y>=0 && y<=4) {
					break;
				} else {
					System.out.println("좌표를 잘못입력하셨습니다. 다시 입력하세요.");
				}
			}

			// 좌표 입력
			System.out.println("X좌표(행)를 입력하세요. >> ");
			x = scan.nextInt();
			System.out.println("Y좌표(열)를 입력하세요. >> ");
			y = scan.nextInt();
			System.out.printf("입력한좌표 : [%d,%d]\n",x,y);
			
			if(arr2[x][y].equals("1")) {
				arr[x][y]="당첨";
				switch(count) {
				case 0:
					money+= 100000000;
					break;
				case 1:
					money+= 200000000;
					break;
				case 2:
					money+= 400000000;
					break;
				case 3:
					money+= 800000000;
					break;
				case 4:
					money+= 1600000000;
					break;
				}
				count++;
			}else {
				arr[x][y]="꽝!";
			}
			System.out.printf("결과: %s \n",arr2[x][y]);
			System.out.printf("당신의 머니: %d \n",money);
			no++;
			
		}
		
		
		
		// 번호 출력
//		System.out.println("           [뽑기게임]");
//		System.out.println("---------------------");
//		System.out.printf("좌표 | 0\t1\t2\t3\t4\n");
//		System.out.println("---------------------");
//		for(int i=0;i<arr2.length;i++) {
//			System.out.printf("%d     |t");
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.printf("%s\t",arr2[i][j]);
//			}
//			System.out.println();
//		}

	}

}
