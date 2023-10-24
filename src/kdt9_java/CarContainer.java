package kdt9_java;

public class CarContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car bmw = new Car(30);		
		Car kia = new Car(20);
		
		//肋给等 立辟 规过
//		bmw.speed = 120;
//		kia.speed = 90;
		bmw.start();
		kia.start();
		
//		bmw.setSpeed(120);
//		kia.setSpeed(90);
		
		bmw.increaseSpeed(100);
		kia.increaseSpeed(80);
		
		
		System.out.println("bmw : "+bmw.getSpeed() );
		System.out.println("kia : "+kia.getSpeed() );
		
		
		
	}
}
