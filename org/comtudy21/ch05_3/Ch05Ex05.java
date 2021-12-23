package org.comtudy21.ch05_3;

class People {
	// 이름, 나이, 직업이 저장되는 필드
	private String name;
	private int age;
	private String job;
	
	// People의 생성자 (생성자 오버로딩) - - 매개변수는 지역변수이다.
	public People(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public People() {
		this("", 0, "");
	}
	
	
	public void showInfo() {
		System.out.printf("People [성명=%s, 나이=%d, 직업=%s]", name, age, job);	
	}
	
	public void setInfo(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	
}

public class Ch05Ex05 {

	public static void main(String[] args) {
		People people1 = new People("홍길동", 23, "의적");
		people1.showInfo(); // 필드의 값을 출력.

		People people2 = new People();
		people2.setInfo("이순신", 35, "장군");
		people2.showInfo();
	}

}
