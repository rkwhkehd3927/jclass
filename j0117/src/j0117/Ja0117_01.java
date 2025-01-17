package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		Tv t1 = new Tv(); // 클래스 Tv.java 안에 들어있는 내용을 전부 t1 에 담기
		t1.color = "red"; // t1 = 참조 변수
		t1.power = false;
		t1.channel = 7;
		
//		String color = "red"; // color = 그냥 변수
//		boolean power = true;
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재채널: "+t1.channel);

	}

}
