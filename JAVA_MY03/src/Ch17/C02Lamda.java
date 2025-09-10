package Ch17;

import java.util.Scanner;

interface Printer{
//	void print(String name);	//추상메서드 (상속관계를 만들어서 하위클래스가 완성)
//	String print(String message);
	String print();
}

public class C02Lamda {

	public static void main(String[] args) {
		
		//01
//		Printer printer=(message)->{System.out.println("01."+message);};
//		printer.print("안녕!");
		
		//02
//		Printer printer2=(message)->{return message+"안녕!";};	 // 람다식 입력
		
//		Printer printer2=message->"안녕 "+message; 	//람다식 입력2
//		String str=printer2.print("HELLO WORLD");
//		System.out.println(str);
		
		//03
		Printer printer3=()->{
			//Scanner 생성
			Scanner sc=new Scanner(System.in);
			
			//키보드로 문자열 받기
			System.out.print("입력 : ");
			String mg=sc.next();
			
			//입력된값 리턴
			return mg;
			
		};
		System.out.println(printer3.print());
		
		
	}

}
