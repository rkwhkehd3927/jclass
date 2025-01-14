package j0114;

public class Ja0114_01 {

	public static void main(String[] args) {
		boolean temp = true; // 논리형
		char ch = 'a'; // 문자형
		byte n1 = 1; // 정수형
		short n2 = 2; // 정수형
		int num = 100; // 정수형
		long num2 = 10000L; // 정수형
		float f = 3.14F; // 실수형
		double d = 10.345; // 실수형
		String str = "abc"; // 문자열
//		String str2 = new String("abc"); 원래 이렇게 사용해야하는데 위처럼 사용할 수 있게 개발해줬음
		
		System.out.println(temp); // true
		System.out.println(ch); // a
		System.out.println(num); // 100
		
		// printf
//		System.out.printf("%d", temp); // error
		System.out.printf("논리형: %b \n", temp); // true
		System.out.printf("문자형: %c \n", ch); // a
		System.out.printf("정수형: %d, %d \n", num, num2); // 100, 10000
		System.out.printf("실수형: %.2f, %.2f \n", f, d); // 3.140000, 10.345000
		System.out.printf("문자열: %s \n", str); // abc
		
		

	}

}
