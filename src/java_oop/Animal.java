package java_oop;

public class Animal {
	private String sp,name;
	private int age;
	public Animal(String sp, String name, int age) {
		super();
		this.sp = sp;
		this.name = name;
		this.age = age;
	}
	
	public String getSp() {
		return sp;
	}

	public String makeSound() {
		return "동물은 소리를 낸다.";
	}
}
