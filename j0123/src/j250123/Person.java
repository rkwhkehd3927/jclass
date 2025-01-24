package j250123;

public class Person {
	long id; // 주민번호
	String name; // 이름
	
	Person(){}
	Person(long id){ // id만 받는 메소드
		this.id = id;
	}
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { // 비교대상의 객체
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	
	@Override // Object클래스 메소드
	public String toString() {
		return id+"";
	}
}
