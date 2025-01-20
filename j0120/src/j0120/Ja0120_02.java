package j0120;

import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		// num 배열을 출력하시오
		// 객체선언
		
		Arr a = new Arr();
//		System.out.println(a.num); // 주소값: I@279f2327
		System.out.println(Arrays.toString(a.num)); // [1, 2, 3, 4, 5]
		cal(a.num);
		System.out.println(Arrays.toString(a.num)); // [11, 12, 13, 14, 15]

		
	}
	
	static void cal(int[] num) { // void = 리턴값 없다(?)
		// num 배열에 10을 더해서 값을 돌려줌
		for(int i=0;i<num.length;i++) {
			num[i] = num[i]+10;
			
		}
	}

}
