package java_oop;

public class Wheel4 extends Vehicle{
	private String color;
	public Wheel4(String name, int wheel,String color) {
		super(name,wheel);
		this.color = color;
	}
	
	public String toString() {
		return "�̵����� ����: "+super.getName()+" ,���� ��: "+super.getWheel()+  " ,���� : "+color;
	}
}
