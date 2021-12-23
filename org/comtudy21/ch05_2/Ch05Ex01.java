package org.comtudy21.ch05_2;


class Point {
	private int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}


class colorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		super.showPoint();
		System.out.print(color);
	}
}

class Point3D extends Point {
	private int z;
	
	public void set(int x, int y, int z) {
		super.set(x,y);
		this.z = z;
		
	}
	public void showPoint() {
		super.showPoint();
		System.out.print(z);
	}
}

public class Ch05Ex01 {
	// point클래스, colorPoint, point3D 클래스 구현 실습.	
	
	public static void main01(String[] args) {
		Point p = new Point();
		
		p.set(10, 20);
		p.showPoint();

	}
	
	public static void main(String[] ages) {
		colorPoint cp = new colorPoint();
		
		cp.set(30,40);
		cp.setColor("red");
		cp.showColorPoint();
		
	}
	
	public static void main03(String[] ages) {
		Point3D pd = new Point3D();
		
		pd.set(10, 20, 30);
		pd.showPoint();
	}

}
