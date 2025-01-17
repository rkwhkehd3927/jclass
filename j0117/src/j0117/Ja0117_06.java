package j0117;

public class Ja0117_06 {

	static int c = 0; // 1. 클래스 변수 - 프로그램이 실행되면 사용 가능
	int num = 10; // 2. 인스턴스 변수 - 객체 선언을 해야 사용 가능
	
	public static void main(String[] args) {
		
		Stu.count =1;
		System.out.println(Stu.count);
		
		int a = 5; // 3. 지역변수 - 객체 선언을 해야 사용 가능
		System.out.println(a);

		
		// 1-100 까지의 합
		// 200 을 넘는 시점의 i의 값 출력
//		int sum = 0;
//		int temp = 0;
//		int sum2 = 0;
//		int temp2 = 0;
//		for(int i=0;i<=100;i++) {
//			sum += i;
//			if(sum>200) {
//				temp = i;
//				temp2 = i-1;
//				sum2 = sum-i;
//				break;
//			}
//		}
//		
//		// 200 바로 전 단계
//		System.out.println("200 넘는 곳의 i 값: "+temp2);
//		System.out.println("합계 : "+sum2);
//		
//		
//		// 200 넘는 시점
//		System.out.println("200 넘는 곳의 i 값: "+temp);
//		System.out.println("합계 : "+sum);
				
		
	
	}

}
