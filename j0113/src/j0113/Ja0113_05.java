package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		
		// boolean - true,false
		// char - ''표시, 문자 하나, 아스키코드 값 : 65=A,97=a,48='0' ← 외우기
		// 정수형 - byte,short : 거의 사용 안함, 기본형 정수 - int : 그냥 값 입력
		// 정수형 - long : 접미사 L 붙여야 함
		// 실수형 - float : 접미사 F 붙여야함, double : D 붙여야하지만 생략 가능
		
		
		char ch = 'A';
		System.out.println(ch);
		
		// 아스키 코드
		
		char ch2 = '\u0041'; // 16*4 + 1*1 = 64 + 1 = 65
		System.out.println(ch2);

		
		char ch3 = 97;
		System.out.println(ch3); // a = 97
		
		char ch4 = '\t';
		System.out.println(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		
		boolean p = true;
		boolean p2 = false;
		
		
		long l = 100000000L; // long - L 무조건 붙여야함
		
		
		float f = 3.14F; // float - F 무조건 붙여야함
//		float f2 = 100.0;
		float f2 = 100F;
		double d = 3.14; // double - D 생략가능
		
		// 3.14e3f = 3140.0f , e = 10
		// 1e1 = 10.0
		
	 	
		
	}

}
