package j0121;

public class Circle extends Shape { // Shape 상속

	// 생성자
	Circle(){
		this(new Point(0,0),100);
	}
	
	
	// new Point(150,150),50
	Circle(Point center,int r){ // Point center,int r : 매개변수
//		center = new Point(); // 지역변수에 값 넣기
		this.center = center; // 인스턴스변수에 값 넣기
		this.r = r;
		
	}
	
	// 인스턴스 변수 선언
	Point center; // 클래스 선언, center : 인스턴스 변수 
	int r;
}
