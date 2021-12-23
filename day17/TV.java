package day17;

public class TV {

	private String brand;
	private int year;
	private int inch;
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	
	public static void main(String[] args) {
		// LG에서 만든 2017년형 32인치 TV
		
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();

	}

}
