package Ch01;

import java.util.Scanner;

class TV{
	String brandName;
	int year;
	int inch;

	public TV(String brandName, int year, int inch){
		this.brandName=brandName;
		this.year=year;
		this.inch=inch;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n",this.brandName,this.year,this.inch);
	}
}

class Grade{
	private int math;
	private int science;
	private int english;
	
	Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	public int average() {
		return (math+science+english)/3;
	}
}

class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	Song(int year,String country,String artist,String title) {
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	}
	
	public void show(){
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
}

class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public void show(){
		System.out.printf("(%d, %d)에서 크기가 %dx%d인 사각형\n",this.x,this.y,this.width,this.height);
	}
	int square() {
		return width*height;
	}
	
	boolean contains(Rectangle r) {
		if(x<r.x && y<r.y) {
			if((width+x)>(r.x+r.width)&&(height+y)>(r.y+r.height)) {
				return true;
			}
		}return false;
	}
}

class Circle{
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.printf("(%.1f, %.1f) %d\n",this.x,this.y,this.radius);
	}
}

public class C09Ex {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//TV
//		TV myTV = new TV("LG", 2017, 32); 
//		myTV.show();//LG에서 만든 2017년형 32인치 TV 이 출력

		//Grade
//		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//		int math=sc.nextInt();
//		int science=sc.nextInt();
//		int english=sc.nextInt();
//		Grade me = new Grade(math, science, english);
//		System.out.println("평균은 "+me.average());	
		
		//Song
//		Song song=new Song(1978,"스웨덴","ABBA","Dancing Queen");
//		song.show();
		
		//Rectangle
//		Rectangle r=new Rectangle(2, 2, 8, 7);
//		Rectangle s=new Rectangle(5, 5, 6, 6);
//		Rectangle t=new Rectangle(1, 1, 10, 10);
//		   
//		r.show();
//		System.out.println("s의 면적은 "+s.square());
//		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
		//CircleManager
		Circle c[]=new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			int radius=sc.nextInt();
			c[i]=new Circle(x,y,radius);
		}
			
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
		
		
		
		
		
		sc.close();
	}
}




//
//	--------------------------------------------
//	문제 - 이것이자바다
//	--------------------------------------------
//	https://scksk.tistory.com/6
//
//	클래스 기본문제
//	1~7번 확인하기 
//
//	12번-16번 확인하기
//
//	--------------------------------------------
//	--추가(명품자바)
//	--------------------------------------------
//	https://security-nanglam.tistory.com/213
//
//
//	--------------------------------------------
//	--추가
//	--------------------------------------------
//	https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
//

