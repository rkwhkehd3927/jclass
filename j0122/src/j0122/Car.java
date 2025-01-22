package j0122;

public class Car extends Object {
	Car(){ // 기본생성자
//		super(); // 자동으로 알아서 붙는것
	}
	Car(String color, String gearType, int door){
//		super(); // 자동으로 알아서 붙는것
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	// 같은 클래스 내에서만 사용가능
//	private String color;
//	private int door;
	String color;
	String gearType;
	int door;

	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	void setDoor(int door) {
		if(door>0 && door<10) { // 조건으로 못들어가게 막아놓으면 데이터 보장가능(보안)
			this.door = door;
		}
	}
	
	int getDoor() {
		return door;
	}
	
	String getColor() {
//		if(user.id == "관리자") { // e.g. 관리자에게만 보여주겠다!(바로 접근하지 못하도록)
			
//		}
		return color;
	}
}
