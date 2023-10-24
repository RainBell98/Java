package java_oop;

public class Cat extends Animal{
	private String sound = "¾ß¿Ë";
	
	public Cat(String sp,String name,int age) {
		super(sp,name,age);
		this.sound = sound;
	}
	
	@Override
	public String makeSound() {
		return super.getSp()+" : "+sound;
	}
}
