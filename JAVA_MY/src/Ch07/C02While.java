package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		//2단 - 9단 출력 (2x9,2x8 ,.... 9x9 ,...9x1)
//		int i=2,dan=1;
//		while(i<10) {
//			dan=1;
//			while(dan<10) {
//				System.out.printf("%dx%d=%d\n",i,dan,i*dan);
//				dan++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//9단 - 2단( 9x9 9x8 - 2x1)
//		int i=9,dan=9;
//		while(i>=2) {
//			dan=9;
//			while(dan>=1) {
//				System.out.printf("%dx%d=%d\n",i,dan,i*dan);
//				dan--;
//			}
//			System.out.println();
//			i--;
//		}
		
		
		//2~N단 구구단 출력
//		System.out.println("몇단까지의 구구단 출력할것인가? : ");
//		int n=sc.nextInt();
//		int i=2,dan=1;
//		
//		while(i<=n) {
//			dan=1;
//			while(dan<10) {
//				System.out.printf("%dx%d=%d\n",i,dan,i*dan);
//				dan++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//N단 - M단(N<M , N<9 , M<9)
		System.out.println("시작 구구단 입력 : ");
		int n1=sc.nextInt();
		System.out.println("끝 구구단 입력 : ");
		int n2=sc.nextInt();
		
		while(n1<2 || n1>9 || n2<2 || n2>9) {
			System.out.println("2~9단까지만 가능합니다.\n시작 구구단 입력 : ");
			n1=sc.nextInt();
			System.out.println("끝 구구단 입력 : ");
			n2=sc.nextInt();
		}
		
		int i=n1,dan=1;
		
		if(n1>n2) {
			int tmp=n1;
			n1=n2;
			n2=tmp;
		}
		
		while(i<=n2) {
			dan=1;
			while(dan<10) {
				System.out.printf("%dx%d=%d\n",i,dan,i*dan);
				dan++;
			}
			System.out.println();
			i++;
		}
		
		sc.close();
	}

}
