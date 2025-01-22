package j0122;

import stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		
		// private - 같은 클래스, default - 같은클래스, 같은패키지
		// protected - 같은 클랫, 같은 패키지, 자손클래스 public-전체
//		Car c = new Car();
////		System.out.println(c.color);
//		System.out.println(c.getColor());
//		Car c2 = new Car("white","auto",5);
////		System.out.println(c2.color);
//		System.out.println(c2.getColor());
////		c2.door = -50;
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());
//		Shape s = new Shape();
		
//		Time t1 = new Time(12,05,10);
////		System.out.println(t1.hour);
//		System.out.println(t1.getHour());
//		t1.setHour(t1.getHour()+1);
//		System.out.println(t1.getHour());
		
		// 17시 35분 30초를 입력하여 출력
		Time t2 = new Time(17,35,30);
		System.out.printf("%d시 ",t2.getHour());
		System.out.printf("%d분 ",t2.getMin());
		System.out.printf("%d초 ",t2.getSec());

	}

}
