package j0120;

public class Ja0120_07 {

//	Ja0120_07(){} // 기본생성자
	
	public static void main(String[] args) {
		// ~~~~~~~~~~~ 1. 기본 생성자 사용의 경우
//		Cal c new Cal(); // 객체선언 - new Cal(): 생성자 호출
		Data1 d1 = new Data1();
		d1.value = 10;
		d1.name = "홍길동";
		d1.kor = 100;
		d1.eng = 90;
		d1.math = 88;
		System.out.println(d1.value);
		
//		Data2 d2 = new Data2(); // error
		Data1 dd2 = new Data1();
		dd2.value = 11;
		dd2.name = "유관순";
		dd2.kor = 80;
		dd2.eng = 100;
		dd2.math = 87;
		
		
		
		// ~~~~~~~~~~~ 2.
		Data2 d2 = new Data2(1,"홍길동",100,100,98); 
		Data2 d3 = new Data2(2,"유관순",98,99,100); 
		System.out.println(d2.value);

	}

}

// ~~~~~~~~~~~ 1.
class Data1{
	int value; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
}

// ~~~~~~~~~~~ 2. 생성자에 정의만 해주면 위에 프로그램이 아주 간단해짐
class Data2{
	int value;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
//	Data2(){} // 기본생성자
	Data2(int x,String n, int k,int e, int m){
		value = x;
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3.0;
	}
} // class
