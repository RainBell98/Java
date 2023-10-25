package java_oop;

public class Person {
	private String name;
	private int age;

	//������
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person / name: "+name+", age: "+ age;
	}
	
	//�����ε�
	public String toString(int a) {
		return "Person / name: "+name+", age: "+ a;
	}


}