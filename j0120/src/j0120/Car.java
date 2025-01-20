package j0120;

public class Car {
	
	Car(){ // 기본 생성자
		this("white","auto",4); // (this)다른 생성자 호출
		color = "black";
		gearType = "auto";
		door = 4;
	}
	
	Car(String c, String g,int d){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	String color;
	String gearType;
	int door;
	

}
