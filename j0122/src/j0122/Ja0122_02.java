package j0122;

import java.sql.Date;
import java.util.Calendar;

public class Ja0122_02 {

	public static void main(String[] args) {

		// 객체선언
		// 싱글톤패턴
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(); // 저장장소가 동일해서 얘를 바꾸면 s2,s3 값도 다바뀜
		System.out.println("s1: "+s1.getNum());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2: "+s2.getNum());
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3: "+s3.getNum());
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4: "+s4.getNum()); 
		s1.setNum(100);
		System.out.println("s1의 num 값을 변경");
		System.out.println("s2: "+s2.getNum());
		System.out.println("s4: "+s4.getNum()); 
		
//		
//		Car c1 = new Car(); // 얘는 얘만 바뀜
//		Car c2 = new Car();
//		Car c3 = new Car();
		
//		Date d = new Date();
//		System.out.println(d.toString());
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
//		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c1.getTime());
		

	}

}
