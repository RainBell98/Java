package kdt9_java;
import java.util.*;
public class RectanglePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Rectangle> rect = new ArrayList<>();
		int count = 0;
		while(true) {
			System.out.println("�簢���� ���ο� ���� ���̸� ���� �������� �Է����ּ���. ");
			int width = in.nextInt();
			int	height = in.nextInt();
			
			Rectangle rec = new Rectangle(width);
			rec.setHeight(height);
			
			if(rec.getWidth() ==0 && rec.getHeight() == 0) {
				break;
			}
			rect.add(rec);	
		}
		for (int i = 0; i < rect.size(); i++) {
			
			System.out.println("���� ���̴� :"+rect.get(i).getWidth());
			System.out.println("���� ���̴� :"+rect.get(i).getHeight());
			System.out.println("�簢���� ����: "+ rect.get(i).result(rect.get(i).getWidth()));
			System.out.println("----------------------");
		}
		System.out.println("Rectangle �ν��Ͻ��� ������: " +Rectangle.getCount());
	}

}
