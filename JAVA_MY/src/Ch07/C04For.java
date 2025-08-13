package Ch07;

import java.util.Scanner;

public class C04For {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//1~N까지의 합
//		System.out.print("1~N까지의 합 구하기 (N 입력) : ");
//		int n=sc.nextInt();
//		int sum=0;
//		
//		for(int i=0;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.printf("1~%d까지의 총합 : %d",n,sum);

		
		//N~N까지의 합 (N>=M 인경우 Swap 수행)
//		System.out.print("N~N까지의 합 구하기 (N, M 입력) : ");
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int sum=0;
//		
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		for(int i=n;i<=m;i++) {
//			sum+=i;
//		}
//		System.out.printf("%d~%d까지의 총합 : %d",n,m,sum);
		
		
		//별찍기
//		for(int i=0;i<4;i++) {	
//			for(int j=0;j<i+1;j++) 
//				System.out.print("*");
//			System.out.println();
//		}
		
		
		//다이아몬드 만들기
		System.out.print("아래위 피라미드 높이 지정 : ");
		int h = sc.nextInt();
		
		while(h%2==0) {
			System.out.print("홀수만 입력하세요.\n아래위 피라미드 높이 지정 : ");
			h = sc.nextInt();
		}
		
		for(int i=0; i<h; i++) {
			if(i<=(h/2)) {
				for(int j=0; j<(h/2)-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<=2*i; k++) {
					System.out.print("*");
				}
			} else {
				for(int j=0; j<=i-(h/2+1); j++) {
					System.out.print(" ");
				}
				for(int k=0; k<=((h-1)*2)-2*i; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
