package j250123;

public class Ja0123_04 {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		System.out.println(1);
		method1();
		System.out.println(7);
		System.out.println(8);
		System.out.println("프로그램 종료");

	}
	
	static void method1() {
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0); // error
			System.out.println(5);
			throw new Exception(); // 고의로 에러 발생
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(5);
		}
		
	}

}
