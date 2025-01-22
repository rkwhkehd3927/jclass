package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		// CaptionTv - text, caption()
		// Tv - power, channel, power(), channelUp(), channelDown()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제-APT";
		System.out.println("자막: "+c.text);
		c.caption();
		
		Tv t2 = new Tv();
//		t2.text = "자막 기능이 없음";
		Tv t = new CaptionTv(); // 첨에 t 공간은 있지만 쓸 수 없는 상태인데
		CaptionTv c3; // 참조변수 
		c3 = (CaptionTv)t; // 형변환
		c3.text = "aaa";
		System.out.println(c3.text);
		
		// error
		c3 = (CaptionTv)t2;
//		c3.text = "bbb"; // 공간이 없는데 억지로 넣어서, 실행 시 error
		
//		t.text=""; // error
//		CaptionTv c2 = new Tv(); // 자식의 참조변수 = 부모 객체 안됨 // error

	}

}
