package org.comtudy21.ch05;

class AAA extends Object{
	private int privateData;
	int defaultData;
	protected int protectedData;
	public int publicData;
	
}

class BBB extends AAA {
	public void set() {
		// private 멤버는 서브에서도 접근 불가능. 
		// privateData = 10;
		// 다른 패키지의 디폴트 멤버는 접근 불가능.
		// defaultData = 100;
		protectedData = 1000;
		publicData = 10000;
	}
}

public class Ch05Ex02 extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aaa = new AAA();
		
		System.out.println(aaa.toString());
		System.out.println(aaa.equals(null));
		
	}

}
