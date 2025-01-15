package j0115;

public class Ja0115_07 {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // 로또 숫자 넣을 배열
		
		int i=0;
		loop:while(i<6) { // 0-5
			int ranNum = (int)(Math.random()*45)+1; // 1-45 중에 랜덤 숫자
			// 동일한 숫자가 로또 배열에 있으면, 입력하지 않고, 다음으로 진행
			for(int j=0;j<i;j++) {
				if(lotto[j]==ranNum) {
					System.out.println("동일한 숫자가 있습니다." +ranNum);
					continue loop;
				}
			}
			lotto[i] = ranNum;
			i++;
		}
		
		System.out.println("로또번호 : ");
		for(int j=0;j<lotto.length;j++) {
			System.out.print(lotto[j]+" ");
		}
		System.out.println();
		
	}

}
