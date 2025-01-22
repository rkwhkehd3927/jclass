package j0122;

public class Singleton {
	
	// 같은 클래스에서만 사용 가능
	private static Singleton s = new Singleton();
	private Singleton(){}
	private int num;
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
	
	
	public static Singleton getInstance() {
		return s;
	}
	
}
