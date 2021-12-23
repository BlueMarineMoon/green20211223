package day17;

import java.util.Scanner;


public class Grade {
	private int math;
	private int science;
	private int english;
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average() {
		return (math + science + english) / 3;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수를 입력하세요 >>> ");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균점수는 " + me.average());
		
		scan.close();
	}

}
