package java_oop;

public class Student extends Person{
	
	private String major;
	
	public Student(String name,int age,String major) {
		//super(): 하위클래스에서 상위클래스 생성자를 호출하는데 사용
		//super키워드는 상위 클래스의 메소드를 호출하는데 사용
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
