package java_oop;

public class Wheel2 extends Vehicle{
	private String color;
	public Wheel2(String name, int wheel,String color) {
		super(name,wheel);	
		this.color = color;
	}
	
	public String toString() {
		return "�̵����� ����: "+super.getName()+", ���� ��: "+super.getWheel()+ " ,���� : "+color;
	}
}
