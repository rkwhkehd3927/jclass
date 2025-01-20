package j0120;

public class Stuscore {
	
	// 초기화 블럭(거의 안씀)
	{ // 아래에서 반복되는거는 따로 뺄수있음
		++count;
		this.no = count;
	}
	
	// 1. 기본 생성자
	Stuscore(){ // 
//		this.no = count;
//		count++;
		} 
	
	// 2. 매개변수생성자
	Stuscore(String name,int kor, int eng, int math){
//		this.no = no;
//		this.no = count;
//		count++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	}
	// 학생성적
	static int count; // 클래스변수 - 객체선언 없이 클래스명. 변수명(공용)
	int no; // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",no,name,kor,eng,math,total,avg);
	}
	
}
