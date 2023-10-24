package kdt9_java;

public class Car {
	private int speed;
	
	//접근제어자
	//public: 같은 클래스o,같은 패키지o,자식 클래스o, 전체o
	//protected: 같은 클래스o,같은 패키지o, 자식 클래스o, 전체x
	//default: 같은 클래스o,같은 패키지o
	//private: 같은 클래스o
	
	
	//생성자
	public Car(int speed) {
		this.speed = speed;
	}
	
	
	
	public void start() {
		System.out.println("Car Start");

	}
	
	public void increaseSpeed(int speed) {
		this.speed += speed;
	}
	
	//setter메소드
	public void setSpeed(int speed) {
		// 유효성검사
		if(speed>0) {
			this.speed = speed;
		}
	}
	//getter메소드
	public int getSpeed() {
		return this.speed;
	}
}
