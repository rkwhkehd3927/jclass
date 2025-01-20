package j0120;

public class Ja0120_06 {
	
//	long add() { // 인스턴스 메소드
//		return a+b;
//	}
	static int bb = 0;
	int aa = 0; // 인스턴스 변수

	public static void main(String[] args) { 
//		int total = 1;
//		for(int i=1;i<=5;i++) {
//			total = total * 1;
//		}
//		System.out.println(total);
		
		Ja0120_06 j = new Ja0120_06(); // 객체선언 후
		System.out.println(Ja0120_06.fac(5)); // 클래스명.메소드명() // 120
		System.out.println(fac(5)); // 근데 같은 클래스 내 일때는  클래스명 생략가능 // 120

	}
	static long fac(int n) { // 클래스 메소드
		long result = 0; // 지역변수
		if(n==1) {
			result = 1;
		} else {
			result = n * fac(n-1);
		}
		return result;
	}
		

}
