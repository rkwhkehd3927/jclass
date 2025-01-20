package j0120;

import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {
//		int a = 20;
//		int b = 3;
		
//		Cal c = new Cal();
//		int result = c.multi(a, b);
//		System.out.println("result:" +result); // 60
		
		
//		int result2 = c.add(a, b);
//		System.out.println("result:" +result2); // 23
		
//		int result3 = c.sub(a, b);
//		System.out.println("result:" +result3); // 17
		
//		double result4 = c.div(a, b);
//		System.out.println("result:" +result4); // 6.66666666666666...
			
		
		// 입력 부분을 class 분리
//		Input i = new Input(); // 객체선언
		
//		int input = i.valInput();
//		int input2 = i.valInput();
//		System.out.println("입력값: "+input);
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// main method 에서 배열을 사용하여 5개를 입력받아 출력
		// 입력
//		int[] input5 = new int[5];
//		for(int j=0;j<input5.length;j++) {
//			input5[j] = i.valInput();
//		}
		// 출력
//		for(int j=0;j<input5.length;j++) {
//			
//			System.out.println("입력값: "+input5[j]);
//		}
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// Cal2 - strPrint()에서 이름을 입력받고 main method에서 str 변수로 넘겨받아 출력
//		Cal2 c = new Cal2();
//		String[] name = c.strPrint();
//		for(int j=0;j<name.length;j++) {
//			System.out.printf("%d번째 이름: %s \n",j+1,name[j]);
//		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 두 수를 Cal3에 보내고, +,-,*의 값을 리턴하여 출력
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		System.out.println(Arrays.toString(re)); // [0, 0, 0]
		c3.op(a, b, re); // re는 주소값을 클래스 Cal3로 보내는 것
		System.out.println(Arrays.toString(re)); // [13, 7, 30]
		
		
		
	}

}
