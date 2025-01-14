package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		
		// 형변환
//		값의 타입을 다른 타입으로 변환
//		int -> char = (char)65;
//		char -> int = (int)'A';
//		float -> int = (int)10.0
		
		
		int n1 = 65; 
//		char ch1 = n1; // int 타입이 더 높음
		char ch1 = (char)n1; // int->char: 강제형변환, 변환하려는 타입을 붙여줌
		System.out.println(n1); // 65
		System.out.println(ch1); // A
		
		char ch2 = 'a';
		int n2 = (int)ch2; // char->int, int 안붙여도 에러 안남(변환하려는 타입 생략가능) 
		System.out.println(n2); // 97
		
		float f1 = 3.14f;
		int n3 = (int)f1;
		System.out.println(n3); // 3 -> 소수점 생략됨
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); // 10.0
		
		
		

	}

}
