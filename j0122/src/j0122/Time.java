package j0122;

public class Time {
	Time(){}
	Time(int hour,int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	private int hour; // private 을 붙여서 변수에 바로 접근하지 못하도록 함
	private int minute;
	private int second;
	
	void setHour(int hour) {
		this.hour = hour;
	}
	int getHour() {
		return hour;
	}
	
	void setMin(int minute) {
		this.minute = minute;
	}
	
	int getMin() {
		return minute;
	}
	
	void setSec(int second) {
		this.second = second;
	}
	
	int getSec() {
		return second;
	}
}
