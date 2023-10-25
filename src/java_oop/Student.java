package java_oop;

public class Student extends Person{
	
	private String major;
	
	public Student(String name,int age,String major) {
		//super(): ����Ŭ�������� ����Ŭ���� �����ڸ� ȣ���ϴµ� ���
		//superŰ����� ���� Ŭ������ �޼ҵ带 ȣ���ϴµ� ���
		super(name,age);
//		setAge(age);
		this.major = major;
	}
	
	@Override
	public String toString() {
//		return "Student / super: "+super.toString()+", major: "+major;
		return "Student / name: "+super.getName()+", age: "+super.getAge()+", major: "+major;
	}
}
