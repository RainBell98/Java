package kdt9_java;

//static 없는 경우
class WithoutStatic{
	private int registered = 0;
	private String name;
	
	public WithoutStatic(String name) {
		this.name = name;
		registered+=1;
	}
	
	public int getRegistered() {
		return registered;
	}
}

//static 있는 경우
class WithStatic{
	private static int registered = 0;
	private String name;
	
	public WithStatic(String name) {
		this.name = name;
		registered +=1;
	}
	public int getRegistered() {
		return registered;
	}
}

//static 메소드
class MathUtil{
	private static double PI = 3.14;
	
	//메소드
	public static double circle(double radius) {
		return PI*radius*radius;
	}	
}


public class Comparestatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutStatic a = new WithoutStatic("홍길동");
		WithoutStatic b = new WithoutStatic("이몽룡");
		
		System.out.println("Without Static");
		System.out.println("홍길동 : "+a.getRegistered());
		System.out.println("이몽룡 : "+b.getRegistered());
		
		
		WithStatic c = new WithStatic("성춘향");
		WithStatic d = new WithStatic("임꺽정");
		
		System.out.println("With Static");
		System.out.println("성춘향 : "+c.getRegistered());
		System.out.println("임꺽정 : "+d.getRegistered());
		
		//MathUtil math = new MathUtil();
		//static 메소드는 객체 생성없이 접근 가능
//		MathUtil.circle(3.3)
		System.out.println(MathUtil.circle(3.3));
	}

}
