package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		// 증감연산자
//		int a = 10;
//		int b = ++a; // 1을 먼저 증가시키고 그 값을 b에 넣기, 11
//		int b = a++; // a를 b에 먼저 넣고 a에 1 증가, 10
//		System.out.println("a:"+a); // 11
//		System.out.println("b:"+b); 
		
		
		// byte, short, char 의 경우 사칙연산을 하면 int타입으로 변경됨
		
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b);
//		byte d = (byte)a + (byte)b; // error
		
//		char ch = 'a'; // 아스키코드 97, A:65, 0:48
//		char ch2 = 'b'; // 아스키코드 98
//		char ch3 = ch+ch2; // error
//		int ch3 = ch+ch2; // 195
//		System.out.println("ch3: "+ch3); // 97+98=195
//		
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println(num); // 3
		
		
		
		// 이항연산자(?)
		
//		int a = 1000000;
//		int b = 2000000;
//		long c = a * b; // overflow 발생, 21억이 넘을 경우 long 타입으로 바꿔줘야함
//		long c = (long)a * b; // int * int = int, long+long = long
//		System.out.println("c:"+c); // 2000000000000
//		
//		
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long n3 = n1+n2; // overflow 발생
//		long n3 = (long)n1+n2;
//		System.out.println(n3); // 4100000000
//		
//		int d = 1000000 * 1000000 / 1000000; // d = -727, 앞에 곱셈에서 overflow 발생
//		int e = 1000000 / 1000000 * 1000000; // e = 1000000
		
		
		
//		char c1 = 'a'; // 97
//		char c1 = 'A'; // 65
//		char c2 = (char)(c1+1);
//		System.out.println(c2);
//		
//		int n1 = c1 + 1;
//		System.out.println(n1);
//	
//		char c3 = ++c1;
//		System.out.println(c3); // B
//		
//		int n2 = 'B' - 'A';
//		System.out.println(n2); // 1
//		
//		int n3 = '9' - '0';
//		System.out.println(n3); // 9 
//		
//		int n4 = '2' - '0';
//		System.out.println(n4); // 2
		
		
//		char ch1 = 'a';
//		char ch2 = (char)(ch1-32);
//		System.out.println(ch2); // A
//		
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4); // a
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
//		String str = scan.next();
		char str = scan.next().charAt(0); // 입력한 문자중 첫번째거 출력?
		str = (char)(str-32); // 대문자로 출력
		System.out.println(str);
		

	}

}
