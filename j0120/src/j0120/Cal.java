package j0120;

public class Cal {
	
	int multi(int a, int b) {
		int result = a * b;
		return result;
	}
	
	int add(int a, int b) {
		int result = a + b;
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	double div(int a,int b) {
		// int 나누기 int는 int라서 둘중 하나에 double 붙여줘야함
		return a/(double)b;
	}
}
