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
//		System.out.println("시작 구구단 입력 : ");
//		int n1=sc.nextInt();
//		System.out.println("끝 구구단 입력 : ");
//		int n2=sc.nextInt();
//		
//		while(n1<2 || n1>9 || n2<2 || n2>9) {
//			System.out.println("2~9단까지만 가능합니다.\n시작 구구단 입력 : ");
//			n1=sc.nextInt();
//			System.out.println("끝 구구단 입력 : ");
//			n2=sc.nextInt();
//		}
//		
//		int i=n1,dan=1;
//		
//		if(n1>n2) {
//			int tmp=n1;
//			n1=n2;
//			n2=tmp;
//		}
//		
//		while(i<=n2) {
//			dan=1;
//			while(dan<10) {
//				System.out.printf("%dx%d=%d\n",i,dan,i*dan);
//				dan++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.println();	//줄바꿈(개행)
//		System.out.print("*");	//별찍기
		
		//별찍기(기본높이:4)
		
		//*****
		//*****
		//*****
		//*****
		
//		i(개행)		j(별)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		-----------------------------
//		i=0			j=0	
//		i++			j++
//		i<4			j<5
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int i=0, j=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//높이 : h
		//*****
		//*****
		//*****
		//*****
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		높이 : h
//		i(개행)		j(별)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		h
//		-----------------------------
//		i=0			j=0	
//		i++			j++
//		i<h+1		j<5
		
//		System.out.print("별의 높이를 입력하세요 : ");
//		int h=sc.nextInt();
//		int i=0,j=0;
//		
//		while(i<h) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//*
		//**
		//***
		//****
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int i=0, j=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		높이 : h
//		*
//		**
//		***
//		****
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.print("반피라미드 별의 높이를 입력하세요 : ");
//		int h=sc.nextInt();
//		int i=0, j=0;
//		
//		while(i<h) {
//			j=0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//****
		//***
		//**
		//*
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		int i=0, j=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		높이 : h
		//****
		//***
		//**
		//*
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.print("거꾸로 반피라미드 별의 높이를 입력하세요 : ");
//		int h=sc.nextInt();
//		int i=0, j=0;
//		
//		while(i<h) {
//			j=0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//   *
		//  ***
		// *****
		//*******
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0		
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		---------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<3-i		k<=2*i
		
//		int i=0, j=0,k=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		높이 : h
		//   *
		//  ***
		// *****
		//*******
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.print("피라미드 별의 높이를 입력하세요 : ");
//		int h=sc.nextInt();
//		int i=0, j=0;
//		
//		while(i<h) {
//			j=0;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//*******
		// *****
		//  ***
		//   *
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		int i=0;
//		
//		while(i<4) {
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<7-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		높이 : h
		//*******
		// *****
		//  ***
		//   *
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.print("거꾸로 피라미드 별의 높이를 입력하세요 : ");
//		int h=sc.nextInt();
//		int i=0;
//		
//		while(i<h) {
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		-----------------------------------------
//		i<4			j=0			k=0
//					j++			k++
//					j<3-i		k<=2*i
//
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		-----------------------------------------
//		i>=4		j=0			k=0
//					j++			k++
//					j<=i-4		k<= 12-2*i
		
		//while 한번사용
//		int i=0,j=0,k=0;
//				
//		while(i<7) {
//			if(i<4) {
//				j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				System.out.println();
//				i++;
//			}
//			else {
//				j=0;
//				while(j<i-3) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<=12-2*i) {
//					System.out.print("*");
//					k++;
//				}
//				System.out.println();
//				i++;
//			}
//		}
				
		//while 두번사용
//		int i=0,j=0,k=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		i=0;
//		while(i<3) {
//			j=0;
//			while(j<i+1) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k<5-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		높이 : h
		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		System.out.print("아래위 피라미드 높이 지정 : ");
		int h = sc.nextInt();
		
		int i=0, j=0, k=0;
		
		while(h%2==0) {
			System.out.print("홀수만 입력하세요.\n아래위 피라미드 높이 지정 : ");
			h = sc.nextInt();
		}

		while (i<h) {
		    if (i<=(h/2)) { // 윗부분
		        j=0;
		        while (j<(h/2)-i) {
		            System.out.print(" ");
		            j++;
		        }
		        k=0;
		        while (k<=2*i) {
		            System.out.print("*");
		            k++;
		        }
		    } else { // 아랫부분
		        j=0;
		        while (j<=i-(h/2+1)) {
		            System.out.print(" ");
		            j++;
		        }
		        k=0;
		        while (k<=((h-1)*2)-2*i) {
		            System.out.print("*");
		            k++;
		        }
		    }
		    System.out.println();
		    i++;
		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//*******
		// *****
		//  ***
		//   *			
		//  ***
		// *****		
		//*******
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int i=0,j=0,k=0;
//		
//		while(i<7) {
//			if(i<4) {
//				j=0;
//				while(j<i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<7-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else {
//				j=0;
//				while(j<6-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<=2*i-6) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}                              
		
		
		sc.close();
		
	}
	
}
