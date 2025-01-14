package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
//		input("데이터를 입력하세요."); python
		
		// 입력을 받으려면
		// 1. Scanner 선언
		// 정수형 - nextInt, nextLong, nextByte(거의 안씀), nextShort(거의 안씀)
		// 실수형 - nextFloat(거의 안씀), nextDouble
		// 문자열 - next, nextLine :enter 입력받기 가능, nextBoolean(거의 안씀)
		// 입력을 위해서 객체선언을 해야함
		Scanner scan = new Scanner(System.in);
		
		
		// 문자열
		System.out.println("문자열을 입력하세요.");
		String str1 = scan.next();
		System.out.println("문자열1 :"+str1);
		scan.nextLine();
		
		System.out.println("문자열을 입력하세요.");
		String str2 = scan.nextLine(); // enter 까지 입력받음
		System.out.println("문자열2 :"+str2);
		
		
		
		// 정수형, 실수형
//		System.out.println("정수를 입력하세요.");
//		int num = scan.nextInt();
//		System.out.println("정수: "+num);
//		System.out.println("실수를 입력하세요.");
//		float f = scan.nextFloat();
//		double d = scan.nextDouble();
//		System.out.println("실수f: "+f);
//		System.out.println("실수d: "+d);
		
		
		

	}

}
