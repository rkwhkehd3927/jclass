package j0120;

public class Ja0120_05 {

	public static void main(String[] args) {
		
		
		// name, kor를 보내서 데이터를 입력받아, 3명의 각 국어점수 출력
	
		// 객체 선언
		Cal4 c = new Cal4();
		String[] name = new String[3];
		int[] kor = new int[3];
		
		c.input(name,kor);
		for(int i=0;i<name.length;i++) {
			System.out.printf("[%s,%d]",name[i],kor[i]);
		}
		
		

	}

}
