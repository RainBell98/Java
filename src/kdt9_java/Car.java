package kdt9_java;

public class Car {
	private int speed;
	
	//����������
	//public: ���� Ŭ����o,���� ��Ű��o,�ڽ� Ŭ����o, ��üo
	//protected: ���� Ŭ����o,���� ��Ű��o, �ڽ� Ŭ����o, ��üx
	//default: ���� Ŭ����o,���� ��Ű��o
	//private: ���� Ŭ����o
	
	
	//������
	public Car(int speed) {
		this.speed = speed;
	}
	
	
	
	public void start() {
		System.out.println("Car Start");

	}
	
	public void increaseSpeed(int speed) {
		this.speed += speed;
	}
	
	//setter�޼ҵ�
	public void setSpeed(int speed) {
		// ��ȿ���˻�
		if(speed>0) {
			this.speed = speed;
		}
	}
	//getter�޼ҵ�
	public int getSpeed() {
		return this.speed;
	}
}
