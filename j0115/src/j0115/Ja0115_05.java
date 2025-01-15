package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어 점수 - 학생 5명의 국어,영어, 평균 성적을 입력하려고 함.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		

//		for(int i=0;i<name.length;i++) {
//			System.out.printf("%d 번째 이름을 입력하세요. \n",i+1);
//			name[i] = scan.next();
//			System.out.printf("%d 번째 국어점수를 입력하세요. \n",i+1);
//			kor[i] = scan.nextInt();
//			
//		}
//		
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(kor));
		
		
		// 이름, 국어, 영어를 입력받아 합계,평균(소수점 3자리) 출력 
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("%d 번째 이름을 입력하세요. \n",i+1);
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요. \n");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요. \n");
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2.0;
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(total));
		for(int i=0;i<avg.length;i++) {
			System.out.printf("%.3f \t",avg[i]);
		}
		
//		for(int i=0;i<avg.length;i++) {
//			System.out.printf("%d 학생의 국어: %d, 영어: %d, 합계: %d, 평균: %.3f ",name[i],kor[i],eng[i],avg[i]);
//			
//		}
		

	}

}
