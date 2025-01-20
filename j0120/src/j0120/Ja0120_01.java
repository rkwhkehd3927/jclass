package j0120;

public class Ja0120_01 {
	
	static int a = 10; // 클래스변수(객체선언필요x, 클래스명.변수명)

	public static void main(String[] args) {
		Data d = new Data(); // 객체 선언
		d.x = 10;
		System.out.println("d.x: "+d.x); // 10
		System.out.println("d: "+d); // 10
		change(d); // 같은 method 안에 있으면 클래스명 생략 가능
		System.out.println("d.x: "+d.x); // 10
		
		// Ja0120_01.change(d.x);
//		change(d.x); // 같은 method 안에 있으면 클래스명 생략 가능
//		System.out.println("d.x: "+d.x); // 10
		

	}
//	static void change(int x) {
//		x = 1000;
//		System.out.println("x: "+x); // 1000
//	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x: "+d.x); // 1000
	}

}
