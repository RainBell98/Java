package kdt9_java;

public class Rectangle {
	private int width,height;
	private static int count;
	public Rectangle(int width) {
		this.width = width;
		count+=1;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int result (int width) {
		return this.height*width;
	}
	
	public static int getCount() {
		return count;
	}
	
}
