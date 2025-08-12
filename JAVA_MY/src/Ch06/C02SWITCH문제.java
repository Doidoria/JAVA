package Ch06;

import java.util.Scanner;

public class C02SWITCH문제 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("자신의 등수를 입력하세요 : ");
		int ranking=sc.nextInt();
		String medalColor = null;
		if(ranking<4) {
			switch(ranking) {
			case 1:
				medalColor="Gold";
				System.out.println("메달 색상 : G");
				break;
			case 2:
				medalColor="Silver";
				System.out.println("메달 색상 : S");
				break;
			case 3:
				medalColor="Bronze";
				System.out.println("메달 색상 : B");
				break;
			}
			System.out.println(ranking+"등 메달의 색은 "+medalColor+"입니다.");
		} else {
			System.out.println(ranking+"등의 메달은 없습니다.");
		}
		
	}

}
