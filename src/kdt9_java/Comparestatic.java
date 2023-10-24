package kdt9_java;

//static ���� ���
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

//static �ִ� ���
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

//static �޼ҵ�
class MathUtil{
	private static double PI = 3.14;
	
	//�޼ҵ�
	public static double circle(double radius) {
		return PI*radius*radius;
	}	
}


public class Comparestatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutStatic a = new WithoutStatic("ȫ�浿");
		WithoutStatic b = new WithoutStatic("�̸���");
		
		System.out.println("Without Static");
		System.out.println("ȫ�浿 : "+a.getRegistered());
		System.out.println("�̸��� : "+b.getRegistered());
		
		
		WithStatic c = new WithStatic("������");
		WithStatic d = new WithStatic("�Ӳ���");
		
		System.out.println("With Static");
		System.out.println("������ : "+c.getRegistered());
		System.out.println("�Ӳ��� : "+d.getRegistered());
		
		//MathUtil math = new MathUtil();
		//static �޼ҵ�� ��ü �������� ���� ����
//		MathUtil.circle(3.3)
		System.out.println(MathUtil.circle(3.3));
	}

}
