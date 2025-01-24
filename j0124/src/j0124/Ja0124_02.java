package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class Ja0124_02 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,100)); // 1명 입력
//		list.add(new Stu("유관순",90,90,90)); // 1명 입력
//		list.add(new Stu("이순신",95,95,95)); // 1명 입력
//		list.add(new Stu("강감찬",93,93,93)); // 1명 입력
//		list.add(new Stu("김구",80,80,80)); // 1명 입력
//		list.add(new Stu("홍길자",70,70,70)); // 1명 입력
//		list.add(new Stu("홍길순",75,75,75)); // 1명 입력
		
//		for(int i=0; i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d] \n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		// 숫자 정렬
//		list.sort(new Comparator<Stu>() { // 인터페이스
//			@Override // 숫자 비교
//			public int compare(Stu s1, Stu s2) {
//				return s1.getTotal()-s2.getTotal();
//			}; 
			
//		});
		
		// 문자열 정렬
		list.sort(new Comparator<Stu>() { // 인터페이스
			// @(at sign) annotation - 주석, 스프링에서는 명령어 개념
			@Override // 문자열 비교, 
			public int compare(Stu s1, Stu s2) {
				return s2.getName().compareTo(s1.getName()); // 역순 정렬
//				return s1.getName().compareTo(s2.getName()); // 순차 정렬
			}; 
			
		});

//		System.out.println("------------------ 순차정렬(점수) -----------------");
		
//		for(int i=0; i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d] \n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		ArrayList<Stu> list = new ArrayList<Stu>(); // Stu만 들어올수 있도록 선언, 이렇게 쓰면 아래에서 형변환 생략가능
		
//		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,100)); // 1명 입력
//		list.add(1);
//		list.add(new Card());
		
		for(int i=0; i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d] \n",s.getNo(),s.getName(),s.getTotal());
			
			System.out.printf("[%d,%s,%d] \n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getTotal());
		}
		
		System.out.println("프로그램 종료");
		
	}

}
