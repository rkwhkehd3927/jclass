package j0120;

public class Cal3 {
	
	// void = return 없음
	void op(int a, int b,int[] re) { // re는 주소값을 받음
		re[0] = a+b;
		re[1] = a-b;
		re[2] = a * b;
	}

}
