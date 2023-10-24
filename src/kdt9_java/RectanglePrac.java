package kdt9_java;
import java.util.*;
public class RectanglePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Rectangle> rect = new ArrayList<>();
		int count = 0;
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요. ");
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
			
			System.out.println("가로 길이는 :"+rect.get(i).getWidth());
			System.out.println("세로 길이는 :"+rect.get(i).getHeight());
			System.out.println("사각형의 넓이: "+ rect.get(i).result(rect.get(i).getWidth()));
			System.out.println("----------------------");
		}
		System.out.println("Rectangle 인스턴스의 개수는: " +Rectangle.getCount());
	}

}
