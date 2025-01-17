package j0117;

public class Cal {

	
	
	int add(int a,int b) { // int a, int b: 지역변수
		int result = a+b;
		return result; 
	}
	int sub(int a,int b) {
		int result = a-b;
		return result;
	}
	void mult(int a, int b) {
		System.out.println("곱하기: "+a*b);
	}
}
