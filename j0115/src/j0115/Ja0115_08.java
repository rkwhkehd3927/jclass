package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		//~~~~~~~ 1-10까지 중 랜덤숫자를 받아 동일한 번호가 없게 저장
		int[] num = new int[10]; // 10개의 공간이 있는 배열 선언 및 생성
		int i = 0;
		
		loop:while(i<10) {
			int ranNum = (int)(Math.random()*10)+1; // 1-10 중 랜덤숫자
			for(int j=0;j<i;j++) {
				if(num[j]==ranNum) { // 랜덤으로 뽑힌 숫자와 num에 저장된 숫자가 같으면
					System.out.println("동일한 숫자가 있습니다. "+ranNum);
					continue loop;
				}
			}
			// 배열에 랜덤 숫자 저장
			num[i] = ranNum;
			i++; // i에 +1
		}
		
		System.out.print("랜덤 숫자: ");
		for(int j=0;j<num.length;j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();
		
		
		
		//~~~~~~ 배열을 랜덤섞기 출력하는 방법
		
		int[] num2 = new int[10];
		// 입력
		for(int j=0;j<10;j++) {
			num2[j] = j+1;
//			int ranNum2 = (int)(Math.random()*10);
		}
		// 섞기
		int temp = 0;
		for(int j=0;j<300;j++) {
			int ran = (int)(Math.random()*10);
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}
		System.out.print("랜덤 숫자: ");
		for(int j=0;j<10;j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();	
		
	}	
	
		

}
