package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99)); // 1명 입력
//		list.add(new Stu("유관순",98,90,99)); // 1명 입력
//		list.add(new Stu("이순신",80,90,100)); // 1명 입력
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//		
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo()+","+s.getName());
//			
//		}
		
		
//		HashSet set = new HashSet(); // 순서가 없어서 for 문 불가
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//		
//		Iterator i = set.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
//		i = set.iterator(); // 출력은 무조건 1번더 사용해야함. iterator는 일회성임
//		Iterator i2 = set.iterator();
//		while(i2.hasNext()){
//			System.out.println(i2.next());
//		}
		
		
		// Map
		
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99)); // 1명 입력
		list.add(new Stu("유관순",98,90,99)); // 1명 입력
		
//		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, Object> map = new HashMap<String, Object>(); // Object 를 넣어주면 list 가능
		map.put("userId", "aaa");
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
		map.put("list", list); // Object
		
		System.out.println("id: "+map.get("userId2")); // 키값이 없으면 null // null
		System.out.println("id: "+map.get("userId")); // 키값이 있으면 제대로 출력 // aaa
		System.out.println("pw: "+map.get("userPw")); // 키값이 있으면 제대로 출력 // 1111
		System.out.println("list: "+map.get("list")); // list는 이렇게는 제대로 출력 안됨
		
		// list 를 출력하려면 list 타입으로 형변환 해줘야 가능(현재 Object 타입)
		ArrayList list2 = (ArrayList)map.get("list");
		
		for(int i=0;i<list2.size();i++) {
			Stu s = (Stu)list2.get(i);
			System.out.println(s.getNo()+","+s.getName());
			
		}
		
		
		

	}

}
