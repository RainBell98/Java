package java_oop;

public class Dog extends Animal{
	private String sound = "¿Ð¿Ð";
	
	public Dog(String sp,String name,int age) {
		super(sp,name,age);
		this.sound = sound;
	}
	
	@Override
	public String makeSound() {
		return super.getSp()+" : "+sound;
	}
}
