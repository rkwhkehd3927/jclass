package j0121;

public class Ja0121_01 {
	
//	int x;
//	int y;

	public static void main(String[] args) {
		
		
		
		Circle c1 = new Circle();
		
		// 원넓이 = r*r*3.14
		double di = c1.r * c1.r * 3.14;
		System.out.println("넓이: "+di);
		c1.draw();
		
		// Circle(Point center,int r)
//		Point center = new Point(150,150);
		Circle c2 = new Circle(new Point(150,150),50);
		// 원넓이 = r*r*3.14
		double di2 = c2.r * c2.r * 3.14;
		System.out.println("넓이: "+di2);
		c2.draw();
		
		// Point[] p: 3개의 꼭지점을 알아야 넓이를 구할 수 있음
//		Point[] p = new Point[3];
//		p[0] = new Point(100,100);
//		p[1] = new Point(140,50);
//		p[2] = new Point(200,100);
		//
		Point[] p = {new Point(100,100),new Point(140,50),new Point(200,100)};
		//
		int[] arr = {1,2,3};
		int[] arr3 = new int[] {1,2,3};
		//
		int[] arr2 = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		
		Triangle t1 = new Triangle(p);
		
		
		
		
//		c.x = 100;
//		System.out.println(c.x);
		
		// 객체선언 - 포함관계
//		Point p = new Point();
//		p.x = 10;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);

	}

}
