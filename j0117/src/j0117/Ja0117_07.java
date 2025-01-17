package j0117;

public class Ja0117_07 {

	public static void main(String[] args) {
		
		Stu.count = 10; // 클래스 변수: 클래스명.변수명
//		Stu.id = "aaa"; // error
		System.out.println(Stu.count); // 객체 선언 없이도 가능 // 10
		
		Stu s1 = new Stu(); // 객체 선언
		s1.id = "aaa"; // 인스턴스(객체) 변수: 객체 선언 후, 참조변수명.변수명
		s1.count = 100; // 이렇게도 접근 가능
		s1.age = 100;
		System.out.println("s1.id: "+s1.id); // aaa
		System.out.println("s1.count: "+s1.count); // 100
		System.out.println("s1.age: "+s1.age); // 100
		
		Stu s2 = new Stu(); // 객체 선언
		s2.id = "bbb"; // 인스턴스(객체) 변수: 객체 선언 후, 참조변수명.변수명
		s2.count = 500; // 이렇게도 접근 가능
		s2.age = 500;
		System.out.println("s2.count: "+s2.count); // 500
		System.out.println("s1.count: "+s1.count); // 500
		System.out.println("s2.age: "+s2.age); // 500
		

	}

}
