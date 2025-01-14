package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
//		char ch4 = 'AB'; 두 문자이상 불가
		String ch4 = "AB";
		System.out.println(ch4);
		
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); // 타입: String
		
		System.out.println(""+7); // str+int=str
		System.out.println(""+7+7); // 77
		
		System.out.println(7+7+""); // 14 지만 마지막에 str 을 더했기 때문에 타입은 String
		System.out.println(7+7+""+7); // 147
		
		
//		char ch5 = ''; // '' 사이에 없는 것은 에러
		char ch6 = ' '; // '' 사이에 빈공백은 문자로 인정 가능
		
		String s2 = ""; // str(문자열)은 공백 없어도 노상관
		String s3 = " "; // 공백 가능
		
		
		
//		정수의 오버플로우
//		byte b = 127; byte b = 128; -> 에러남 127 위는 -128
		
		byte b1 = 127;
//		byte b2 = 128; // error
//		b = b+1; // b 에 저장된 값을 1 증가 

		
		int n1 = 2147483647; // -2147483648 ~ 2147483647
//		int n2 = 2147483648;
		
		int n3 = n1+1;
		
		System.out.println(n3); // -2147483648
		
		
		


	}

}
