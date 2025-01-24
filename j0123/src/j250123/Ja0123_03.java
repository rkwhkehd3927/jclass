package j250123;

public class Ja0123_03 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
//			Exception e = new Exception("에러 발생");
			throw new Exception(); // 고의로 에러 발생
//		 System.out.println(3/0); // error
			// 정상적으로 돌아가는 프로그램 구현
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 에러가 났을때 에러위치, 에러 설명
			// 에러가 났을때 실행 되는 부분
			System.out.println("4-2");
		}
		System.out.println(5);
		System.out.println(6);
	}

}
