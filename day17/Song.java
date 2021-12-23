package day17;

class Song1{
	private String title;
	private String artist;
	private int year;
	private String country;
	Song1() {
		this("title","artist",0000,"country");
	}
	Song1(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class Song {

	public static void main(String[] args) {
		Song1 song = new Song1("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();

	}

}
