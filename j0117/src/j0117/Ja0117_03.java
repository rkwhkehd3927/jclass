package j0117;

public class Ja0117_03 {

	int num; // 밖에도 변수 선언 가능, 클래스(인스턴스) 변수
	
	
	public static void main(String[] args) {
		
		Tv[] t = new Tv[3]; // 배열 선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		
		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		t1.channel = 7;
//		System.out.println("t1 채널: "+t1.channel);
//		t2.channel = 9;
//		System.out.println("t2 채널: "+t2.channel);
//		
//		t2 = t1; // 얕은복사, t1을 바꾸면 t2도 계속 바뀜
//		t2.channel = 100;
//		t1.channel = 50;
//		System.out.println(t1.channel); // 7,100
//		System.out.println(t2.channel); // 100,50
		
		
		
		

//		int[] a = new int[5]; // 배열도 하나의 객체선언이다. new 를 사용하기때문
		
		// void= 함수 , method main
		// method 안 지역변수 값이 할당되지 않으면 사용할 수 없음
		int a; // 지역 변수
		int b= 10;
		a = b;
		System.out.println(a);
		
		Tv t3 = new Tv();
		System.out.println(t3.channel);
		
		// 객체생성(객체선언)
		// 흰색, false, 7, 검정,true,10
		Tv t = new Tv();
		Tv t2 = new Tv();
		
		t.color = "흰색";
		t.power = false;
		t.channel = 7;
		
		t2.color = "검정";
		t2.power = true;
		t2.channel = 10; 
		
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(t);
		
		
		
	} 

}
